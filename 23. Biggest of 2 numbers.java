//Biggest of 2 numbers 
package cond;
import java.util.*;
public class Big {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		int a = sc.nextInt(); 
		int b = sc.nextInt();		
if(a>b)	
System.out.println("bigger number = "+ a);
else
System.out.println("bigger number = "+ b);
	}
}
