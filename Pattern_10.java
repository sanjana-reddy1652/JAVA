/* Pattern_10
ABCDE
ABCDE
ABCDE
ABCDE
ABCDE
*/
package Patterns;
public class Pattern_10 {
	public static void main(String[] args) 
  {
		
		for(char i = 'A'; i<='E';i++) 
		{
		for (char j ='A'; j<='E'; j++)
		{
			System.out.print(j);			
		}
		System.out.println();
		}
	} 
}
