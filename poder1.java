import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder1 extends sereia1
{
    /**
     * Act - do whatever the poder1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void acertarAlvo(){
        Actor a = getOneIntersectingObject(sereia2.class);
        Actor had = getOneIntersectingObject(poder1.class);
        if (a != null){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            getWorld().removeObject(a);
            getWorld().removeObject(had);
        }
    }
    }

