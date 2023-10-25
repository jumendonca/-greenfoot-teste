import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder2 extends sereia2
{
    /**
     * Act - do whatever the poder2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void acertarAlvo(){
        Actor a = getOneIntersectingObject(sereia2.class);
        Actor had = getOneIntersectingObject(sereia1.class);
        if (a != null){
            counter2 counter2 = (counter2) getWorld().getObjects(counter2.class).get(0);
            getWorld().removeObject(a);
            getWorld().removeObject(had);
    }
}
}
