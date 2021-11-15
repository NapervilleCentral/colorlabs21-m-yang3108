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
         Picture face = new Picture("images/shepard.jpg");
         face.explore();
         
         Pixel pixels [] = face.getPixels();
         
         //change with selfie picture
         Picture me = new Picture("images/shepard.jpg");
         Picture me1 = new Picture("images/shepard.jpg");
         Picture me2 = new Picture("images/shepard.jpg");
         
         
         //method 1 change
          
         for (Pixel spot : pixels) {
             int r = spot.getRed();
             int g = spot.getGreen();
             int b = spot.getBlue();
             
             Color lightgreen = new Color(199,223,137);
             Color lightyellow = new Color(242,190,87);
             Color lightblue = new Color(104,121,159);
             Color pink = new Color(189,116,159);
             
             int average = (int) (r+b+g)/3;
             
             if (average <= 63) 
                spot.setColor(lightgreen); 
            
            
             else if (average <= 127) 
                spot.setColor(lightyellow);
            
            
             else if (average <= 191) 
                spot.setColor(lightblue);
            
            
             else if (average <= 255)
                 spot.setColor(pink);
                
             
                }    
             
         face.explore();
   
             
             
         /**
          * method 2 change
          * 
          */
         
         
         //custom color palette
         
         /**          
         for (Pixel spot : pixels) {
             int r = spot.getRed();
             int g = spot.getGreen();
             int b = spot.getBlue();
             
             Color darkBlue = new Color(10,42,43);
             Color medBlue = new Color(101,147,160);
             Color lightBlue = new Color(185,204,184);
             Color yellow = new Color(255,239,167);
             Color red = new Color(219,21,34);
             
             int average = (int) (r+b+g)/3;
             
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
             
         face.explore();
          
*/
         
    }//main       
}//class

