import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PongBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PongBall extends Actor
{
    /**
     * Act - do whatever the PongBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
        public PongBall()
    {
        getImage().scale(25, 25);
    }
    public void act() 
    {
        Movement();
    }    
    public void Movement() 
    {
        move (4);
        bounceFromEdge();
        bounceFromPongSide();
        check();
    }
    public void bounceFromPongSide()
    {
        PongSide pongside = (PongSide) getOneIntersectingObject(PongSide.class);
        if (pongside != null)
        {   
            // Then a paddle was detected
            horizontalBounce();
            int distanceFromCenter = getY() - pongside.getY();
            turn(distanceFromCenter / 2);
            move(4);
        }
}

public void check()
    {
        Player1WinZone pongside = (Player1WinZone) getOneIntersectingObject(Player1WinZone.class);
        Player2WinZone pongside2 = (Player2WinZone) getOneIntersectingObject(Player2WinZone.class);
        if (pongside != null || pongside2 != null)
        {   
            getWorld().removeObject(this);
        }
}

public void bounceFromEdge()
    {
        if (getX() < 10 || getX() > getWorld().getWidth() - 10)
        {
            horizontalBounce();
            move(8);
        }

        if (getY() < 10 || getY() > getWorld().getHeight() - 10)
        {
            verticalBounce();
            move(8);
        }
    }
    public void horizontalBounce()
    {
        setRotation(180 - getRotation());    
    }
    public void verticalBounce()
    {
        setRotation(0 - getRotation());
    }
}
