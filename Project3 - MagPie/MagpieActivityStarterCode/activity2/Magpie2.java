/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("cat") >= 0
                || statement.indexOf("dog") >= 0
                || statement.indexOf("fish") >= 0
                || statement.indexOf("bird") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Mr. Ettlin") >= 0
                || statement.indexOf("Mr. Malloy") >= 0)
                
        {
            response = "Must be a great teacher";
        }
        else if(statement.trim().length() ==0 ){
            response = "Please, say something.";
        }
         else if (statement.indexOf("Elena") >= 0
                || statement.indexOf("Mikah") >= 0)
                
        {
            response = "Wow so smart";
        }
         else if (statement.indexOf("elephants") >= 0
                || statement.indexOf("clowns" ) >= 0)
                
        {
            response = "Oh, are you in the circus?!?!";
        }
         else if (statement.indexOf("like") >= 0
                || statement.indexOf("followers") >= 0)
                
        {
            response = "Oh, whats your insta??";
        }
         else if (statement.indexOf("Hello") >= 0
                || statement.indexOf("Hi") >= 0
                || statement.indexOf("Hey") >= 0)
                
        {
            response = "Waz gucci?";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 2)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 7)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 6)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 5)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Umm...";
        }
        else if (whichResponse == 3)
        {
            response = "Haha funny";
        }
        else if (whichResponse == 0)
        {
            response = "yikes.";
        }
        else if (whichResponse == 1)
        {
            response = "yeah.";
        }

        return response;
    }
}
