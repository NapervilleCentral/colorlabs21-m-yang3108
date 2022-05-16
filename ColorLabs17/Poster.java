import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Michael Yang
 * 5/16/22
 * Creates a 6 collage poster of the designated picture with various methods
 */
public class Poster
{
    // instance variables - replace the example below with your own
    private int x;
    private int r, g, b;

    /**
     * Constructor for objects of class Poster
     */
    public static void main (String [] args)
    {
        Picture apic = new Picture("images\\jeremy.jpg");
        //creates a 3x2 collage of the poster by creating a new picture
        Picture poster = new Picture(apic.getWidth() * 3, apic.getHeight() * 2);
        for (int y = 0; y < poster.getHeight(); y++)
            for (int x = 0; x < poster.getWidth(); x++)
            {
                poster.getPixel(x, y).setColor(apic.getPixel(x % apic.getWidth(), y % apic.getHeight()).getColor());   
            }
        negated(poster);    
        grayscale(poster);
        poster.explore();
    }

    public static void grayscale(Picture s)
    {
        int height = s.getHeight();
        int width = s.getWidth();

        Pixel target = null;
        Pixel source = null;

        for (int r = 0; r < width; r++)
        {
            for (int c = 0; c < height; c++)
            {
                source = s.getPixel(r,c);
                int r1 = source.getRed();
                int g1 = source.getGreen();
                int b1 = source.getBlue();
                int average = (int) (r1+b1+g1)/3;
                int small = 255;
                int big = 0;

                source.setColor(new Color(average, average, average));

            }    

        }
    }

    public static void negated(Picture s)
    {
        int height = s.getHeight();
        int width = s.getWidth();

        Pixel target = null;
        Pixel source = null;

        for (int r = 0; r < width; r++)
        {
            for (int c = 0; c < height; c++)
            {
                
                
                source = s.getPixel(r,c);
                int r1 = source.getRed();
                int g1 = source.getGreen();
                int b1 = source.getBlue();
                source.setColor(new Color(255-r1, 255-g1, 255-b1));

            }    

        }
    }
    
    public static void 
    
}
