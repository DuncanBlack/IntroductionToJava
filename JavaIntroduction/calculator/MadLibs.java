
/**
 * MadLib generator!
 */

import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Give a person: ");
        String person = s.nextLine();
        
        System.out.print("Give a number: ");
        int number = s.nextInt();
        
        System.out.print("Give a place: ");
        String place = s.nextLine();
        
        System.out.print("Give a animal: ");
        String animal = s.nextLine();
        
   
        
        System.out.println("Once upon a time, there was a " + person + " who had " + number + " cars.");
        System.out.println("One day, she was going to " + place + " when she accidentally ran over a " + animal);
    }
}
