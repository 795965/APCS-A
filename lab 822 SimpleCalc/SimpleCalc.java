
/**
 * Write a description of class SimpleCalc here.
 *  Has objects and methods
 * @author (Ziggy) 
 * @version (822 SimpleCalc)
 */
public class SimpleCalc
{
public SimpleCalc(){
    
    
}
 public double add(int x, int y){
     return x+y;
    }
 public double subtract(int x, int y){
       return x-y;
    }
    public double multiply(int x, int y){
       return x*y;
    }
    public double mudulodivide(int x, int y){
       return x%y;
    }
    public double divide(int x, int y){
        if ( y != 0){
            return x/y;
        } else {
            return 0.0;
        }
       
    }
}