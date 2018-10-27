
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @Ziggy Sheynin
 * @lab 906
 */

// imports go here
import java.util.Arrays;
import java.lang.Math;
public class StatTester{
    //  Instance variables
    private int nums[];
    private int range = 10;

    // Constructor
    public StatTester(){
        nums = new int [100];
    }


    //  Methods
    public void loadArray(){
        for (int i=0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*10+1);

        }

        System.out.println(nums);
    }

    public void printArray(){
        for(int i=0; i < nums.length; i++){
            System.out.print(nums[i] + ", ");
            if ((i+1)%10==0 & i!= 0){
                System.out.println();
            }
        }
        System.out.println();
    }

    public double getSum(){
        int total= 0;
        for(int i=0; i < nums.length; i++){
            total = total + nums[i];
        }

        return total;
    }

    public double getMean(){
        int total = 0;
        for(int i=0; i < nums.length; i++){
            total = total + nums[i];
        }
        return (double)total / nums.length;

    }

    public double getMedian (){
        Arrays.sort(nums);
        return (double) ((nums[49] + nums [50])/2);
    }

    public double getMode (){
        int [] mode = new int [range+1];

        for (int i = 0; i < nums.length; i++){
            mode[nums[i]] ++;
        }
        for(int i = 0; i < nums.length; i++){
            if (max < mode [i]){
                max = mode [i];
            }
        }
        int numberOfModeValues = 0;
        for (int i = 0; i < nums.length; i++){
            if (max == mode [i]){
                numberOfModeValues ++;
            }
        }
        
        int [] modes = new int [numberOfModeValues];
        int modesIndex =0;
        for (int i = 0; i < nums.length; i++){
            if (max == mode [i]){
                
            }
        }
    }
}
