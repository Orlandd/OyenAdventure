import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winner extends Actor
{
    /**
     * Act - do whatever the Winner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Winner () {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/30;
        int myNewWidth = (int)myImage.getWidth()/30;
        myImage.scale(myNewWidth, myNewHeight);
    }
    
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Start());
        }
    }
}
