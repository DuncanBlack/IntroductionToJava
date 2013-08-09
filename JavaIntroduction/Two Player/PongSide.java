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
    int playerNumber = 0;
    public PongSide(int player)
    {
        playerNumber = player;
        getImage().scale(10, 100);
    }
    public void act() 
    {
        CheckKeys();
    }    
    public void CheckKeys()
    {
       String upKey = "up"; 
       if (playerNumber ==2) {
           upKey = "w";
        }
        if(Greenfoot.isKeyDown(upKey)) {
            setLocation(getX(), getY() -5);}
            String downKey = "down" ;
       if (playerNumber ==2) {
           downKey = "s";
        }
            if(Greenfoot.isKeyDown(downKey)) {
            setLocation(getX(), getY() +5);
    }
}
}

