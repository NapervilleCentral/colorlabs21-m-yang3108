import java.awt.*;
/**
 * Write a description of class Katie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Katie
{
    public static void main (String [] args) 
    {
        Picture Katie = new Picture("images/KatieFancy.jpg");
        Katie.explore();
        
        Pixel[] pixels;
        
        pixels = Katie.getPixels();
        

        
        for (Pixel spot : pixels) 
        {
            int r = spot.getRed();
            int b = spot.getBlue();
            int g = spot.getGreen();
            
            int avg = int((r+b+g)/3));
            
            Katie.setRed(average);
            
            
            
            if ((r>155 || r<135) && (g<150 || g>115) && (b<145 || b>115)) {
                spot.setColor (new Color(10, 10, 10));
            }
            
            
            
            
            
        }
        
        Katie.explore();
    }
}
