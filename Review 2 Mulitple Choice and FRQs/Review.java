
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

    public static void problem78910(){
        //properly declare and initialize variables
        int strLen = 0;
        boolean stuActive = true;
        String numVal = "2";
        double launchAngle = 360/15.2;

    }

    public static int problem11(){
        // fill in return type: public _______ max(int x, int y) {
        int x = 0;
        int y = 0;
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void problem12(){
        //what does it print?
        //prints 4, 2, 3,
        for(int i = 2; i > 0 ; i--){
            for(int j = i; j <= 2; j++){
                System.out.print(i + j + ", ");
            }
        }

    }

    public static void problem13(){
        //correclty declares and initializes
        int myInt = 0;
    }

    public static void problem14(){
        //what does it return?
        int m = 0;
        int n = 7;
        while(m < 3) {
            n--;
            m++;
        }
        System.out.print("" + m + n);

    }
    //returns 34

    public static void problem15(){
        //random number between 2 and 8
        int rNum = 0;
        rNum = (int)(Math.random()*6) + 2;
    }

    public static void problem16(int minNum, int maxNum){
        //prints?
        //prints: the total is: 12
        int total = 0;
        int k;
        for (k=1; k <= maxNum; k++) {
            if (k >= minNum) {
                total = total + k;
            }
        }
        System.out.println("the total is:" + total);
    }

    public static void problem17(){
        String s = "Strings are friends, not food";
        int x = s.indexOf("friends");
        int y = s.indexOf("food");
        String str = s.substring(0, x) + "g" + s.substring(y + 1);
        System.out.println(str);
        //prints: String are good
    }

    public static void problem18(int num){
        //what does toTheMax(4) print?
        //prints:
        //1
        //22
        //333
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}

