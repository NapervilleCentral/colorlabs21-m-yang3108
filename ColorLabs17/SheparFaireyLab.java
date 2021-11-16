import java.awt.*;
import java.util.*;
/**
 * Takes an image and creates custom colors.
 * @Michael Yang
 * @11/12/2021
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    /**
     * Picture face0 = new Picture("images/shepard2.jpg"); //opens the original picture
     * face0.explore();
     *  
     */
    public static void main(String[] args)
    {
        
          
         Picture face1 = new Picture("images/shepard2.jpg");  //creates the picture for the first method    
         Picture face2 = new Picture("images/shepard2.jpg");  //creates the picture for the first method    
         Picture face3 = new Picture("images/shepard2.jpg");  //creates the picture for the first method          
         
         Pixel pixels1 [] = face1.getPixels(); 
         Pixel pixels2 [] = face2.getPixels();
         Pixel pixels3 [] = face3.getPixels();
         
        
         
         Color lightgreen = new Color(199,223,137); //custom color pallet -> lightgreen color
         Color lightyellow = new Color(242,190,87); //custom color pallet -> light yellow color
         Color lightblue = new Color(104,121,159);  //custom color pallet -> light blue color
         Color pink = new Color(189,116,159);   //custom color pallet -> pink color
         
         int r,g,b,average; //creates the variables for red, green, blue, and average (grayscale)
         
         //method 3 //custom color pallet
         
         for (Pixel spot : pixels3) { //creates a for loop that scans the picture and grabs the colors and the average int
             r = spot.getRed();
             g = spot.getGreen();
             b = spot.getBlue();
             average = (int) (r+b+g)/3;
             
             if (average <= 63) //divides the spectrum of 255 into 4 integer quadrants, and sets a custom color for each quadrant
                spot.setColor(pink); 
             else if (average <= 127) 
                spot.setColor(lightblue);
             else if (average <= 191) 
                spot.setColor(lightyellow);
             else if (average <= 255)
                 spot.setColor(lightgreen);
         }    
             
         face3.explore(); //displays the image output
         
         
   
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
          
        
          //method 2
         int small = 255; //sets the smallest value as the lightsest color (white)
         int big = 0; //sets the biggest value as the darkest color (black)
         
         Color darkBlue = new Color(10,42,43); //creates a dark blue color
         Color medBlue = new Color(101,147,160); //creates a medium blue color
         Color lightBlue = new Color(185,204,184); //creates a light blue color
         Color yellow = new Color(255,239,167); //creates a yellow color
         Color red = new Color(219,21,34); //creates a red color
         
         for (Pixel spot : pixels2) { //creates a for loop that first grabs the colors then sets the average to the highest and lowest grayscale intensities
             
             
         r = spot.getRed();
         g = spot.getGreen();
         b = spot.getBlue();
         average = (int) (r+b+g)/3;

             
             if (average > big) {
                 big = average;
             }
             else if (small > average) {
                 small = average;
             }
  
         }    
         
         for (Pixel spot : pixels2) { //creates another for loop that divides the grayscale intensities into 4 quadrants and sets each quadrant to a special color
             r = spot.getRed();
             b = spot.getBlue();
             g = spot.getGreen();
             average = (r+b+g)/3;
             
             if (average > (big - small)/4*3 + small) {
                 spot.setColor(medBlue);
                }
                
             else if (average > (big - small)/4*2 + small) {
                 spot.setColor(lightBlue);
                }
             
             else if (average > (big - small)/4 + small) {
                 spot.setColor(yellow);
             }
             
             else
                 spot.setColor(red);
                 
            
            }

             
             
         face2.explore(); //displays the iamge output
         
        
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- 
         
        
        
        //method1
         
         darkBlue = new Color(10,42,43); //creates the designated color pallet
         medBlue = new Color(101,147,160);
         lightBlue = new Color(185,204,184);
         yellow = new Color(255,239,167);
         red = new Color(219,21,34);
                   
         for (Pixel spot : pixels1) { //uses a for loop to scan the image and grab the rgb color
             r = spot.getRed();
             g = spot.getGreen();
             b = spot.getBlue();

             average = (int) (r+b+g)/3; //sets the average (grayscale)
             
             if (average <= 51) //divides the spectrum into 5 quadrants, and sets a designated color for each quadrant
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
             
         face1.explore(); //displays the image output
         
         
        //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
         //saves the images to the images folder under their respective names
          
         face1.write("images/method1.jpg"); 
         face2.write("images/method2.jpg");
         face3.write("images/method3.jpg");
         
    }//main       
}//class


