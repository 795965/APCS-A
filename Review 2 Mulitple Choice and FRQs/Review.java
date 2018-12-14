
/**
 * Review for final Multiple Choice
 *
 * @author (Ziggy Sheynin)
 * @version (12/14/18)
 */
import java.util.ArrayList;

public class Review
{
    public static void problem1(){
        //which prints "Paul"
        String str1 = "Job, Steven Paul";
        String str2 = "Steven Paul Jobs";
        str1.substring(7);
        //System.out.println(str2.substring(str1.indexOf("Paul"),str1.indexOf("Jobs")-2));
        System.out.println(str1.substring(str2.indexOf("Paul"),str2.indexOf("Jobs")-2));
        System.out.println(str1.substring(str1.indexOf("n")+2)); //prints Paul
    }

    public static void problem3(){
        int[] nums = {1,2,3,4,5}; 
        int sum = 0;
        //which will set the value of sum equal to 5 -- this one, c
        for(int i = 0; i < nums.length; i++){
            if(sum < nums[i]) {
                sum=nums[i];
            }
        }
        System.out.println(sum);
    }

    public static void problem5(){
        //which of the following correctly declares an ArrayList
        //error String [] ArrayList = new ArrayList<String>[12];
        //errorString<ArrayList> bob = new String<ArrayList>();
        //errorArrayList<int> numberList = new ArrayList<int>();
        ArrayList <Integer> numberList = new ArrayList<Integer>();

    }

    public static String problem6(int x){

        if (x <= 5){
            return "same";
        }else {
            if (x >= 3){
                return "notsame";
                
            }
        }
        return "done";
    }

}

