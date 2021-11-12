import java.awt.*;
import java.util.*;
import java.util.List;


/**
 * Experimenting with adjusting the colors of pictures
 * Michael Yang
 * 11/10/2021
 */
public class ColorLab
{
    public static void main (String [] args)
    {
        Picture swan = new Picture("images/swan.jpg");
        swan.explore();
        
        Pixel [] pixels = swan.getPixels(); 
        
        
        for (Pixel spot : pixels)
        {
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();
            
            spot.setRed(255);
            spot.setBlue(255);
            spot.setGreen(255);
        
    }
    swan.explore();
    
        swan = new Picture("images/swan.jpg");
        pixels = swan.getPixels(); 
        
        
        for ( Pixel spot : pixels)
        {
            int number = 0;
            spot.setRed(255-spot.getRed());
            spot.setBlue(255-spot.getBlue());
            spot.setGreen(255-spot.getGreen());
            
            
        }
        
        swan.explore();
        
         swan = new Picture("images/swan.jpg");
         pixels = swan.getPixels(); 
        
        for ( Pixel spot : pixels)
        {
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();
            int doubler = r*2;
            int doubleg = g*2;
            int doubleb = b*2;
            
            if (doubler > 255) {
                spot.setRed(255);
            }
            
            else if (doubleb > 255) {
                spot.setBlue(255);
            }
            else if (doubleg > 255) {
                spot.setGreen(255);
            }
            else {
            spot.setColor(new Color(doubler, doubleg, doubleb));
        }
            
        }
        
        swan.explore();
        
        
        swan = new Picture("images/swan.jpg");
        pixels = swan.getPixels(); 
        
        for ( Pixel spot : pixels)
        {
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();
            
            int average = (r+g+b)/3;
            
            spot.setColor(new Color(average, average, average));
            
            


        }
        
        swan.explore();
        
        swan = new Picture("images/swan.jpg");
        pixels = swan.getPixels();
        
        for (Pixel spot : pixels)
        {
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();
            
            int newg =  (int) (g*0.1);
            int newr = (int) (r*0.1);
            int newb = (int) (b*0.1);
            
            spot.setRed(newr);
            spot.setGreen(newg);
            spot.setBlue(newb);
    
    
    
}
   swan.explore();
   
    swan = new Picture("images/swan.jpg");
        pixels = swan.getPixels();
        
        for (Pixel spot : pixels)
        {
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();
            
            int newg =  (int) (g*3);
            int newr = (int) (r*3);
            int newb = (int) (b*3);
            
            spot.setRed(newr);
            spot.setGreen(newg);
            spot.setBlue(newb);
    
    
    
}
   swan.explore();
   
   
       swan = new Picture("images/swan.jpg");
        pixels = swan.getPixels();
        
        for (Pixel spot : pixels)
        {
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();
           
            spot.setColor(new Color(g, r, b));
    
    
}
   swan.explore();
       
   swan = new Picture("images/swan.jpg");
        pixels = swan.getPixels();
        
        for (Pixel spot : pixels)
        {
            int r = spot.getRed();
            int g = spot.getGreen();
            int b = spot.getBlue();

            spot.setColor(new Color(b, g, r));
    
    
    
}
   swan.explore();
}
}
