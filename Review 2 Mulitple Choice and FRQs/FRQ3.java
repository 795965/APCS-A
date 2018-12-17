
/**
 * Given String return random response
 *
 * @author (Ziggy)
 * @version (12/17)
 */
public class FRQ3
{

    public String getRandomResponse(){
        String[] randStrings = {	"yes", 
                "no", 
                "maybe", 
                "perhaps", 
                "It remains to be seen" };

        String response = randStrings [(int)(Math.random()*randStrings.length)];
        return response;
    }
}
