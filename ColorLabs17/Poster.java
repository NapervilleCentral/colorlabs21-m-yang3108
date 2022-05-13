
/**
 * Takes an image and creates custom colors.
 * @Michael Yang
 * @11/12/2021
 */
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Write a description of class Poster here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poster
{
    // instance variables - replace the example below with your own
    private int x;
    private int r, g, b;

    /**c
     * Constructor for objects of class Poster
     */
    public static void main (String [] args)
    {
        Picture apic = new Picture("images\\jeremy.jpg");

        apic.explore();
        grayscale(apic);
        apic.explore();
        Pixel pixel[] = apic.getPixels(); 
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
}
