import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int score = 0;
    int isOver = 0;
    
    GreenfootSound Musik01 = new GreenfootSound("Varmintz_01.mp3");
    GreenfootSound Musik02 = new GreenfootSound ("dead.mp3");
    GreenfootSound Musik03 = new GreenfootSound ("win.mp3");
    GreenfootSound Musik04 = new GreenfootSound ("coin.mp3");
    GreenfootSound Musik05 = new GreenfootSound ("walk.mp3");
    GreenfootSound Musik06 = new GreenfootSound ("trophy.wav");
    
    GreenfootImage image1 = new GreenfootImage("kucing1.png");
    GreenfootImage image2 = new GreenfootImage("kucing2.png");
    
    private boolean soundHasPlayed = false;
    private boolean mulai = false;
    
    public Cat() {
    int myNewHeight1 = (int)image1.getHeight() / 18;
    int myNewWidth1 = (int)image1.getWidth() / 18;
    image1.scale(myNewWidth1, myNewHeight1);

    int myNewHeight2 = (int)image2.getHeight() / 18;
    int myNewWidth2 = (int)image2.getWidth() / 18;
    image2.scale(myNewWidth2, myNewHeight2);
    }
    
    public void act()
    {
        if (isOver == 0 ) {
            checkKey();
        }
        end();
        addscore();
    }
    
    public void checkKey(){
        //Start
        if (!mulai) {
            setImage(image2);
            mulai = true;
        }
        Musik_back();
        
        int dx = 0, dy = 0; 
        if (Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("w")) {
            dy = -4;
            walk();
        }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            dx = -4;
            setImage(image1);
            walk();
        }
        if (Greenfoot.isKeyDown("Down") || Greenfoot.isKeyDown("s")) { 
            dy = 4;
            walk();
        }
        if (Greenfoot.isKeyDown("Right") || Greenfoot.isKeyDown("d")) {
            dx = 4;
            setImage(image2);
            walk();
        }
        setLocation(getX()+dx, getY()+dy);
        
        if (isTouching(Cone.class) || isTouching(Tree.class))
            {
            setLocation(getX()-dx, getY()-dy);
            }
        
    }
    
    public void end(){
        End end = new End();
        
        if(isTouching(Car1.class)||isTouching(Car2.class)) {
            getWorld().addObject(end,200,313);
            Greenfoot.stop();
            Musik02.play();
            Musik02.setVolume ( 100 );
        }
        
        if(isTouching(Food.class)){
            //getWorld().showText("Nyammm\n Score : " + score + " \n press enter to next ",200, 300);
            Win win = new Win();
            isOver=1;
            Musik_mati();
            
            if (getWorld()instanceof Level1) {
                getWorld().showText("Nyammm\n Score : " + score + " \n press enter to next ",200, 300);
                if(Greenfoot.isKeyDown("enter")) {
                    Greenfoot.setWorld(new Level2());
                    isOver=0;
                }
            } else if (getWorld()instanceof Level2) {
                getWorld().showText("Nyammm\n Score : " + score + " \n press enter to next ",200, 300);
                if(Greenfoot.isKeyDown("enter")) {
                    Greenfoot.setWorld(new Level3());
                    isOver=0;
                }
            } else if (getWorld()instanceof Level3) {
                getWorld().showText("Nyammm\n Score : " + score + " \n press enter to next ",200, 300);
                if(Greenfoot.isKeyDown("enter")) {
                    Greenfoot.setWorld(new Level4());
                    isOver=0;
                }
            } else if (getWorld()instanceof Level4) {
                getWorld().showText("Nyammm\n Score : " + score + " \n press enter to next ",200, 300);
                if(Greenfoot.isKeyDown("enter")) {
                    Greenfoot.setWorld(new Level5());
                    isOver=0;
                }
            } else if(getWorld()instanceof Level5) { 
                getWorld().showText("Nyammm\n Score : " + score ,200, 370);
                getWorld().addObject(win,200,313);
                Musik06.play();
                Greenfoot.stop();
            }
            
        }
     }
    
    public void addscore(){
        if(isTouching(Coin.class)){
            score = score + 1;
            removeTouching(Coin.class);
            Greenfoot.playSound("coin.mp3");
        }
    }
    
    public void walk() {
        //Sound Jalan
        Musik05.play();
        Musik05.setVolume ( 50 );
    }
    
    public void Musik_back () {     
        //add backgrond musik
        Musik01.playLoop();
        Musik01.setVolume ( 50 );
    }
    
    public void Musik_mati () {
        Musik01.stop();
        if (!soundHasPlayed) {
            //sound winner
            Musik03.play();
            Musik03.setVolume ( 100 );
            //play sound winner 1x
            soundHasPlayed = true;
        }
    }
}
