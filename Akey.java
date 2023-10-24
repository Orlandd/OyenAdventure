import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Akey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Akey extends Actor
{
    /**
     * Act - do whatever the Akey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.getKey()!=null||Greenfoot.mousePressed(this)) {
        Greenfoot.delay(5);
        Greenfoot.setWorld(new Menu());
        }   
    }
}
