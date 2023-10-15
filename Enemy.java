import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void end() {
        if(getX() >= 400 || getX() <0) {
            getWorld().removeObject(this);
        }
    }
    
    public void end1() {
        if(getX() >= 400 || getX() <1) {
            getWorld().removeObject(this);
        }
    }
    
    public void checkdouble(Actor i){
        if( i != null){
            getWorld().removeObject(i);
        }
    }
    
    public void move(int speed){
        setLocation(getX() + speed,getY() );
    }
}
