import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TwoPlayerWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwoPlayerWorld extends World
{

    /**
     * Constructor for objects of class TwoPlayerWorld.
     * 
     */
    public TwoPlayerWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        PongSide pongside = new PongSide();
        addObject(pongside, 137, 227);
        pongside.setLocation(49, 295);
        PongSide pongside2 = new PongSide();
        addObject(pongside2, 463, 299);
        pongside2.setLocation(549, 294);
        PongBall pongball = new PongBall();
        addObject(pongball, 307, 307);
        pongball.setLocation(301, 300);
        Player1WinZone player1winzone = new Player1WinZone();
        addObject(player1winzone, 584, 324);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(596, 334);
        player1winzone.setLocation(597, 303);
        Player2WinZone player2winzone = new Player2WinZone();
        addObject(player2winzone, 20, 325);
        player2winzone.setLocation(5, 296);
    }
}
