import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{

    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    
   } public void act(){
       
    //Diálogo Toad
        if (Greenfoot.isKeyDown("enter")){
        setBackground(new GreenfootImage("2.png"));
    }
    //Diálogo Mário
        if (Greenfoot.isKeyDown("enter")){
        setBackground(new GreenfootImage("3.png"));
    }
    //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter")){
        World world = new world();
        Greenfoot.setWorld(world);
    }
}
}
