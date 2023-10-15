import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Car1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car1 extends Enemy
{
    /**
     * Act - do whatever the Car1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Car1() {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/19;
        int myNewWidth = (int)myImage.getWidth()/19;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public int speed = -3;
    
    public void act()
    {
        Car1 a = new Car1();
        Actor i = getOneIntersectingObject(Car1.class);
        move(speed);
        checkdouble(i);
        end1();
    }
}
