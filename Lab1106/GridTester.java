
/**
 * 4 methods for working with 2D Arrays
 *
 * @author (Ziggy Sheynin)
 * @version (Lab 1106)
 */
import java.lang.Math; 

public class GridTester
{
    public static void loadArray(){
        int [][] testArray = new int[10][10];
         for (int r= 0; r < testArray.length; r++){
             for(int c = 0; c < testArray[r].length;c++){
                 
                 testArray[r][c] = (int) (Math.random()*100)+1;
                 System.out.println(testArray[r][c]);
                }
            }
        }
        public static int sumAll(int [] testArray){
        int sum = 0;
        for(int i = 0; i < testArray.length;i++){
            sum = sum + testArray [i];
            
        }
        return sum;
    }
}
