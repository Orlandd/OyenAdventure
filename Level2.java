import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(405, 720, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cat cat = new Cat();
        addObject(cat,250,617);
        cat.setLocation(187,696);

        Food food = new Food();
        addObject(food, Greenfoot.getRandomNumber(100) + Greenfoot.getRandomNumber(280) , 50);
        Tree tree = new Tree();
        addObject(tree,112,386);
        tree.setLocation(25,415);
        tree.setLocation(30,449);
        Tree tree2 = new Tree();
        addObject(tree2,84,424);
        tree2.setLocation(60,446);
        Tree tree3 = new Tree();
        addObject(tree3,175,442);
        tree3.setLocation(209,451);
        Tree tree4 = new Tree();
        addObject(tree4,276,414);
        tree4.setLocation(242,448);
        Cone cone = new Cone();
        addObject(cone,54,78);
        cone.setLocation(40,216);
        cone.setLocation(177,228);
        Cone cone2 = new Cone();
        addObject(cone2,239,224);
        cone2.setLocation(222,220);
        Cone cone3 = new Cone();
        addObject(cone3,68,133);
        cone3.setLocation(8,143);
        Cone cone4 = new Cone();
        addObject(cone4,320,139);
        cone4.setLocation(346,145);
        cone.setLocation(168,249);
        cone2.setLocation(217,250);
        cone4.setLocation(362,108);
        cone3.setLocation(79,113);
        cone.setLocation(175,258);
        cone2.setLocation(204,255);
        cone.setLocation(190,265);
        cone.setLocation(167,254);
        Coin coin = new Coin();
        addObject(coin,24,645);
        Coin coin2 = new Coin();
        addObject(coin2,105,644);
        Coin coin3 = new Coin();
        addObject(coin3,347,539);
        coin3.setLocation(363,547);
        coin3.setLocation(363,547);
        Coin coin4 = new Coin();
        addObject(coin4,307,545);
        coin4.setLocation(291,545);
        coin4.setLocation(295,545);
        Coin coin5 = new Coin();
        addObject(coin5,94,463);
        Coin coin6 = new Coin();
        addObject(coin6,166,460);
        Coin coin7 = new Coin();
        addObject(coin7,260,264);
        coin7.setLocation(267,262);
        coin7.setLocation(266,262);
        coin7.setLocation(269,262);
        Coin coin8 = new Coin();
        addObject(coin8,334,260);
        coin8.setLocation(339,261);
        coin8.setLocation(339,261);
        coin8.setLocation(335,262);
        Coin coin9 = new Coin();
        addObject(coin9,313,119);
        Coin coin10 = new Coin();
        addObject(coin10,24,120);
        Coin coin11 = new Coin();
        addObject(coin11,93,189);
        Coin coin12 = new Coin();
        addObject(coin12,182,188);
        Coin coin13 = new Coin();
        addObject(coin13,271,190);
        cone4.setLocation(363,122);
        cone4.setLocation(369,118);
        cone4.setLocation(389,115);
        cone4.setLocation(374,108);
        cone3.setLocation(87,116);
        cone3.setLocation(83,112);
    }
    
    public void act() {
        Car1 car1 = new Car1();
        car1.speed = -3;
        
        if(Greenfoot.getRandomNumber(120)<2){
            addObject(car1,400 , 100); 
        }
        
        if(Greenfoot.getRandomNumber(80)<2){
            addObject(car1,400 , 150); 
        }
        if(Greenfoot.getRandomNumber(80)<2){
            addObject(car1,400 , 230); 
        }
        
        if(Greenfoot.getRandomNumber(90)<1){
            addObject(new Car2(), 0, 530); 
        }
        
        if(Greenfoot.getRandomNumber(500)<2){
            addObject(car1,400 , 580); 
        }
    }
}
