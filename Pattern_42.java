/* Pattern_42
A
BB
CCC
DDDD
EEEEE
*/

package Patterns;
public class Pattern_42 {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++) 
{
for( int j = 4; j >= i; j--)
{
System.out.print(" ");
}
for(int n=1; n <= i;n++) 
{
System.out.print((char)(i+64));
}
System.out.println();
}
} }
