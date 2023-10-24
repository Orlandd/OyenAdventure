import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{

    /**
     * Constructor for objects of class Level5.
     * 
     */
    public Level5()
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
            addObject(car1,400 , 100); 
        }
        
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(car1,400 , 175); 
        }
        
        if(Greenfoot.getRandomNumber(100)<2){
            addObject(car1,400 , 250); 
        }

        if(Greenfoot.getRandomNumber(100)<2){
            addObject(car2, 0, 325); 
        }
        
        if(Greenfoot.getRandomNumber(80)<1){
            addObject(car2, 0, 400); 
        }
        
        if(Greenfoot.getRandomNumber(200)<2){
            addObject(car2, 0, 475); 
        }
        
        if(Greenfoot.getRandomNumber(80)<2){
            addObject(car1,400 , 550); 
        }
        if(Greenfoot.getRandomNumber(100)<1){
            addObject(car1,400 , 615); 
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

        Cone cone = new Cone();
        addObject(cone, 124, 252);
        cone.setLocation(35, 285);

        Cone cone2 = new Cone();
        addObject(cone2, 191, 253);
        cone2.setLocation(90, 285);

        Cone cone3 = new Cone();
        addObject(cone3, 181, 251);
        cone3.setLocation(148, 287);

        Cone cone4 = new Cone();
        addObject(cone4, 222, 259);
        cone4.setLocation(198, 286);

        Cone cone5 = new Cone();
        addObject(cone5, 300, 286);
        cone5.setLocation(258, 279);

        Cone cone6 = new Cone();
        addObject(cone6, 283, 319);
        cone6.setLocation(370, 281);

        Cone cone7 = new Cone();
        addObject(cone7, 159, 428);
        cone7.setLocation(43, 496);

        Cone cone8 = new Cone();
        addObject(cone8, 248, 427);
        cone8.setLocation(144, 488);

        Cone cone9 = new Cone();
        addObject(cone9, 243, 451);
        cone9.setLocation(198, 490);

        Cone cone10 = new Cone();
        addObject(cone10, 324, 463);
        cone10.setLocation(264, 496);

        Cone cone11 = new Cone();
        addObject(cone11, 320, 423);
        cone11.setLocation(318, 489);

        Cone cone12 = new Cone();
        addObject(cone12, 304, 375);
        cone12.setLocation(371, 493);

        Cone cone13 = new Cone();
        addObject(cone13, 281, 593);
        cone13.setLocation(373, 637);

        Cone cone14 = new Cone();
        addObject(cone14, 74, 592);
        cone14.setLocation(29, 636);

        Cone cone15 = new Cone();
        addObject(cone15, 128, 589);
        cone15.setLocation(94, 631);

        Cone cone16 = new Cone();
        addObject(cone16, 195, 589);
        cone16.setLocation(146, 634);

        Cone cone17 = new Cone();
        addObject(cone17, 223, 630);
        cone17.setLocation(203, 628);

        Cone cone18 = new Cone();
        addObject(cone18, 295, 595);
        cone18.setLocation(267, 625);

        Cone cone19 = new Cone();
        addObject(cone19, 63, 48);
        cone19.setLocation(28, 65);

        Cone cone20 = new Cone();
        addObject(cone20, 144, 111);
        cone20.setLocation(96, 70);

        Cone cone21 = new Cone();
        addObject(cone21, 203, 186);
        cone21.setLocation(152, 76);

        Cone cone22 = new Cone();
        addObject(cone22, 269, 108);
        cone22.setLocation(261, 70);

        Cone cone23 = new Cone();
        addObject(cone23, 327, 93);
        cone23.setLocation(325, 66);

        Cone cone24 = new Cone();
        addObject(cone24, 375, 117);
        cone24.setLocation(377, 72);

        Coin coin = new Coin();
        addObject(coin, 35, 334);

        Coin coin2 = new Coin();
        addObject(coin2, 38, 394);

        Coin coin3 = new Coin();
        addObject(coin3, 38, 448);

        Coin coin4 = new Coin();
        addObject(coin4, 377, 539);

        Coin coin5 = new Coin();
        addObject(coin5, 372, 589);

        Coin coin6 = new Coin();
        addObject(coin6, 376, 116);

        Coin coin7 = new Coin();
        addObject(coin7, 371, 189);

        Coin coin8 = new Coin();
        addObject(coin8, 369, 243);

        Home home = new Home();
        addObject(home,277,204);
        home.setLocation(203,27);
    }
}
