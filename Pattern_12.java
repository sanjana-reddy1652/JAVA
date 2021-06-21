/* Pattern_12
EDCBA
EDCBA
EDCBA
EDCBA
EDCBA
*/

package Patterns;
public class File1 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 5; i++)  
		{
		for (char j='E'; j >= 'A'; j--) 
		{
			System.out.print(j+ " ");			
		}
		System.out.println();
		}
	} }
