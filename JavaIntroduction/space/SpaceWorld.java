import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceWorld extends World
{

    /**
     * Constructor for objects of class SpaceWorld.
     * 
     */
    public SpaceWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1);
        prepare();
    }
    
    public void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket, 300, 300);
        HealthBar healthbar = new HealthBar();
        addObject(healthbar, 40, 40);

        // very important!
        rocket.setHealthBar(healthbar);
        healthbar.setActor(rocket);
        Asteroid asteroid = new Asteroid();
        addObject(asteroid, 503, 313);
        Asteroid asteroid2 = new Asteroid();
        addObject(asteroid2, 328, 185);
        Asteroid asteroid3 = new Asteroid();
        addObject(asteroid3, 166, 209);
        Asteroid asteroid4 = new Asteroid();
        addObject(asteroid4, 53, 428);
        Asteroid asteroid5 = new Asteroid();
        addObject(asteroid5, 381, 485);
        Asteroid asteroid6 = new Asteroid();
        addObject(asteroid6, 158, 528);
    }
}
