
/**
 * Write a description of class Gibberish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gibberish {

    String sourceString = new String(); //initializes one instance variable of type String

    public Gibberish(){ //Gibberish Constructor
        Template template = new Template();
        sourceString = template.getSourceString();
    }

    public String makeGibberish(WordList5000 wordlist5000){
        int currentSourceIndex = 0;
        String resultsString = new String();
        while (currentSourceIndex < sourceString.length()){
            if(sourceString.indexOf("<", currentSourceIndex) == -1 || sourceString.indexOf(">", currentSourceIndex) == -1){
                resultsString += sourceString;
                currentSourceIndex = sourceString.length();
            } else {
                int firstCut = sourceString.indexOf("<", currentSourceIndex) +1;
                int lastCut = sourceString.indexOf("<", currentSourceIndex);
                String hold = sourceString.substring(firstCut, lastCut);
                String add = WordList5000.//??(sourceString.substring(firstCut, firstCut +1));
                if(add != add){
                }
                currentSourceIndex = sourceString.indexOf("</>", currentSourceIndex) + 3;
            }
        }
        return resultsString;
    }

}
