import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PongSide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PongSide extends Actor
{
    /*
     * Act - do whatever the PongSide wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public PongSide()
    {
        getImage().scale(10, 100);
    }
    public void act() 
    {
        CheckKeys();
    }    
    public void CheckKeys()
    {
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() -5);}
            if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() +5);
    }
}
}

