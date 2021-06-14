//program to accept age more than 18 and display corresponding message
package cond;
import java.util.*;
public class If_condition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Age: ");
		int a = sc.nextInt(); // a = 20
		if(a > 18) // true
		{	System.out.println("Age is above 18"); }
	}
}
