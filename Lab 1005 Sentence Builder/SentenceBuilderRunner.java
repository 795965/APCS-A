
/**
 * Calls Methods from SentenceBuilderClass and runs them
 *
 * @Ziggy Sheynin
 * @Lab 1005 Sentence Builder
 * 
 */
public class SentenceBuilderRunner extends SentenceBuilder
{
    public static void main(){
        SentenceBuilderRunner s1 = new SentenceBuilderRunner();
        s1.loadSentences();
        System.out.println(s1.getSentence());
    }
}
