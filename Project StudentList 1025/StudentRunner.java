
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
        boolean done = false; //starts unfinished
        StudentList studentList = new StudentList(); //method to run arraylist (actually)
        while(done == false){ //when the code is unfinished- run loop
            int demand = menuNumber();
            if(demand == 7){
                done = true; //when the user types a 7, the program finishes
            } else if(demand == 1){ //the user wants to add a student
                Scanner demand1 = new Scanner(System.in);
                System.out.println("Enter Student Name: "); //if they press 1, the code give this instruction
                String name = demand1.nextLine();
                System.out.println("Enter Student Number: ");
                int number = demand1.nextInt();
                System.out.println("Enter Student GPA: ");
                double GPA = demand1.nextDouble();
                studentList.addStudentList(name, number, GPA);
                System.out.println("Student Added.");
                System.out.println();

            }

        }
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