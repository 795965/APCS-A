
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Hand
{
    ArrayList <Card>hand = new ArrayList<Card>();
    public Hand(Deck deck){
        for(int i =0; i<=4; i++){
            hand.add(deck.getCard()); //adds 5 random cards to the hand
        }
    }

    public boolean sameSuit(){//method to check if card in the hand have same suit
        boolean changes = false; //if the suit is different
        String currentSuit = hand.get(0).getSuit(); //gives you initial suit
        for(int i= 0; i<=5; i++){//runs through hand
            if(hand.get(i).getSuit() != currentSuit){
                changes = true; //if the cards have the same suit
            }
        }
        return changes;
    }

    public int onePair(){//method for finding if there is a pair
        int pairCount = -1; //number of pairs- if there isn't one, -1
        int count = 0;
        for(int i = 0; i <=4; i++){
            if(hand.get(i).getRank() == hand.get(0).getRank()
            ||hand.get(i).getRank() == hand.get(1).getRank()
            ||hand.get(i).getRank() == hand.get(2).getRank()
            ||hand.get(i).getRank() == hand.get(3).getRank()
            ||hand.get(i).getRank() == hand.get(4).getRank()){
                pairCount ++; //checks if the ranks match + increases the Pair count
                count = hand.get(i).getRank(); //sets the value of the pair
            }
        }
        if (pairCount ==1){//if there are pairs
            return count; 
        }
        return -1; //if there are no pairs
    }
}

