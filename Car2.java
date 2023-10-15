import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car2 extends Enemy
{
    /**
     * Act - do whatever the Car2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Car2() {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/19;
        int myNewWidth = (int)myImage.getWidth()/19;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    int speed = 3;
    
    public void act()
    {
        Car2 a = new Car2();
        Actor i = getOneIntersectingObject(Car2.class);
        move(speed);
        checkdouble(i);
        end1();
    }
}
