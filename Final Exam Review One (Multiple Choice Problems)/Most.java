
/**
 * Final Exam Review One (Multiple Choice Problems
 *
 * @author (Ziggy Sheynin)
 * @version (12/10/18)
 */
import java.util.ArrayList;
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

    public static void main14(){
        //problem 14
        //output = onetwoonetwoone
        Rest test = new Rest();
        // test.one();
        // test.two();
        // test.two();

        //problem 15
        //output = onetwooneone
        Rest go = new Rest();
        go.one();
        go.two();
        go.one();
    }

    //problem 16
    //What is the output?
    //should print 12345678910
    public static void problem16(){
        for(int h = 1; h <= 10; h++){
            System.out.print(h);
        }
    }

    //problem 17
    //What is the output?
    //output - 4 -1 6
    public static void problem17(){
        String a = "abcdefsdfg";
        String b = "ems";
        for(int i = 0; i < b.length(); i++){
            System.out.print(a.indexOf(b.substring(i, i+1)));
            System.out.print(" ");
        }
    }

    //problem 18
    //fill in the blank
    //blank = new ArrayList <String>();
    ArrayList<String> aList = new ArrayList<String> ();

    //problem 19
    //what is returned by check (99)?
    //returns false
    public static boolean check(int x){
        return (x % 2 == 0);
    }

    //problem 20
    //what is the value of x after segment is executed?
    //x is 3
    public static void problem20(){
        String s = "computers";
        String t = s.substring(3,7);
        int x = s.indexOf(t + s.substring(7,8));
        System.out.print(x);
    }

    //problem 21
    //what is the output?
    //output 3t
    //full arraylist = three, five, two
    public static void problem21(){
        ArrayList<String> bList = new ArrayList<String>();
        bList.add(0,"one");
        bList.add("two");
        bList.set(0,"three");
        bList.add(1, "four");
        bList.set(1, "five");
        System.out.println(bList.get(0).substring(0,1));
        System.out.print(bList);
    }
    
    //problem 22
    //what is the output?
    //output 3
    //full arraylist = [3, 5, 2]
    public static void problem22(){
        ArrayList<Integer> cList = new ArrayList<Integer>();
        cList.add(0,1);
        cList.add(2);
        cList.set(0,3);
        cList.add(1, 4);
        cList.set(1, 5);
        int i = cList.get(0);
        System.out.println(i);
        System.out.println(cList);
    }
    
    //problem 23
    //main method
    //what is the output?
    //output is 78
    public static void main23(){
        Rest anIt = new Rest();
        System.out.println(anIt);
    }
    
    //problem 24 
    //main method
    // - take issue with int parameter for It method
    public static void main24(){
        ArrayList<Rest> itList = new ArrayList<Rest>();
        itList.add(new Rest());
        //itList.add(new Rest(8));
        
    }
    
    //problem 25
    //what is the output?
    //[6, 5, 8, 2, 9]
    public static void problem25(){
        ArrayList<Integer> dList = new ArrayList<Integer>();
        dList.add(8);
        dList.add(2);
        dList.add(0,5);
        dList.add(0,6);
        dList.add(9);
        System.out.println(dList);
    }
    
    //problem 26
    //what is output
    //???
    public static void problem26(){
        int out = 0, in= 0;
        for(out=1; out < 4; out++){
            for(in = 1; in < 3; in++){
                in++;
                out--;
            }
        }
        System.out.println(out*in);
        System.out.println(out);
        System.out.println(in);
    }
    
    //problem 27
    //what is output?
    //(two methods)
    //returns 3.5
    public static void list27(){
        int[] list = {1,2,3,4,5,6};
        System.out.println(go5(list));
    }
    public static double go5(int[] ray){
        int val =0;
        for(int i = 0; i < ray.length; i++){
            val = val + ray[i];
        }
        double ans = (double)val / ray.length;
        return ans;
    }
    
    //problem 28
    //what is the output?
    //10.0
    public static void problem28(){
        double wNum = 5/2;
        wNum = wNum * 5.0;
        System.out.print(wNum);
    }
    
    //problem 29
    //what is the output?
    //15
    public static void problem29(){
        int out = 0, in = 0;
        for(out = 1; out<4; out++){
            for(in = 1; in < 3; in++){
                in++;
                out++;
            }
        }
        System.out.println(out*in);
    }
    
    //problem 30
    //what is the output?
    //5
    //2
    //4
    public static void problem30(){
        int [][] mat = {{2,3,4,5}, {6,7,8,9,10}};
        System.out.println(mat[1].length);
        System.out.println(mat.length);
        System.out.println(mat[0].length);
    }
    
    //problem 31
    //fill in the blank
    public static double findBig(double [] list){
        double big = Integer.MIN_VALUE;
        for(int i = 0; i<list.length; i++){
            if(list[i]>big){
                big = list[i];
            }
        }
        return big;
    }
    
    //problem 32
    //what is returned by check(92)?
    //true
    public static boolean check2(int x){
        return (x%2 ==0);
    }
    
    //problem 33
    //what is output?
    public static void problem33(){
        int[][] mat = {{2,3,4,5,}, {6,7,8,9,10}};
        System.out.println(mat[1][1] * mat[0][2]);
    }
}
