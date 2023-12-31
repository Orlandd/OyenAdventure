import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ElementCredit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ElementCredit extends Actor
{
    /**
     * Act - do whatever the ElementCredit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ElementCredit() {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/4;
        int myNewWidth = (int)myImage.getWidth()/4;
        myImage.scale(myNewWidth, myNewHeight);
    }
    public void act()
    {
        if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9),
            (int)Math.round(getImage().getHeight()*0.9));
        }
        if(Greenfoot.mousePressed(this)){
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Credit());
        }
    }
}
