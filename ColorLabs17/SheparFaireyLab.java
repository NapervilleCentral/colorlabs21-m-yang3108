import java.awt.*;
import java.util.*;
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @Michael Yang
 * @11/12/2021
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * main method, to test the picture
     *  
     */
    public static void main(String[] args)
    {
        
         //opens selfie picture 
          /**/
         Picture face1 = new Picture("images/shepard1.jpg");         
         Picture face2 = new Picture("images/shepard.jpg");
         Picture face3 = new Picture("images/shepard1.jpg");        
         
         Pixel pixels1 [] = face1.getPixels();
         Pixel pixels2 [] = face2.getPixels();
         Pixel pixels3 [] = face3.getPixels();
         
         Color lightgreen = new Color(199,223,137);
         Color lightyellow = new Color(242,190,87);
         Color lightblue = new Color(104,121,159);
         Color pink = new Color(189,116,159);
         
         int r,g,b,average;
         
         //method 3
         
         for (Pixel spot : pixels3) {
             r = spot.getRed();
             g = spot.getGreen();
             b = spot.getBlue();
             average = (int) (r+b+g)/3;
             
             if (average <= 63) 
                spot.setColor(pink); 
             else if (average <= 127) 
                spot.setColor(lightblue);
             else if (average <= 191) 
                spot.setColor(lightyellow);
             else if (average <= 255)
                 spot.setColor(lightgreen);
         }    
             
         face3.explore();
   
             
         //method 2
         int min = 255;
         int max = 0;
         for (Pixel spot : pixels2) {
             r = spot.getRed();
             g = spot.getGreen();
             b = spot.getBlue();
             average = (int) (r+b+g)/3;
             
             spot.setColor(new Color(average, average, average)); 
             if (min > spot.getRed()) {
                 min = spot.getRed();
             if (max < spot.getRed()) {
                 max = spot.getRed();
         }    
         
         face2.explore();
         
         //method1
         
         Color darkBlue = new Color(10,42,43);
         Color medBlue = new Color(101,147,160);
         Color lightBlue = new Color(185,204,184);
         Color yellow = new Color(255,239,167);
         Color red = new Color(219,21,34);
                   
         for (Pixel spot : pixels1) {
             r = spot.getRed();
             g = spot.getGreen();
             b = spot.getBlue();

             average = (int) (r+b+g)/3;
             
             if (average <= 51) 
                spot.setColor(darkBlue); 
             else if (average <= 102) 
                spot.setColor(medBlue);
             else if (average <= 153) 
                spot.setColor(lightBlue);
             else if (average <= 204)
                 spot.setColor(yellow);
             else if (average <= 255) 
                 spot.setColor(red);
             
         }    
             
         face1.explore();
          
         face1.write("images/method1.jpg");
         face3.write("images/method3.jpg");
         
    }//main       
}//class

