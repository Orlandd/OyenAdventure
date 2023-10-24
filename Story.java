import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story extends World
{

    /**
     * Constructor for objects of class Story.
     * 
     */
    public Story()
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
        ElementStory2 elementStory2 = new ElementStory2();
        addObject(elementStory2,201,250);

        Back back = new Back();
        addObject(back,201,450);
        
    }
}
