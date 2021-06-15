//student details for N number of students

package pack;
import java.util.*;
public class while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch = 1; 
		while(ch==1)
		{
			System.out.println("enter sno: ");
			int sno = sc.nextInt();
			System.out.println("enter sname: ");
			String sname = sc.next();
			System.out.println("sno = "+sno);
			System.out.println("sname = "+sname);
System.out.println("enter choice: 1 for input else quit");
			ch = sc.nextInt();
		}		
		System.out.println("end of data");
	} }
