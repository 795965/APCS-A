
/**
 * Function to find largest Prime Number
 *
 * @author (Ziggy Sheynin)
 * @version (Lab 1130)
 */
import java.util.ArrayList;
public class PrimeNumbers
{
    //Initialize arraylist
    private ArrayList<Integer>numbers;
    
    // //contructor
    // public PrimeNumber(){
        // numbers = new ArrayList<Integer>();
    // }
    
    //takes an integer as an input and puts each of the digits into 
    //an ArrayList of Integer objects.  
    public  void setListToNumbers (int n){
        while(n>0){
            numbers.add(0, n % 10);
            n = n / 10;
        }
        //printList();
    }
    //takes an integer and adds it to an existing ArrayList of Integer objects
    public void addNumberToList(int n){
        for(int i = 0; i < numbers.size(); i++){
            if(n>0){
                int swtich = numbers.size() -1 -i;
                numbers.set(swtich, numbers.get(swtich) + n % 10);
                n = n /10;
            }
        }
    }
    //takes an integer and adds it to an existing ArrayList of Integer 
    //objects
    public void addNumbers(ArrayList<Integer> n1, ArrayList<Integer> n2){
    }
}
