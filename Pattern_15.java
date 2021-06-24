/* Pattern_15
1
12
123
1234
12345
*/
package Patterns;
public class Pattern_15 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++)  
		{
		for (int j=1; j<=i ;j++)
		{
			System.out.print(j);			
		}
		System.out.println();
		}
	}
}
