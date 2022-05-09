package poster;


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

    /**
     * Constructor for objects of class Poster
     */
    public Poster()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        Picture apic = new Picture("images\\caterpillar.jpg");
        
        apic.explore();
        something(apic);
        apirc.explore();
        
        
    }
    public static void something (Picture apic)
    {
        int h = apic.getHeight();
        int w = apic.getWidth();
        Pixel spot = null;
        
        for (int r = 0; r < w; r++)
        {
            for (int c = 0; c < h; c++)
            {
                spot = apic.getPixel(r, c);
                spot.setRed(50);
                
            }
            
            
        }
    }
    
    
}
