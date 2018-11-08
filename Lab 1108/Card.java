
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    public static int Spades = 0;
    public static int Hearts = 1;
    public static int Diamonds = 2;
    public static int Clubs = 3;

    
    public static int Ace = 1;
    public static int Jack = 11;
    public static int Queen = 12;
    public static int King = 13;

    public Card(int value, int Suit){
        value = value;
        suit = Suit;
    }

    public int getSuit(){
        return suit;
    }

    public int getValue(){
        return value;
    }

}

