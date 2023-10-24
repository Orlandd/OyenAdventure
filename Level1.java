import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(405, 720, 1); 
        prepare();
    }
    
    private void prepare() {
        Cat cat = new Cat();
        addObject(cat, 500, 100);
        cat.setLocation(529,864);
        cat.setLocation(530,1800);
        cat.setLocation(527,1769);
        cat.setLocation(505,1839);
        cat.setLocation(231,668);
        

        Food food = new Food();
        addObject(food, Greenfoot.getRandomNumber(100) + Greenfoot.getRandomNumber(280) , 50);
        Cone cone = new Cone();
        addObject(cone,234,306);
        cone.setLocation(19,340);
        Cone cone2 = new Cone();
        addObject(cone2,177,304);
        cone2.setLocation(68,343);
        Cone cone3 = new Cone();
        addObject(cone3,321,345);
        cone3.setLocation(104,206);
        Cone cone4 = new Cone();
        addObject(cone4,183,200);
        cone4.setLocation(140,212);
        Cone cone5 = new Cone();
        addObject(cone5,273,204);
        cone5.setLocation(303,211);
        Cone cone6 = new Cone();
        addObject(cone6,391,241);
        cone6.setLocation(340,206);
        cone2.setLocation(65,341);
        cone.setLocation(24,345);
        cone2.setLocation(63,349);
        cone.setLocation(29,348);
        cone.setLocation(31,334);
        cone2.setLocation(60,337);
        Coin coin = new Coin();
        addObject(coin,125,344);
        Coin coin2 = new Coin();
        addObject(coin2,219,340);
        Coin coin3 = new Coin();
        addObject(coin3,333,341);
        coin3.setLocation(372,531);
        coin2.setLocation(324,538);
        coin.setLocation(281,539);
        Coin coin4 = new Coin();
        addObject(coin4,230,534);
        Coin coin5 = new Coin();
        addObject(coin5,176,536);
        Coin coin6 = new Coin();
        addObject(coin6,119,535);
        Coin coin7 = new Coin();
        addObject(coin7,47,531);
        Coin coin8 = new Coin();
        addObject(coin8,364,476);
        Coin coin9 = new Coin();
        addObject(coin9,313,478);
        Coin coin10 = new Coin();
        addObject(coin10,259,474);
        Coin coin11 = new Coin();
        addObject(coin11,216,478);
        Coin coin12 = new Coin();
        addObject(coin12,170,475);
        Coin coin13 = new Coin();
        addObject(coin13,115,481);
        Coin coin14 = new Coin();
        addObject(coin14,43,484);
        coin14.setLocation(29,477);
        coin7.setLocation(30,517);
        coin7.setLocation(29,529);
        coin13.setLocation(90,465);
        coin6.setLocation(93,527);
        coin8.setLocation(363,469);
        coin3.setLocation(364,527);
        coin12.setLocation(159,473);
        coin5.setLocation(155,526);
        coin11.setLocation(203,467);
        coin4.setLocation(212,534);
        coin10.setLocation(260,470);
        coin.setLocation(264,534);
        coin9.setLocation(315,472);
        coin2.setLocation(318,533);
        coin3.setLocation(372,536);
        coin8.setLocation(366,468);
        coin4.setLocation(209,534);
        coin11.setLocation(208,468);
        coin12.setLocation(151,474);
        coin5.setLocation(154,528);
        coin13.setLocation(84,471);
        Coin coin15 = new Coin();
        addObject(coin15,108,344);
        cone.setLocation(29,349);
        cone3.setLocation(101,219);
        cone6.setLocation(342,220);
        Coin coin16 = new Coin();
        addObject(coin16,199,344);
        coin15.setLocation(141,346);
        coin15.setLocation(141,346);
        Coin coin17 = new Coin();
        addObject(coin17,257,341);
        Coin coin18 = new Coin();
        addObject(coin18,306,343);
        coin17.setLocation(252,346);
        Coin coin19 = new Coin();
        addObject(coin19,357,343);
        Coin coin20 = new Coin();
        addObject(coin20,382,218);
        Coin coin21 = new Coin();
        addObject(coin21,21,216);
        Coin coin22 = new Coin();
        addObject(coin22,62,215);
        Coin coin23 = new Coin();
        addObject(coin23,177,218);
        cone.setLocation(19,342);
    }
    int speed = 2;
    public void act() {
        Car1 car1 = new Car1();
        car1.speed = -speed;
        
        Car2 car2 = new Car2();
        car2.speed = speed;
        
        if(Greenfoot.getRandomNumber(120)<2){
            addObject(car1,400 , 100); 
        }
        if(Greenfoot.getRandomNumber(90)<1){
            addObject(car2, 0, 155); 
        }
        
        if(Greenfoot.getRandomNumber(80)<2){
            addObject(car1,400 , 300); 
        }
        if(Greenfoot.getRandomNumber(90)<1){
            addObject(car2, 0, 400); 
        }
        
        if(Greenfoot.getRandomNumber(100)<2){
            addObject(car1,400 , 600); 
        }
        
    }
}
