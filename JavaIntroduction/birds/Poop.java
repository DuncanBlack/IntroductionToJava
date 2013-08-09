import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poop extends Actor
{
    public void act() 
    {
        if (hitGround)
        {
            delay = delay - 1;
            if (delay == 0) {
                getWorld().removeObject(this);
            }
        }
        else if ( altitude > 10)
        {
            altitude = altitude -1;
            getImage().scale(altitude / 4, altitude / 4);
        }
        else
        {
          turnToSplat();
          hitGround = true;
        }
    }    
    int altitude = 100;
    boolean hitGround = false;
    int delay = 500;
    public Poop() 
    {
        getImage().scale(25, 25);
    }    
    public void turnToSplat()
    {
        GreenfootImage image = new GreenfootImage("brown-splat-md.png");
        image.scale(40, 40);
        setImage(image);
    }
}
