// A+ Computer Science
// www.apluscompsci.com

//for loop used to total up values

import static java.lang.System.*;

public class ForTotal
{
	public static void main(String args[])
	{
		int total = 0;
		for(int run=1; run<=10; run=+4)  //change the 5 stop value and rerun
		{
			total=total+run;
		}
		out.println(total);
	}
}
