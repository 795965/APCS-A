
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
    public Student()
    {
        // initialise instance variables-- default Student
        firstName = "Jimmy";
        middleName = "Jim";
        lastName = "Smith";
        stuNumber = 0;
        gpa = 0.0;
    }

    /**
     * Student Methods
     */
    public String getfullName(){
        return lastName + "," + firstName + middleName;
    }
    public double getgpa(){
        return gpa;
    }
    public double getstuNumber(){
        return stuNumber;
    }
    public String setfirstName(){
        return firstName;
    }
    public String setmiddleName(){
        return middleName;
    }
    public String setlastName(){
        return lastName;
    }
    public double setgpa(){
        return gpa;
    }
    public double setstuNumber(){
        return stuNumber;
    }
}