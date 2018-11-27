
/**
 * 
 * 
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class MatrixRunner{ //makes all the things actuall do stuff
    
    public static void main(){//main method to run all other methods
      CellMatrix cm = new CellMatrix(3, 4); //decleares and initializes a new matrix cm with 3 rows and 4 columns
      cm.loadMatrix(); //calls the method loadMatrix
      cm.printMatrix();// calls the method printMatrix
      cm.loadNeighbors(); //calls the method loadNeighbors
      System.out.println(cm.getGreatestNeighbors()); // new line and calls method greatestNeighbors
    }
}
