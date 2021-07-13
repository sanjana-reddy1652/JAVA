/* Pattern36:
----------
*
**
***
****
*****
*/

package Patterns;
public class Pattern_36 {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++) 
{
for( int j = 4; j >= i; j--) 
{
System.out.print(" ");
}
for(int n=1; n <= i;n++) 
{
System.out.print("*");
}
System.out.println();
}
} }
