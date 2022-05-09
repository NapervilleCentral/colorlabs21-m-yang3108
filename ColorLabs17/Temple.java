
/**
 * Michael Yang
 * 5/9/22
 * Fixing the temple
 */
public class Temple
{
    // instance variables - replace the example below with your own
    private int mirrorpaint;

    /**
     * Constructor for objects of class Temple
     */
    public Temple()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int mirrorTemple(Picture apic)
    {
        apic = new Picture("images/temple.jpg");
        Pixel [] pixel = apic.getPixels();
        
        int width = apic.getWidth(), height = 145;
        mirrorpaint = 277;
        for (int i = 0; i<mirrorpaint; i++)
        {
            for (int j = 0; i < height; j++)

            {
                pixel.leftPixel = apic.getPixel(i, j);
                rightpixel = apic.getPixel();
                rightPixel.setColor(leftPixel.getColor());

            }
        }
        apic.explore();
    }
}
