
/**
 * @author (eettlin) 
 * @version (11 26 18)
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private int x;
    private Cell[] neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(int a)    {
        x = a;
        neighbors = new Cell[4];// North, East, South, and West only 
    }

    /**
     * ++++++++++++++  methods
     */

    public int getSum(){ //method to add all neighbors for getGreatest
        int sum = 0; //intializes sum variable
        for(int r= 0; r< neighbors.length; r++){ //for loop to traverse neighbors
            if(neighbors[r] != null){ //if there is a neghbor, add the integer value to the sum
                sum += neighbors[r].getInt();
            }
        }
        return sum;
    }
    public void addNeighbors(Cell cell){ //extra method to make loadNeighbors easier
        for(int r= 0; r< neighbors.length; r++){ //traverses neighbors
            if(neighbors[r] == null){ //if there is no neighbor, that is the end of a row or column
                neighbors[r] = cell;
                r= neighbors.length;
            }
        }

    }

   

    public int getInt(){
        return x;
    }
}
