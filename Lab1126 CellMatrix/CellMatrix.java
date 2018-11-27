
/**
 * 
 * CellMatrix
 * @author (Ziggy Sheynin) 
 * @version (11-26-18)
 */
import java.lang.Math;

public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */

    private Cell[][] cells;

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
        cells = new Cell[a][b];

    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */

    
    //Print each row and column of nums to the console
    public void printMatrix(){ 
        for( int r = 0; r < cells.length; r++){ //traverses rows of 2D array
            for(int c = 0; c < cells[r].length; c++){ //traverses columns of 2D array
                System.out.println(cells[r][c].getInt()+", "); //prints the integer value at the specific indices in the 2D array

            }
        }
    }
    //  load cells with random numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for( int r = 0; r < cells.length; r++){
            for(int c = 0; c < cells[r].length; c++){ //traverses row and columns using nested for loop
                cells[r][c]= new Cell((int)(Math.random()*10) +1); //inserts integer value at the given index
            }
        }
    }
    
    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        for( int r = 0; r < cells.length; r++){
            for(int c = 0; c < cells[r].length; c++){//traverses row and columns using nested for loop
                Cell cell = cells [r][c];
                if (r > 0){//if there is a row above, then add a neighbor at that index
                    cell.addNeighbors(cells[r-1][c]);
                }
                if(r < cells.length-1){//if there is a row below, then add a neighbor at that index
                    cell.addNeighbors(cells[r+1][c]); 
                }
                if (c > 0){//if there is a column above, then add a neighbor at that index
                    cell.addNeighbors(cells[r][c-1]);
                }
                if(c < cells.length-1){//if there is a column below, then add a neighbor at that index
                    cell.addNeighbors(cells[r][c+1]); 
                }
            }
        }

    } 
    //  Finds the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int greatest = 0;
        for (int r = 0; r< cells.length; r++){
            for(int c = 0; c <cells[r].length; c++){//traverses row and columns using nested for loop
                int sum = cells[r][c].getSum(); //sum of the neighbors
                if(sum > greatest){ //if the sum is bigger than the last sum or 0, then greatest is the new sum
                    greatest = sum;
                }
            }
        }
        return greatest;
    }

}
