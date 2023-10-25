import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class counter2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class counter2 extends sereia2
{
    /**
     * Act - do whatever the counter2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void acertarAlvo()
    {
        Actor a = getOneIntersectingObject(sereia1.class);
        Actor had = getOneIntersectingObject(poder2.class);
        if (a != null){
            counter2 counter2 = (counter2) getWorld().getObjects(counter2.class).get(0);

            getWorld().removeObject(a);
            getWorld().removeObject(had);
        }
    }
    }

