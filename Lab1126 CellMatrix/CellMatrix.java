
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
    
    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        for( int r = 0; r < cells.length; r++){
           for(int c = 0; c < cells[r].length; c++){
               if (r > 0){
                   Cell[] cells= cells[r-1][c];
                }
                if(r == cells.length - 1){
                }
            }
        }
        
    }
    
    //Print each row and column of nums to the console
    public void printMatrix(){
       for( int r = 0; r < cells.length; r++){
           for(int c = 0; c < cells[r].length; c++){
               System.out.println(cells[r][c]);
            }
        }
    }
    //  load cells with random numbers between 1 and 10 inclusive
    public void loadMatrix(){
       for( int r = 0; r < cells.length; r++){
           for(int c = 0; c < cells[r].length; c++){
               cells[r][c]= new Cell((int)(Math.random()*10) +1);
            }
        }
    }
    //  Findis the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int sum = 0;
        
       
        return 0;
    }
    
    
}
