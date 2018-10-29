
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> studList = new ArrayList<Student>(); //initializes and declares array list of name studList with Student Objects 

    public static void addStudentList(String name, int number, double gpa){
        Student s1 = new Student ();
        s1.setFirstName(name);
        s1.setstuNumber(number);
        s1.setgpa(gpa);

        
    }

    public void printStudentList(){
        for (int i = 0; i < studList.size(); i++){
            System.out.println(i+1 + ". Name: " + studList.get(i).getfullName() + ". Student Number: " + studList.get(i).getstuNumber() +",GPA: " + studList.get(i).getgpa()); //creates the student list array

        }
    }
    
}
