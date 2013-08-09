 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    public void act() 
    {
        checkKeys();
        checkPoopKey();
    }    
    public void checkKeys()
    {
        if(Greenfoot.isKeyDown("up")){
            move (4);
        }
        if(Greenfoot.isKeyDown("down")){
            move (-4);
        }
        if(Greenfoot.isKeyDown("right")){
            turn (4);
        }
        if(Greenfoot.isKeyDown("left")){
            turn (-4);
        }
        if ( "space".equals(Greenfoot.getKey())) {
            firePoop();
        }
    }
     public void firePoop()
    {
        getWorld().addObject(new Poop(), getX(), getY());
    }
    public void checkPoopKey()
    {
        
    }
}
