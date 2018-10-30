
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class StudentList {
    ArrayList<Student> studList = new ArrayList<Student>(); //initializes and declares array list of name studList with Student Objects 

    public void addStudentList(String name, int number, double gpa){
        //creates student object s1, with a first, middle, and last name and number and gpa and adds it to the array with method add()
        Student s1 = new Student ();
        s1.setFirstName(name);
        s1.setMiddleName(name);
        s1.setlastName(name);
        s1.setstuNumber(number);
        s1.setgpa(gpa);
        studList.add(s1);

    }

    public boolean deleteStudent(String last){
        boolean deleted = false;
        for(int i = 0; i < studList.size(); i++){
            if(studList.get(i).getLastName().equals(last)){
                studList.remove(i); //if the last name searched is the same as i, get rid of that student
                deleted = true; //if it is deleted then the action is complete
            }
        }

        return deleted;
    }//if the student was or was not deleted (true if yes, false if no)

    public boolean editStudentList(int number, String name, double gpa){
        boolean edited = false; //starts unedited
        for (int i = 0; i < studList.size(); i++){
            if(studList.get(i).getstuNumber() == number){
                Student student = new Student();// creates new student object to edit
                student.setFirstName(name); //gives new student first last and middle name, gpa and number
                student.setMiddleName(name);
                student.setlastName(name);
                student.setgpa(gpa);
                studList.set(i, student);
                edited = true; //once edited boolen equals true
            }
        }
        return edited;
    }

    public void clearList(){
        studList.clear(); //uses ArrayList method clear() to get rid of all objects in arraylist
    }

    public void printStudentList(){
        if(studList.size() > 0){
            for (int i = 0; i < studList.size(); i++){
                System.out.println(i+1 + ". Name: " + studList.get(i).getfullName() + ". Student Number: " + studList.get(i).getstuNumber() +",GPA: " + studList.get(i).getgpa()); //creates the student list array

            }
        }else {
            System.out.println("Your list is empty");
        }
    }
}

