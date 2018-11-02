
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
            } else if (demand == 1) { //condition to add a student
                Scanner demand1 = new Scanner(System.in);
                //have to put in name, in a given format (3 options...)
                System.out.print("Enter student name: ");
                String name = demand1.nextLine();
                if((name.indexOf(",") != -1 && name.indexOf(" ") != -1 && name.indexOf(" ", name.indexOf(" ")) != -1) || (name.indexOf(",") == -1 && name.indexOf(" ") != -1)) {
                    System.out.print("Enter student number: ");
                    int number = demand1.nextInt();
                    if(countDigits(number) == 6) {
                        System.out.print("Enter student GPA: ");
                        double gpa = demand1.nextDouble();
                        studentList.addStudentList(name, number, gpa);
                        System.out.println("Your student has been added!");
                    } else {
                        tryAgain(); //if their input doesn't equal one of the option
                    }
                } else {
                    tryAgain();
                }
                System.out.println();

            } else if (demand == 2){ //if the user wants to edit a student
                Scanner demand2 = new Scanner(System.in);//accesses the scanner
                System.out.println("Enter Student LAST name: ");
                String name = demand2.nextLine();
                if(studentList.deleteStudent(name) == true){
                    System.out.println("Student Removed.");
                } else{
                    System.out.println("Student not found");
                }
                System.out.println();

            } else if (demand == 3){//the user wants to edit a student
                Scanner demand3 = new Scanner(System.in);
                System.out.println("If you would like to search by student number? Or by last name?");
                System.out.println("Press 1 for Student Number");
                System.out.println("Press 2 for LAST name");
                int option = demand3.nextInt();//utilizes nextInt() method 
                if(option ==1){//if they choose to search by student number
                    Scanner demand40 = new Scanner(System.in);
                    System.out.println("Enter student number");
                    int number = demand40.nextInt();
                    if(countDigits(number) == 6){//one less than student number
                        Scanner demand45 = new Scanner(System.in);
                        System.out.println("Enter updated name: ");
                        String name = demand40.nextLine();
                        if((name.indexOf(",") != -1 && name.indexOf(" ") != -1 && name.indexOf(" ", name.indexOf(" ")) != -1) || (name.indexOf(",") == -1 && name.indexOf(" ") != -1)){
                            System.out.println("Enter new GPA: ");
                            double GPA = demand45.nextDouble();
                            String last = null;
                            if(studentList.editStudentList(number, name, GPA)== true){
                                System.out.println("Student successfully edited");
                            }else {
                                System.out.println("Error, student not found");
                            }

                        } else {
                            tryAgain();

                        }
                    }else{
                        tryAgain();
                    }
                } else if (option == 2){
                    Scanner demand40 = new Scanner(System.in);
                    System.out.print("Enter LAST name: ");
                    String last = demand40.nextLine();
                    Scanner demand45 = new Scanner(System.in);
                    System.out.print("Enter updated name: ");
                    String name = demand40.nextLine();
                    System.out.print("Enter new GPA: ");
                    double gpa = demand40.nextDouble();
                    int number = 0;
                    if(studentList.editStudentList(number,name, gpa) == true) {
                        System.out.println("Student successfully edited");
                    } else {
                        System.out.println("Error, student not found");
                    }

                }else {
                    tryAgain();
                }
                System.out.println();
            } else if (demand == 4){//user wants to clear the whole list
                studentList.clearList();//uses method in ArrayList Class
                System.out.println("List Cleared");
                System.out.println();
            } else if(demand == 5){//user wants to print student list
                System.out.println("Here is your list: ");
                System.out.println();
                studentList.printStudentList(); //ArrayList method
                System.out.println();
            } else if(demand ==6){//user wants to print specific student
                System.out.println("Uh-oh, mehtod not found, try again later");
                System.out.println();
            } else{
                tryAgain();
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

    public static int countDigits(int input){//method that counts digits in the input
        int number = input;
        int count = 0;
        while(number >0){
            number = number /10;
            count +=1;
        }
        return count;
    }

    public static void tryAgain(){ //method for bad inputs
        System.out.println("Problematic Input, try again");
    }

}