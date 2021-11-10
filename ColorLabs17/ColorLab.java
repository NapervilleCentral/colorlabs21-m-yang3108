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
    
        swan = new Picture("images/swan.jpg");
        pixels = swan.getPixels(); 
        
        for ( Pixel spot : pixels)
        {
            int number = 0;
            spot.setRed(255-number);
            spot.setBlue(255-number);
            spot.setGreen(255-number);
            
            number++;
        }
        
        swan.explore();
    
    
    
    
    
}

}
