
/**
 * Mazewalker - class for turtle to walk
 * 
 * @Ziggy Sheynin 
 * @Project 1 - The Maze 830
 */
public class MazeWalker
{
    public static void run (){ 
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());
    }

    // instance variables - replace the example below with your own
    private int x;

    public MazeWalker()
    {
        // initialise instance variables
        x = 0;
    }

    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }

    public void walkMaze (Maze maze, MazeBot mazeBot){
        while (mazeBot.didReachGoal() == false){
            while (mazeBot.canMoveForward () == true){
                mazeBot.moveForward();
            }
            mazeBot.turnRight();
            if(mazeBot.canMoveForward ()== false){
                mazeBot.turnLeft();
                mazeBot.turnLeft();
            }
        }

        if (mazeBot.didReachGoal() == true){
            mazeBot.signalSuccess();
        }else{
            mazeBot.signalError();
        }       

    }
}


