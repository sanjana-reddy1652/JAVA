/* Pattern_41
A
AB
ABC
ABCD
ABCDE
*/

package Patterns;
public class Pattern_41 {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++) 
{
for( int j = 4; j >= i; j--) 
{
System.out.print(" ");
}
for(int n=1; n <= i;n++) 
{
System.out.print((char)(n+64));
}
System.out.println();
}
} }
