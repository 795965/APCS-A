
/**
 * Write a description of class Rest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rest
{
    // //problems 14 and 15
    public void one (){
        System.out.print("one");
    }

    public void two(){
        System.out.print("two");
        one();
    }
    
    //problem 23
    private int x = 78;
    
    public void It(){
        x = 99;
    }
    //problem 24 additions
    public void It(int y){
        x=y;
    }
    
    public String toString(){
        return "" + x;
    }
    
    
     
    }

