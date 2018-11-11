
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    //instance variable
    int rank; //int of numbers
    String suit; //string of suit
    public Card(int rk, String s){ //card object has values suit and rank
        int rank = rk;
        String suit = s;
    }
    
    public int getRank(){//getter for rank
        return rank;
    }
    
    public String getSuit(){//getter for suit
        return suit;
    }
}

