import greenfoot.*;

public class Coin extends Actor {
    
    GreenfootImage image1 = new GreenfootImage("coin1.png");
    GreenfootImage image2 = new GreenfootImage("coin2.png");
    GreenfootImage image3 = new GreenfootImage("coin3.png");
    GreenfootImage image4 = new GreenfootImage("coin4.png");
    GreenfootImage image5 = new GreenfootImage("coin5.png");
    GreenfootImage image6 = new GreenfootImage("coin6.png");

    public int frame = 1;
    public int waktu = 0;
    
    public int frameDelay = 10;  // Ubah nilai sesuai keinginan
    public int scaleFactor = 3;
    
    public Coin() {
        int myNewHeight1 = (int)image1.getHeight() / scaleFactor;
        int myNewWidth1 = (int)image1.getWidth() / scaleFactor;
        image1.scale(myNewWidth1, myNewHeight1);
        
        int myNewHeight2 = (int)image2.getHeight() / scaleFactor;
        int myNewWidth2 = (int)image2.getWidth() / scaleFactor;
        image2.scale(myNewWidth2, myNewHeight2);

        int myNewHeight3 = (int)image3.getHeight() / scaleFactor;
        int myNewWidth3 = (int)image3.getWidth() / scaleFactor;
        image3.scale(myNewWidth3, myNewHeight3);

        int myNewHeight4 = (int)image4.getHeight() / scaleFactor;
        int myNewWidth4 = (int)image4.getWidth() / scaleFactor;
        image4.scale(myNewWidth4, myNewHeight4);

        int myNewHeight5 = (int)image5.getHeight() / scaleFactor;
        int myNewWidth5 = (int)image5.getWidth() / scaleFactor;
        image5.scale(myNewWidth5, myNewHeight5);

        int myNewHeight6 = (int)image6.getHeight() / scaleFactor;
        int myNewWidth6 = (int)image6.getWidth() / scaleFactor;
        image6.scale(myNewWidth6, myNewHeight6);
    }
    
    public void act() {
        animasi();
    }

    public void animasi() {
        waktu++;

        if (waktu >= frameDelay) {
            waktu = 0;

            if (frame == 1) {
                setImage(image2);
                frame = 2;
            } else if (frame == 2) {
                setImage(image3);
                frame = 3;
            } else if (frame == 3) {
                setImage(image4);
                frame = 4;
            } else if (frame == 4) {
                setImage(image5);
                frame = 5;
            } else if (frame == 5) {
                setImage(image6);
                frame = 6;
            } else if (frame == 6) {
                setImage(image1);
                frame = 1;
            }
        }
    }
}

