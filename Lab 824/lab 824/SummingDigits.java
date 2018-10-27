// A+ Computer Science  -  www.apluscompsci.com

//this example demonstrates how to to use a
//while loop to sum all of the digits of a number

public class SummingDigits
{
   public static void main(String args[])
   {
        int number = 9154;
        int total = 0;
        while( number > 0 ) //while number is greater than 0
        {
           System.out.println( number % 10 );  //chop off the right most digit of number
           total = total + (number % 10); //add the right most digit to the total
           
           number = number / 10;
           
        }
        System.out.println(total); //print out the number
        
          
           

        
    }
}
