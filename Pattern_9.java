/* Pattern_9

A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
*/

package Patterns;
public class Pattern_9 {
	public static void main(String[] args) {
		
		for(int i = 1; i<=5;i++) 
		{
		for (int j =5; j>=1; j--) 
		{
			System.out.print((char)(i+64));			
		}
		System.out.println();
		}
	} 
}
