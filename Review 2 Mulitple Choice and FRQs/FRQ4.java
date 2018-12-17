
/**
 * Write a description of class FRQ4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class FRQ4
{
    public static int loadNums(){
         int[][] nums = new  int[10][10];
         int numEvens = 0;
      
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[r].length; c++){
                nums[r][c] = (int)(Math.random()*10)+1;
                if(nums[r][c] % 2 ==0){
                    numEvens++;
                }
            }
        }
        return numEvens;
    }
}
