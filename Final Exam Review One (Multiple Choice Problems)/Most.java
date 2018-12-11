
/**
 * Final Exam Review One (Multiple Choice Problems
 *
 * @author (Ziggy Sheynin)
 * @version (12/10/18)
 */
public class Most
{
    public static void main(){

        //problem 1
        //What is the output?
        //should be 9
        int ap = 789;
        ap = ap % 10;
        System.out.print(ap);

        //problem 3
        //what is the output?
        //Should be 12
        System.out.print(3 + 3 * 3);

        //problem 4
        //which of the following can be used as an identifier?
        //should be b. Java123
        //error - int 124Java = 2;
        int Java123 = 2;
        //error - int float = 2;
        //error - int int = 2;
        //error - int double = 2;

        //problem 5
        //what is the output?
        //should be \dog\cat
        System.out.print("\\dog\\cat");

    }

    //problem 6
    //what is returned by the call getIt(9)?
    //Should be 6
    //problem 7
    //what is returned by the call getIt(3)?
    //returns 7
    public static int getIt(int num){
        int ans = 0;
        if(num >=2){
            if(num >= 7){
                ans += 2;
            } else
                ans +=3;
        }
        ans += 4;
        return ans;
    }

    //problem 8
    //what is the output?
    //returns 71.0
    public static void problem8 (){
        int [] list = {2, 12, 11, 45, 52, 36, 5, 3, 1};
        System.out.println(go(list));
    }

    public static double go(int[] ray){
        int val = 0;
        for(int i = 0; i < ray.length; i = i + 2){
            val = val + ray[i];
        }
        return val;
    }

    //problem 9
    //what is the output?
    //returns 52
    public static void problem9 (){
        int [] list = {2, 12, 11, 45, 52, 36};
        System.out.println(go1(list));
    }

    public static int go1(int[]ray){
        int val = Integer.MIN_VALUE;
        for(int i = 0; i < ray.length; i++){
            if(ray[i] > val){
                val = ray[i];
            }
        }
        return val;
    }

    //problem 10
    //What is the code shown below working to locate?
    //works to locate the max value
    public static void problem10(){
        int [] list = {2, 12, 11, 45, 52, 36};
        System.out.println(go2(list));
    }

    public static int go2(int [] ray){
        int val = Integer.MIN_VALUE;
        for(int i = 0; i < ray.length; i++){
            if(ray[i] > val){
                val = ray[i];
            }
        }
        return val;
    }

    //problem 11
    //what is the output?
    //returns 9...
    public static void problem11(){
        int [] list = {3, 6, 9, 2, 4, 5};
        System.out.println(go3(list));
    }

    public static int go3(int [] ray){
        int val = 0;
        for(int i = 0; i < ray.length; i++){
            if(ray[i] > val){
                val = val + ray[i];
            }
        }
        return val;
    }

    //problem 12
    //what is the output?
    //prints e
    public static void problem12(){
        System.out.print("rsteva".substring(3,4));
    }

    //problem 13
    //what is the output?
    public static void problem13(){
        int x = 4;
        if(x>=2){
            System.out.print("1"+ 7);
            if (x>=7){
                System.out.print("2" + 4);
            }
        } else {
            System.out.print("3" + 9);
        }
    }
}
