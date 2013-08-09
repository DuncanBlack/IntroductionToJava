import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class GoldBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoldBrick extends Brick
{
  public GoldBrick(){
      GreenfootImage image = new GreenfootImage(40, 20);
      image.setColor(Color.yellow);
      image.fillRect(0, 0, 40, 20);
      setImage(image);
    }
  public int getScoreValue(){
    return 2000;
  }   
}
