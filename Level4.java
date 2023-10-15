import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{

    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(405, 720, 1); 
        prepare();
    }
    
        public void act() {
        Car1 car1 = new Car1();
        car1.speed = -4;
        
        Car2 car2 = new Car2();
        car2.speed = 4;

        if(Greenfoot.getRandomNumber(80)<2){
            addObject(car1,400 , 120); 
        }

        if(Greenfoot.getRandomNumber(100)<1){
            addObject(car1,400 , 300); 
        }
        if(Greenfoot.getRandomNumber(100)<2){
            addObject(car1,400 , 230); 
        }

        if(Greenfoot.getRandomNumber(100)<2){
            addObject(car2, 0, 470); 
        }
        
        if(Greenfoot.getRandomNumber(80)<1){
            addObject(car2, 0, 550); 
        }
        
        if(Greenfoot.getRandomNumber(200)<2){
            addObject(car2, 0, 600); 
        }

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cat cat = new Cat();
        addObject(cat,220,642);
        cat.setLocation(196,690);

        Food food = new Food();
        addObject(food, Greenfoot.getRandomNumber(100) + Greenfoot.getRandomNumber(280) , 20);
        Tree tree = new Tree();
        addObject(tree,87,393);
        tree.setLocation(55,389);
        Tree tree2 = new Tree();
        addObject(tree2,129,408);
        tree2.setLocation(93,382);
        Tree tree3 = new Tree();
        addObject(tree3,283,352);
        tree3.setLocation(291,388);
        Tree tree4 = new Tree();
        addObject(tree4,313,371);
        tree4.setLocation(329,383);
        Tree tree5 = new Tree();
        addObject(tree5,173,344);
        tree5.setLocation(182,283);
        Tree tree6 = new Tree();
        addObject(tree6,242,284);
        tree6.setLocation(313,283);
        Tree tree7 = new Tree();
        addObject(tree7,79,305);
        tree7.setLocation(49,281);
        Cone cone = new Cone();
        addObject(cone,122,151);
        cone.setLocation(51,663);
        cone.setLocation(50,663);
        Cone cone2 = new Cone();
        addObject(cone2,134,622);
        cone2.setLocation(92,661);
        Cone cone3 = new Cone();
        addObject(cone3,234,545);
        cone3.setLocation(330,526);
        cone3.setLocation(330,526);
        Cone cone4 = new Cone();
        addObject(cone4,271,526);
        cone4.setLocation(291,533);
        Cone cone5 = new Cone();
        addObject(cone5,101,512);
        cone5.setLocation(57,533);
        Cone cone6 = new Cone();
        addObject(cone6,181,514);
        cone6.setLocation(96,532);
        Cone cone7 = new Cone();
        addObject(cone7,279,248);
        cone7.setLocation(357,71);
        Cone cone8 = new Cone();
        addObject(cone8,119,24);
        cone8.setLocation(147,67);
        Cone cone9 = new Cone();
        addObject(cone9,61,64);
        cone9.setLocation(104,74);
        Cone cone10 = new Cone();
        addObject(cone10,262,65);
        cone10.setLocation(316,73);
        Coin coin = new Coin();
        addObject(coin,157,537);
        Coin coin2 = new Coin();
        addObject(coin2,242,537);
        cone3.setLocation(333,524);
        cone3.setLocation(350,534);
        cone3.setLocation(349,532);
        cone3.setLocation(349,530);
        cone3.setLocation(349,530);
        Coin coin3 = new Coin();
        addObject(coin3,378,651);
        Coin coin4 = new Coin();
        addObject(coin4,306,650);
        Coin coin5 = new Coin();
        addObject(coin5,97,294);
        Coin coin6 = new Coin();
        addObject(coin6,244,296);
        Coin coin7 = new Coin();
        addObject(coin7,374,296);
        Coin coin8 = new Coin();
        addObject(coin8,211,80);
        Coin coin9 = new Coin();
        addObject(coin9,270,78);
        cone9.setLocation(83,75);
        cone8.setLocation(132,74);
        cone9.setLocation(75,77);
        cone8.setLocation(126,83);
        cone7.setLocation(365,82);
        Coin coin10 = new Coin();
        addObject(coin10,335,135);
        Coin coin11 = new Coin();
        addObject(coin11,81,162);
        Coin coin12 = new Coin();
        addObject(coin12,230,219);
        coin12.setLocation(241,219);
        coin12.setLocation(241,219);
        coin12.setLocation(242,219);
        coin8.setLocation(180,77);
        coin9.setLocation(270,80);
        coin10.setLocation(343,158);
        Coin coin13 = new Coin();
        addObject(coin13,153,400);
        Coin coin14 = new Coin();
        addObject(coin14,243,394);
        coin14.setLocation(248,399);
        coin14.setLocation(248,399);
        coin14.setLocation(248,398);
        tree2.setLocation(81,373);
        removeObject(tree2);
        removeObject(tree);
        removeObject(tree3);
        removeObject(tree4);
        removeObject(tree6);
        tree5.setLocation(195,282);
        removeObject(tree5);
        removeObject(tree7);
        cone8.setLocation(23,336);
        cone9.setLocation(75,341);
        cone7.setLocation(129,341);
        cone10.setLocation(371,250);
        cone10.setLocation(135,245);
        Cone cone11 = new Cone();
        addObject(cone11,295,261);
        cone11.setLocation(192,240);
        coin12.setLocation(256,655);
        coin10.setLocation(187,617);
        coin14.setLocation(105,607);
        coin13.setLocation(178,473);
        coin6.setLocation(241,465);
        coin7.setLocation(309,427);
        coin5.setLocation(190,418);
        Cone cone12 = new Cone();
        addObject(cone12,295,239);
        cone12.setLocation(253,241);
        Cone cone13 = new Cone();
        addObject(cone13,339,118);
        cone13.setLocation(371,156);
        Cone cone14 = new Cone();
        addObject(cone14,281,149);
        cone14.setLocation(325,160);
        Cone cone15 = new Cone();
        addObject(cone15,224,154);
        cone15.setLocation(276,165);
        cone12.setLocation(248,246);
        cone11.setLocation(200,250);
        Cone cone16 = new Cone();
        addObject(cone16,47,72);
        cone16.setLocation(23,85);
        Cone cone17 = new Cone();
        addObject(cone17,122,113);
        cone17.setLocation(78,79);
        Cone cone18 = new Cone();
        addObject(cone18,138,164);
        cone18.setLocation(123,161);
        Cone cone19 = new Cone();
        addObject(cone19,63,135);
        cone19.setLocation(66,163);
        coin11.setLocation(81,161);
        cone19.setLocation(79,151);
        cone19.setLocation(67,159);
        coin11.setLocation(352,353);
        cone19.setLocation(71,172);
        coin11.setLocation(21,167);
        coin11.setLocation(21,167);
        coin7.setLocation(357,243);
        coin6.setLocation(313,253);
        coin5.setLocation(80,253);
        coin13.setLocation(27,263);
        coin9.setLocation(382,77);
        coin8.setLocation(314,89);
        Cone cone20 = new Cone();
        addObject(cone20,288,349);
        cone20.setLocation(363,418);
        Cone cone21 = new Cone();
        addObject(cone21,207,399);
        cone21.setLocation(289,413);
        Cone cone22 = new Cone();
        addObject(cone22,55,398);
        cone22.setLocation(30,415);
        Cone cone23 = new Cone();
        addObject(cone23,167,386);
        cone23.setLocation(80,411);
        cone22.setLocation(27,418);
        cone23.setLocation(79,421);
        Cone cone24 = new Cone();
        addObject(cone24,226,370);
        cone24.setLocation(135,414);
        cone20.setLocation(375,421);
        cone21.setLocation(314,420);
        Cone cone25 = new Cone();
        addObject(cone25,264,412);
        cone25.setLocation(246,407);
        cone5.setLocation(22,500);
        cone6.setLocation(80,512);
        cone4.setLocation(142,513);
        cone3.setLocation(196,505);
        cone2.setLocation(377,585);
        cone.setLocation(364,507);
        cone4.setLocation(144,507);
        cone3.setLocation(195,504);
        coin2.setLocation(192,422);
        coin14.setLocation(191,331);
        coin.setLocation(243,339);
        coin10.setLocation(304,335);
        cone2.setLocation(309,503);
        cone4.setLocation(140,505);
        Cone cone26 = new Cone();
        addObject(cone26,144,545);
        cone26.setLocation(29,618);
        Cone cone27 = new Cone();
        addObject(cone27,135,624);
        cone27.setLocation(81,652);
        cone26.setLocation(32,654);
        cone26.setLocation(34,653);
        cone27.setLocation(78,656);
        coin12.setLocation(39,550);
        coin4.setLocation(35,599);
        coin3.setLocation(255,514);
        coin.setLocation(251,327);
        coin10.setLocation(318,334);
        coin.setLocation(256,339);
        coin7.setLocation(377,253);
        coin6.setLocation(313,253);
        coin9.setLocation(379,94);
        cone13.setLocation(381,176);
        cone14.setLocation(334,182);
        cone15.setLocation(272,183);
        cone18.setLocation(136,189);
        cone10.setLocation(148,263);
        cone12.setLocation(264,270);
        cone12.setLocation(247,256);
        cone10.setLocation(141,262);
        cone11.setLocation(187,268);
        coin13.setLocation(17,263);
        coin5.setLocation(80,270);
        cone10.setLocation(132,268);
        cone11.setLocation(198,265);
        cone12.setLocation(249,267);
        cone18.setLocation(146,173);
        cone19.setLocation(85,173);
        cone15.setLocation(260,165);
        cone14.setLocation(328,163);
        cone13.setLocation(385,165);
        cone15.setLocation(257,171);
        cone14.setLocation(299,170);
        cone13.setLocation(363,172);
    }
}
