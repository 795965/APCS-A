
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList; 
import java.lang.Math;

public class Deck
{
        ArrayList<Card>deck= new ArrayList <Card> ();
        
        public Deck(){ //constructor for Deck
            for(int i = 1;i <=13; i++){ //runs through all ranks
                for(int j = 1; j<=4l; j++){//runks through suits
                    if (j==1){//suit 1 = Diamonds
                        deck.add(new Card(i,"Diamond"));
                    }else if(j==2){//suit 2 = Hearts
                        deck.add(new Card(i,"Hearts"));
                    }else if(j==3){//suit 3 = Clubs
                        deck.add(new Card(i,"Clubs"));
                    }else if(j==4){//suit 4 = Spades
                        deck.add(new Card(i, "Spades"));
                    }
                }
            }
        }
        
        public Card getCard(){
            int place = (int) (Math.random()*52)+1; //random place in the desk
            return deck.get(place);//returns card at given place
    }
}