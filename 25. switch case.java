//switch case

package pack;
import java.util.*;
public class Switch {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter char:");
	String a= sc.next(); 	
	switch(a)
	{
	case "a": System.out.println("vowel"); break;
	case "e": System.out.println("vowel"); break;
	case "i": System.out.println("vowel"); break;
	case "o": System.out.println("vowel"); break;
	case "u": System.out.println("vowel"); break;
	default : System.out.println("Not Vowel");
	}
}}