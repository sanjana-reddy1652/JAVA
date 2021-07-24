/* Pattern_46
*****
****
***
**
*
*/

package Patterns;
public class Pattern_46 {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++) 
{
for( int j = 1; j < i; j++) 
{
System.out.print(" ");
}
for(int n=5; n >= i;n--) 
{
System.out.print("*");
}
System.out.println();
}
} }
