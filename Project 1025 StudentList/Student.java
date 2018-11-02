
/**
 * Makes Student Objects
 *
 * @author (Ziggy Sheynin)
 * @version (Project 1025)
 */

public class Student{

    //initialize all variable, name (first, middle, and last) and student number and gpa
    public String firstName = "";
    public String middleName = "";
    public String lastName = "";
    public int stuNumber; 
    public double gpa;

    // +++++++++++++++++++++++++++++++++++++++++++++++  setters
    public void setFirstName(String name){
        firstName = name;
    }

    public void setMiddleName(String name){
        middleName = name;
    }

    public void setlastName(String name){
        lastName = name;
    }

    public void setgpa(double GPA){
        gpa = GPA; // sets the students gpa
    }

    public void setstuNumber(int number){
        stuNumber = number; // sets the students number 
    }

    //+++++++++++++++++++++++++++++++++++++++++++++++++  getters
    public String getfullName(){
        //method should get the names of Students in format last name, firstName middleName
        return lastName + "," + firstName + " " + middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getgpa(){
        //gets the student's gpa
        return gpa;
    }

    public int getstuNumber(){
        //gets the student number
        return stuNumber;
    }

}