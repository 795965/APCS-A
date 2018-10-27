
/**
 * Creates a Madlibs kind of thing
 *
 * @Ziggy Sheynin
 * @Gibberish Lab 1011
 */
public class GibberishRunner
{
    public static void main (){ //create a main method to run the program
        WordList5000 wordList5000 = new WordList5000(); //new object of type WordList5000
        Gibberish gibberish = new Gibberish(); //new object Gibberish
        System.out.println(gibberish.makeGibberish(wordList5000)); //print final gibberish line
    }
    
}
