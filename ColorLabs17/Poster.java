import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Michael Yang
 * 5/16/22
 * Creates a 6 collage poster of the designated picture with various methods
 * See Poster Description txt document for detailed description of each section of the collage
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
        //creates the 6 images and the canvas needed for the poster
        Picture original = new Picture("images\\patrick1.jpg");
        Picture negated = new Picture("images\\patrick1.jpg");
        Picture recursion = new Picture("images\\patrick1.jpg");
        Picture grayscale = new Picture("images\\patrick1.jpg");
        Picture posterize = new Picture("images\\patrick1.jpg");
        Picture mirror = new Picture("images\\patrick1.jpg");
        Picture canvas = new Picture("images\\c.jpg");
        
        //calls each method
        negated(negated);
        recursion(recursion, 10);
        grayscale(grayscale);
        posterize(posterize);
        mirror(mirror);
        
        //uses the copyTo method to put the individual Patricks onto the canvas in a collage

        copyTo(original, canvas, 0, 0);
        copyTo(negated, canvas, 796, 0);
        copyTo(recursion, canvas, 796, 1194);
        copyTo(grayscale, canvas, 0, 597);
        copyTo(posterize, canvas, 796, 597);
        copyTo(mirror, canvas, 0, 1194);
        canvas.explore();
        
        canvas.write("images\\poster.jpg");
    }
    
    /**
     * CopyTo method used to transfer the pixels onto the canvas in the collage format using the given 
     * x and y coordinates, and the desired picture
     */

    public static void copyTo(Picture s, Picture t, int x, int y)
    {
        int height = s.getHeight() - 1;
        int width = s.getWidth() - 1;

        Pixel target = null;
        Pixel source = null; 

        for (int r = 0; r < width; r++)
        {
            for (int c = 0; c < height; c++)
            {
                source = s.getPixel(r,c);
                target = t.getPixel(r+x,c+y);
                target.setColor(source.getColor());
            }
        }

    }

    /**
     * Grayscale method
     * uses for each loop to create an array of pixels
     * finds the red, green, and blue pixels and sets the colors to the average
     * this creates a grayscale
     */
    public static void grayscale(Picture p)
    {

        Pixel[] pixels = p.getPixels();

        for (Pixel spot : pixels)
        {
            int r1 = spot.getRed();
            int g1 = spot.getGreen();
            int b1 = spot.getBlue();
            int average = (int) (r1+b1+g1)/3;
            int small = 255;
            int big = 0;

            spot.setColor(new Color(average, average, average));

        }    
    }

    /**
     * Negated method
     * uses for each loop to create an array of pixels
     * finds the red, green, and blue pixels and sets the colors to the average
     * subtracts those values from 255 to create an inverse RGB color pallete
     */

    public static void negated(Picture p)
    {
        Pixel[] pixel1 = p.getPixels();

        for(Pixel s: pixel1)
        {
            int r1 = s.getRed();
            int g1 = s.getGreen();
            int b1 = s.getBlue();
            s.setColor(new Color(255-r1, 255-g1, 255-b1));

        }    

    }

    
    /**
     * Mirror method
     * uses for each loops to create an array of pixels
     * uses for loops to mirror on the y axis vertically
     * by setting the left pixel to the right pixel and vice versa
     */

    public static void mirror(Picture p)
    {
        Pixel[] pixel2 = p.getPixels();
        int height = p.getHeight() - 1;
        int width = p.getWidth() - 1;
        for (int r = 0; r < width/2; r++)
        {  
            for (int c = 0; c < height; c++)
            {
                Pixel leftPixel = p.getPixel(r, c);
                Pixel rightPixel = p.getPixel(width-r, c);
                Pixel temp =  p.getPixel(width-r, c);
                rightPixel.setColor(leftPixel.getColor());
                leftPixel.setColor(temp.getColor());

            }
        }
    }
    
    /**
     * Recursive Method
     * @param allows the user to input a picture and a recursive value that changes by 0.9x until the
     * base case is reached
     * uses for loops to find the color then multiples by a factor of 0.8 to change the size and position
     * of the patricks until the base case is reached
     */

    public static void recursion(Picture p, int x)
    {
        int h = p.getHeight();
        int w = p.getWidth();
        Pixel source = null; 
        Pixel temp = null;

        for (int r = 0; r < w; r++)
        {
            for (int c = 0; c < h; c++)
            {
                source = p.getPixel(r,c);

                int r5 = source.getRed();
                int g5 = source.getGreen();
                int b5 = source.getBlue();

                temp = p.getPixel((int)(r*0.8),(int)(c*0.8));

                temp.setRed(r5);
                temp.setGreen(g5);
                temp.setBlue(b5);
            }
        }
        x *= 0.9;
        if (x > 5)
            recursion(p, x);

    }

    /**
     * Posterize method
     * uses a for each loop to find each pixel's color, and changes it to a possible 5 different colors
     * creating a posterized effect
     */
    public static void posterize (Picture p)
    {
        Pixel[] pixel3 = p.getPixels();
        
        for (Pixel spot : pixel3)
        {
            Color darkBlue = new Color(10,42,43); //creates the designated color pallet
            Color medBlue = new Color(101,147,160);
            Color lightBlue = new Color(185,204,184);
            Color yellow = new Color(255,239,167);
            Color red = new Color(219,21,34);
 
            int r2 = spot.getRed();
            int g2 = spot.getGreen();
            int b2 = spot.getBlue();

            int average = (int) (r2+b2+g2)/3; //sets the average (grayscale)

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
    }
}


