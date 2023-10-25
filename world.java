import greenfoot.*;  

/**
 * Write a description of class word here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("musica.mp3");
   
    public void started()
    {
        bgMusic.playLoop();
    }
   
    public void stopped()
    {
        bgMusic.pause();
    }

    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        prepare();
    }
    
    public void prepare() {

        sereia1 sereia1 = new sereia1();
        addObject(sereia1,146,362);
        Counter counter = new Counter();
        addObject(counter,159,213);
        sereia2 sereia2 = new sereia2();
        addObject(sereia2,504,348);
        counter2 counter2 = new counter2();
        addObject(counter2,544,210);
        counter2.setLocation(541,205);
        counter2.setLocation(545,212);
        counter2.setLocation(545,212);
        sereia2.setLocation(544,305);
        sereia2.setLocation(624,176);
        sereia2.setLocation(379,558);
        sereia2.setLocation(554,318);
        sereia2.setLocation(519,410);
    }
    
    }