import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(405, 720, 1); 
        prepare();
    }

    public void act() {
        Car1 car1 = new Car1();
        car1.speed = -4;
        
        Car2 car2 = new Car2();
        car2.speed = 4;

        if(Greenfoot.getRandomNumber(80)<2){
            addObject(car1,400 , 120); 
        }

        if(Greenfoot.getRandomNumber(100)<1){
            addObject(car1,400 , 170); 
        }
        if(Greenfoot.getRandomNumber(100)<2){
            addObject(car1,400 , 230); 
        }

        if(Greenfoot.getRandomNumber(100)<2){
            addObject(car2, 0, 470); 
        }
        
        if(Greenfoot.getRandomNumber(80)<1){
            addObject(car2, 0, 550); 
        }
        
        if(Greenfoot.getRandomNumber(200)<2){
            addObject(car2, 0, 600); 
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cat cat = new Cat();
        addObject(cat,220,642);
        cat.setLocation(196,690);

        Food food = new Food();
        addObject(food, Greenfoot.getRandomNumber(100) + Greenfoot.getRandomNumber(280) , 20);
        Tree tree = new Tree();
        addObject(tree,87,393);
        tree.setLocation(55,389);
        Tree tree2 = new Tree();
        addObject(tree2,129,408);
        tree2.setLocation(93,382);
        Tree tree3 = new Tree();
        addObject(tree3,283,352);
        tree3.setLocation(291,388);
        Tree tree4 = new Tree();
        addObject(tree4,313,371);
        tree4.setLocation(329,383);
        Tree tree5 = new Tree();
        addObject(tree5,173,344);
        tree5.setLocation(182,283);
        Tree tree6 = new Tree();
        addObject(tree6,242,284);
        tree6.setLocation(313,283);
        Tree tree7 = new Tree();
        addObject(tree7,79,305);
        tree7.setLocation(49,281);
        Cone cone = new Cone();
        addObject(cone,122,151);
        cone.setLocation(51,663);
        cone.setLocation(50,663);
        Cone cone2 = new Cone();
        addObject(cone2,134,622);
        cone2.setLocation(92,661);
        Cone cone3 = new Cone();
        addObject(cone3,234,545);
        cone3.setLocation(330,526);
        cone3.setLocation(330,526);
        Cone cone4 = new Cone();
        addObject(cone4,271,526);
        cone4.setLocation(291,533);
        Cone cone5 = new Cone();
        addObject(cone5,101,512);
        cone5.setLocation(57,533);
        Cone cone6 = new Cone();
        addObject(cone6,181,514);
        cone6.setLocation(96,532);
        Cone cone7 = new Cone();
        addObject(cone7,279,248);
        cone7.setLocation(357,71);
        Cone cone8 = new Cone();
        addObject(cone8,119,24);
        cone8.setLocation(147,67);
        Cone cone9 = new Cone();
        addObject(cone9,61,64);
        cone9.setLocation(104,74);
        Cone cone10 = new Cone();
        addObject(cone10,262,65);
        cone10.setLocation(316,73);
        Coin coin = new Coin();
        addObject(coin,157,537);
        Coin coin2 = new Coin();
        addObject(coin2,242,537);
        cone3.setLocation(333,524);
        cone3.setLocation(350,534);
        cone3.setLocation(349,532);
        cone3.setLocation(349,530);
        cone3.setLocation(349,530);
        Coin coin3 = new Coin();
        addObject(coin3,378,651);
        Coin coin4 = new Coin();
        addObject(coin4,306,650);
        Coin coin5 = new Coin();
        addObject(coin5,97,294);
        Coin coin6 = new Coin();
        addObject(coin6,244,296);
        Coin coin7 = new Coin();
        addObject(coin7,374,296);
        Coin coin8 = new Coin();
        addObject(coin8,211,80);
        Coin coin9 = new Coin();
        addObject(coin9,270,78);
        cone9.setLocation(83,75);
        cone8.setLocation(132,74);
        cone9.setLocation(75,77);
        cone8.setLocation(126,83);
        cone7.setLocation(365,82);
        Coin coin10 = new Coin();
        addObject(coin10,335,135);
        Coin coin11 = new Coin();
        addObject(coin11,81,162);
        Coin coin12 = new Coin();
        addObject(coin12,230,219);
        coin12.setLocation(241,219);
        coin12.setLocation(241,219);
        coin12.setLocation(242,219);
        coin8.setLocation(180,77);
        coin9.setLocation(270,80);
        coin10.setLocation(343,158);
        Coin coin13 = new Coin();
        addObject(coin13,153,400);
        Coin coin14 = new Coin();
        addObject(coin14,243,394);
        coin14.setLocation(248,399);
        coin14.setLocation(248,399);
        coin14.setLocation(248,398);
    }
}
