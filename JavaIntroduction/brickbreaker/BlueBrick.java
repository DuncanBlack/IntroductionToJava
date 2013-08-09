import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class BlueBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueBrick extends Brick
{
  public BlueBrick(){
      GreenfootImage image = new GreenfootImage(40, 20);
      image.setColor(Color.blue);
      image.fillRect(0, 0, 40, 20);
      setImage(image);
    }
  public int getScoreValue(){
    return 100;
  }    
}
