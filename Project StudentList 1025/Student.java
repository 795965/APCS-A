
/**
 * Makes Student Objects
 *
 * @author (Ziggy Sheynin)
 * @version (Project 1025)
 */
import java.util.ArrayList;
public class Student extends StudentRunner
{
    ArrayList<Student>studList = new ArrayList<Student>(); //initializes and declares array list of name studList with Student Objects 
  
    //initialize all variable, name (first, middle, and last) and student number and gpa
    public String firstName;
    public String middleName;
    public String lastName;
    public int stuNumber;
    public double gpa;
    
    

    /**
     * Constructor for objects of class Student
     */
    public Student(String fullName, int stuNumber, double gpa)
    {
        // initialise instance variables-- default Student
        firstName = "Jimmy";
        middleName = "Jim";
        lastName = "Smith";
        stuNumber = 0000000;
        gpa = 0.0;
    }

    /**
     * Student Methods
     */
    public String getfullName(){
        //method should get the names of Students in format last name, firstName middleName
        return lastName + "," + firstName + middleName;
    }
    public double getgpa(){
        //gets the student's gpa
        return gpa;
    }
    public int getstuNumber(){
        //gets the student number
        return stuNumber;
    }
    public String setfirstName(){
        //creates the first name
        return firstName;
    }
    public String setmiddleName(){
        //creates the middle name
        return middleName;
    }
    public String setlastName(){
        //creates the last name
        return lastName;
    }
    
    public double setgpa(){
        //creates the gpa
        return gpa;
    }
    public int setstuNumber(){
        //creates the gpa
        return stuNumber;
    }
}