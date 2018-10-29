
/**
 * Prints Student Objects.
 *
 * @author (Ziggy Sheynin)
 * @version (Project 1025)
 */
import java.util.Scanner;

public class StudentRunner
{
    public static void main(){
        StudentList studentList = new StudentList(); //methos to run arraylist (actually)

    }

    public static int menuNumber(){ //creates a menu for the user to put add, remove, and edit students
        //displays menu
        Scanner scr = new Scanner(System.in); //creates object from keyboard input
        System.out.println("Which item do you need?");
        System.out.println("1. Add a Student");
        System.out.println("2. Remove a Student");
        System.out.println("3. Edit a Student");
        System.out.println("4. Clear All Students");
        System.out.println("5. Print Student List");
        System.out.println("6. Print Specific Student");
        System.out.println("7. End Program");
        int input = scr.nextInt();
        return input;

    }

}