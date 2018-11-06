
/**
 * String Test Answers 
 *
 * @author Ziggy Sheynin
 * @version 11/5 from test on 11/2
 */
import java.util.ArrayList;
import java.util.Scanner;
public class answers
{
    public static void Barack(){
        //What does each of the following return:
        String str1 = "Obama, Barack";
        String str2 = "Barack Hussein Obama";
        String str3 = str1.substring(0,7); //Obama,
        String str4 = str2.substring(str2.indexOf("H"), str2.indexOf("n")); //Hussei
        String str5 = str1.substring(str1.indexOf(" ")+1);//Barack
        String str6 = str2.substring(str2.indexOf("n")+2);//Obama
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);

    }

    public static void problem2(){
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(4);
        nums.add(5); 
        nums.add(6);
        nums.add(8);
        int sum = 0;
        //Which of the following will find the sum of the values?
        //a - works
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        // //b - doesn't compile
        // for(int i = 0; i < nums.size(); i++){
        // sum += nums[i];
        // }
        // //c -- doesn't give correct sum
        // for(int i = nums.size() -1; i > 0; i--){
        // sum += nums.get(i);
        // }
        //d - wrong sum
        // for(int i = nums.size() -1; i > 0; i--){
        // sum += i;
        // }
        System.out.println(sum);
    }
    // //What is returned by the call someFun(7)?
    public static String someFun(int x){
        if (x<= 12){
            return "SeeYa";
        }else if(x>5){
            return "Bye";
        }
        return "SoLong";
        //returns SeeYa
    }

    public static void Woodside(){
        String str = "199 Churchill Ave. Woodside CA, 94062";
        //Which expression will return Woodside?
        // //a -- prints until the end
        // String str1 = str.substring(str.indexOf("Woodside"));
        //b - works
        String str2 = str.substring(str.indexOf("Woodside"), str.indexOf("W")+8);
        //c - works
        String str3 = str.substring(str.indexOf("W"), str.indexOf("Woodside")+9);
        //d -- doesn't compile
        //String str4 = str.indexOf("W")+9;
        System.out.println(str);
        //System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }

    public static void problem5(){
        //what will the following print?
        for(int i = 6; i > 3; i--){
            for(int j = 3; j < i; j++){
                System.out.print(" i = " + i + ", j = " +j);
            }
            System.out.print("\n");
        }
        //prints:
        // i = 6, j = 3 i = 6, j = 4 i = 6, j = 5
        // i = 5, j = 3 i = 5, j = 4
        // i = 4, j = 3

    }
    
    //Free Response:
    //1- Given the student class for project two, assume a new instance variable has been added: private
    //boolean isActive Create a getter and a setter for this instance variable
    public void setisActive(boolean isActive){
        isActive = true;
    }
    public boolean getisActive(boolean isActive){
        return isActive;
    }
    
    //2 - Create the method transformILike... idk???
    public static String fromMagpie(){
        
    }
}

