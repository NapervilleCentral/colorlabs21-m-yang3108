import java.awt.*;
import java.util.*;
import java.util.List;
/**
 * Michael Yang
 * 5/9/22
 * Fixing the temple
 */
public class Temple
{
    // instance variables - replace the example below with your own
    private int mirrorpaint;

    public static void main (String [] args)
    {

        Picture apic = new Picture("images/temple.jpg");
        mirrorTemple(apic);

        apic.explore();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void mirrorTemple(Picture apic)
    {
        //creates variables for height and the center point of the collosium
        int center = 277;
        int height = 145;
        int width = center * 2;
        
        //creates 2 for loops to create an array that goes through each pixel
        //sets the left pixel to the right pixel to mirror
        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < center; x++)

            {
                Pixel leftPixel = apic.getPixel(x, y);
                Pixel rightPixel = apic.getPixel(width-x, y);
                Pixel temp = apic.getPixel(width-x, y);
                rightPixel.setColor(leftPixel.getColor());
                leftPixel.setColor(temp.getColor());

            }
        }

    }
}
