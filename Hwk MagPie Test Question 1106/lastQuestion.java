
/**
 * Loads an ArrayList with 4 random strings, picks one and replaces input of i like something with one of the responses
 *
 * @author (Ziggy Sheynin)
 * @version (hwk 1106)
 */
import java.lang.Math;
import java.util.ArrayList;

public class lastQuestion
{
    // Test Question Free Response 2
    // From Magpie:  Use the method signature below to create 
    //the method transformILike.  
    //Load an ArrayList with the four strings underlined below. 
    //The method will randomly choose one of four strings and concatenate the 
    //<subject> (e.g. "puppies").  
    //Assume the input string starts with "I like" + <subject>

    // If the user types in "I like puppies";
    // "Why do you like puppies?";
    // "Do you eat puppies?";
    // "What are puppies?"
    // "What color are puppies?"
    

    public String transformILike(String str){
        ArrayList<String>random = new ArrayList<String> ();
        int randomResponse = (int)(Math.random()*4)+1;
        if (randomResponse == 1){
            String random1 = "Why do you like ";
        }else if(randomResponse == 2){
            String random1 = "Do you eat ";
        }else if (randomResponse == 3){
            String random1 = "What are ";
        } else if(randomResponse == 4){
            String random1 = "What color are ";
        }
        return random + subject + "?";
    }
}
