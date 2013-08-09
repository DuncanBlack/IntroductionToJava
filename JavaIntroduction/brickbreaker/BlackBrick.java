import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class BlackBrick here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackBrick extends Brick
{
    public BlackBrick(){
      GreenfootImage image = new GreenfootImage(40, 20);
      image.setColor(Color.black);
      image.fillRect(0, 0, 40, 20);
      setImage(image);
    }
  public int getScoreValue(){
    return -1000;
  }   
}
