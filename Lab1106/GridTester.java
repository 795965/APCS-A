
/**
 * 4 methods for working with 2D Arrays
 *
 * @author (Ziggy Sheynin)
 * @version (Lab 1106)
 */
import java.lang.Math; //imports for random

public class GridTester
{
    public static void loadArray(){ //loads array
        int [][] testArray = new int[10][10]; //2D array has 10 rows and 10 columns
        for (int r= 0; r < testArray.length; r++){ //traverses array to add values to rows
            for(int c = 0; c < testArray[r].length;c++){ //traverses array to add values to columns
                testArray[r][c] = (int) (Math.random()*100)+1; //loads array with ints from 1-100
                System.out.println(testArray[r][c]); //prints the array
            }
        }
    }

    public static int sumAll(int [] testArray){ //finds and returns the sum
        int sum = 0;
        for(int i = 0; i < testArray.length;i++){
            sum = sum + testArray [i];

        }
        return sum;
    }

    public static int findGreatest(int [] testArray){ //find the largest int
        int greatest = 0;
        for(int i = 0; i < testArray.length;i++){
            if(testArray[i] > greatest){
                greatest = testArray[i];
            }
        }
        return greatest;
    }

    public static int numberOfGreatest(int[] testArray){ //returns the number of times the greatest number appears
        int greatest = 0;
        int count = 0;
        for(int i = 0; i < testArray.length;i++){
            if(testArray[i] > greatest){
                greatest = testArray[i];
            }
            
            for(int j = 0; i < testArray.length;j++){
                if (testArray[j] == greatest){
                    count = count + 1;
                }

            }
        }
        return count;
    }

    public static int findAvg(int[] testArray){//finds the average, the sum divided by the number of numbers
        int sum = 0;
        for(int i = 0; i < testArray.length;i++){
            sum = sum + testArray [i];

        }
        return sum /100;
        
    }
}
