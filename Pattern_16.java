/*Pattern_16

5
44
333
2222
11111
*/
package Patterns;
public class Pattern_16 {
	public static void main(String[] args) {
		
		for(int i = 5; i >= 1; i--) 
		{
		for (int j=5; j >= i ;j--)
		{
			System.out.print(i);			
		}
		System.out.println();
		}
	} 
}
