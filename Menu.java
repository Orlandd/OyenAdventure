import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(405, 720, 1); 
        //prepare();
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        ElementMenu elementMenu = new ElementMenu();
        addObject(elementMenu,215,117);

        ElementStart elementStart = new ElementStart();
        addObject(elementStart,148,225);

        ElementStory elementStory = new ElementStory();
        addObject(elementStory,140,325);

        ElementCredit elementCredit = new ElementCredit();
        addObject(elementCredit,150,425);
        

    }
}
