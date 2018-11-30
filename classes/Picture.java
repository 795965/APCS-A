import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
    ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments 
     */
    public Picture ()
    {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();  
    }

    /**
     * Constructor that takes a file name and creates the picture 
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName)
    {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width)
    {
        // let the parent class handle this width and height
        super(width,height);
    }

    /**
     * Constructor that takes a picture and creates a 
     * copy of that picture
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture)
    {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image)
    {
        super(image);
    }

    ////////////////////// methods ///////////////////////////////////////

    /**
     * Method to return a string with information about this picture.
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString()
    {
        String output = "Picture, filename " + getFileName() + 
            " height " + getHeight() 
            + " width " + getWidth();
        return output;

    }

    /** Method to set the blue to 0 */
    public void zeroBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setBlue(0);
            }
        }
    }
    /** Method to keep only Blue */
    public void OnlyBlue()
    {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels)
        {
            for (Pixel pixelObj : rowArray)
            {
                pixelObj.setRed(0);
                pixelObj.setGreen(0);
            }
        }
    }

    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVertical()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        } 
    }

    //method that mirrors picture around mirror vertically from right to left
    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
    public void mirrorVerticalRightToLeft()
    {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < width / 2; col++)
            {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        } 
    }
    //mirrors viretically top to bottom
    /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
        // public void mirrorHorizontal()
        // {
            // Pixel[][] pixels = this.getPixels2D();
            // Pixel topPixel = null;
            // Pixel bottomPixel = null;
            // int height = pixels[].length;
            // for (int row = 0; row < pixels.length; row++)
            // {
                // for (int col = 0; col < height / 2; col++)
                // {
                    // topPixel = pixels[row][col];
                   // bottomPixel = pixels[row][height - 1 - col];
                    // bottomPixel.setColor(topPixel.getColor());
                // }
            // } 
        // }
    /** Mirror just part of a picture of a temple */
    public void mirrorTemple()
    {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++)
        {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++)
            {

                leftPixel = pixels[row][col];      
                rightPixel = pixels[row]                       
                [mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }

    /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic, 
    int startRow, int startCol)
    {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow; 
        fromRow < fromPixels.length &&
        toRow < toPixels.length; 
        fromRow++, toRow++)
        {
            for (int fromCol = 0, toCol = startCol; 
            fromCol < fromPixels[0].length &&
            toCol < toPixels[0].length;  
            fromCol++, toCol++)
            {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }   
    }

    /** Method to create a collage of several pictures */
    public void createCollage()
    {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1,0,50);
        this.copy(flower2,100,100);
        this.copy(flower1,300,0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(flower1,400,0);
        this.copy(flower2,500,0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }

    /** Method to create a collage of several pictures */
    public void myCollage()
    {
        Picture ZiggyJulie = new Picture("ZiggyJulie.jpg");
        Picture MB = new Picture("MusicBox.jpg");
        Picture SSF = new Picture("SplitsStreetFair.jpg");
        this.copy(ZiggyJulie,0,0);
        this.copy(SSF,100,0);
        this.copy(ZiggyJulie,200,0);
        Picture flowerNoBlue = new Picture(SSF);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue,300,0);
        this.copy(ZiggyJulie,400,0);
        this.copy(SSF,500,0);
        this.mirrorVertical();
        Picture SSf1NoGreen = new Picture (SSF);
        this.copy(MB, 500, 400);
        this.write("collage.jpg");
    }

    /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist)
    {
        //variables for left, right, top and bottom
        Pixel leftPixel = null; 
        Pixel rightPixel = null;
        Pixel topPixel = null;
        Pixel bottomPixel = null;
        //variable for the pixels arraty
        Pixel[][] pixels = this.getPixels2D();
        //variables for the right color and bottom color because you need to use them to get edges
        Color rightColor = null;
        Color bottomColor = null;
        //nested for loop to traverse pixels 2D array
        for (int row = 0; row < pixels.length; row++)
        {
            for (int col = 0; col < pixels[0].length-1; col++)
            {
                //find each edge by setting left right top and bottom pixels to their row and column (where bottom is the next column over and right is the next column over
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][col+1];
                topPixel=pixels[row][col];
                bottomPixel = pixels[row][col+1];
                rightColor = rightPixel.getColor();
                bottomColor = bottomPixel.getColor();
                //if statement to set the edge to black
                    //if the right color has a large change from the left color or the top has a large change from the bottom, set it to black
                if(leftPixel.colorDistance(rightColor) > edgeDist || topPixel.colorDistance(bottomColor) > edgeDist){
                    leftPixel.setColor(Color.BLACK);
                    topPixel.setColor(Color.BLACK);
                // if the change is not great, set the color to white
                }else{
                    leftPixel.setColor(Color.WHITE);
                    topPixel.setColor(Color.WHITE);
                }
            }

        }
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) 
    {
        Picture ZiggyJulie = new Picture("ZiggyJulie.jpg");
        ZiggyJulie.explore();
        ZiggyJulie.zeroBlue();
        ZiggyJulie.explore();
    }

} // this } is the end of class Picture, put all new methods before this
