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
    // instance variables
    private int x;
    private int r, g, b;

    /**
     * Constructor for objects of class Poster
     * Sets up a 3*2 collage of spongebobs
     * also calls the 6 methods
     */
    public static void main (String [] args)
    {
        Picture apic = new Picture("images\\spongebob.jpg");
        //creates a 3x2 collage of the poster by creating a new picture
        Picture poster = new Picture(apic.getWidth() * 3, apic.getHeight() * 2);
        for (int y = 0; y < poster.getHeight(); y++)
            for (int x = 0; x < poster.getWidth(); x++)
            {
                poster.getPixel(x, y).setColor(apic.getPixel(x % apic.getWidth(), y % apic.getHeight()).getColor());   
            }
        //negated(poster, 0, 0, apic.getWidth(), apic.getHeight());    
        //grayscale(poster, apic.getWidth() * 2, apic.getHeight() * 2, apic.getWidth(), apic.getHeight());
        mirror(poster,  apic.getHeight(), apic.getWidth(), apic.getHeight(), apic.getWidth());
        posterize(poster, 0, 0, apic.getHeight(), apic.getWidth());
        poster.explore();
    }
    /**
     * Grayscale method
     * uses 
     */
    public static void grayscale(Picture s, int startX, int startY, int w, int h )
    {
        int height = s.getHeight();
        int width = s.getWidth();

        Pixel target = null;
        Pixel source = null;

        for (int r = startY; r < startY+h; r++)
        {
            for (int c = startX; c < startX+w; c++)
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

    public static void negated(Picture s, int startX, int startY, int w, int h )
    {
        int height = s.getHeight();
        int width = s.getWidth();

        Pixel target = null;
        Pixel source = null;

        for (int r = startY; r < startY + h; r++)
        {
            for (int c = startX; c < startX+w; c++)
            {

                source = s.getPixel(r,c);
                int r1 = source.getRed();
                int g1 = source.getGreen();
                int b1 = source.getBlue();
                source.setColor(new Color(255-r1, 255-g1, 255-b1));

            }    

        }
    }

    public static void mirror(Picture p, int startX, int startY, int w, int h)
    {

        for (int y = startY; y < startY+h; y++)
        {
            for (int x = startX; x < startX+w; x++)

            {
                Pixel leftPixel = p.getPixel(x, y);
                Pixel rightPixel = p.getPixel(startX + w-x, y);
                Pixel temp = p.getPixel(startX + w-x, y);
                rightPixel.setColor(leftPixel.getColor());
                leftPixel.setColor(temp.getColor());

            }
        }

    }

    public static void upsidedown(Picture p, int startX, int startY, int w, int h)
    {

    }

    public static void recursion(Picture p, int startX, int startY, int w, int h)
    {

    }

    public static void posterize (Picture p, int startX, int startY, int w, int h)
    {
        Pixel source = null;
        for (int y = startY; y < startY+h; y++)
        {
            for (int x = startX; x < startX+w; x++)

            {
                Color darkBlue = new Color(10,42,43); //creates the designated color pallet
                Color medBlue = new Color(101,147,160);
                Color lightBlue = new Color(185,204,184);
                Color yellow = new Color(255,239,167);
                Color red = new Color(219,21,34);
                source = p.getPixel(y,x);
                int r2 = source.getRed();
                int g2 = source.getGreen();
                int b2 = source.getBlue();

                int average = (int) (r2+b2+g2)/3; //sets the average (grayscale)

                if (average <= 51) //divides the spectrum into 5 quadrants, and sets a designated color for each quadrant
                    source.setColor(darkBlue); 
                else if (average <= 102) 
                    source.setColor(medBlue);
                else if (average <= 153) 
                    source.setColor(lightBlue);
                else if (average <= 204)
                    source.setColor(yellow);
                else if (average <= 255) 
                    source.setColor(red);
            }
        }
    }
}
