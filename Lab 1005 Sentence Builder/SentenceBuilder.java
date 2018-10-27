
/**
 * Makes arrays of Strings to build sentences
 * 
 * @Ziggy Sheynin
 * @Lab 1005 Sentence Builder
 */

public class SentenceBuilder
{
    private String[] nouns = {"baby", "dog", "child", "mom", "cat", "kitten", "the circus", "friend", "boy", "girl"};
    private String[] verbs = {"runs", "dies", "cries", "jumps", "sleeps", "eats", "falls", "laughs", "computes", "draws"};
    String[] adjectives = {"funny", "silly", "lumpy", "crusty", "smooth", "rough", "grumpy", "chilly", "smelly", "sad", "odious"};
    public String[] determiners = {"the", "my", "your", "his", "hers", "our", "their", "Sally's", "Elena's"};
    public String[] adverbs = {"sadly", "grumpily", "quickly", "happily", "smoothly", "angrily", "often", "never", "stealthily","awkwardly"};
    public String[] prepositions = {"over", "near", "behind", "next to", "above", "close"};
    private String sentence = "";
    
    public void loadSentences(){
        sentence = getNounPhrase() + " " + getVerbPhrase() + " " + getPrepositionalPhrase() + ".";
        sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
    }
    
    public String getSentence(){
        return sentence;
    }
    
    public String getRandomNoun(String[] nouns){
        return nouns[(int)(Math.random()*(nouns.length))];
    }
    
    public String getRandomVerb(String[] verbs){
        return verbs[(int)(Math.random()*(verbs.length))];
    }
    
    public String getRandomAdjective(String[] adjectives){
        return adjectives[(int)(Math.random()*(adjectives.length))];
    }
    
    public String getRandomAdverb(String[] adverbs){
        return adverbs[(int)(Math.random()*(adverbs.length))];
    }
    
    public String getRandomDeterminer(String[] determiners){
        return determiners[(int)(Math.random()*(determiners.length))];
    }
    
    public String getRandomPreposition(String[] prepositions){
        return prepositions[(int)(Math.random()*(prepositions.length))];
    }
    
    public String getNounPhrase(){
        return getRandomDeterminer(determiners) + " " + getRandomAdjective(adjectives) + " " + getRandomNoun(nouns);
    }
    
    public String getVerbPhrase(){
        return getRandomAdverb(adverbs) + " " + getRandomVerb(verbs);
    }
    
    public String getPrepositionalPhrase(){
        return getRandomPreposition(prepositions) + " " + getRandomDeterminer(determiners) + " " + getRandomAdjective(adjectives) + " " + getRandomNoun(nouns);
    }

}