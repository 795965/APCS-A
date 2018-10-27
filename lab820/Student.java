
/**
* First Class Lab 816
 * 
 * @ZiggySheynin 
 * @ version 816 
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int studNumber; 
    private boolean stuActive;
    private double stuGPA;
    private String stuName;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        studNumber = 0;
        stuActive = true;
        stuGPA = 0.0;
        stuName = "name";
    }

    /**
     * Student Methods
     */
    public void setstudNumber (int sn){
        studNumber = sn;
        //sn parameters for studNumber, name
    } 
    
    public int getstudNumber() {
        // put your code here
        return studNumber;
    }
    public void setstuActive (boolean sa){
        stuActive = sa;
    }
    public boolean getstuActive(){
        return stuActive;
    }
    public void setstuGPA (double sg) {
        stuGPA = sg;
    }
    public double getstuGPA (){
        return stuGPA;
    }
    public void setstuName (String sna) {
        stuName = sna;
    }
    public String getstuName(){
        return stuName;
    }
}
    