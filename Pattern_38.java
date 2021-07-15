/* Pattern_38
1
12
123
1234
12345
*/

package Patterns;
public class Pattern_38 {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++) 
{
for( int j = 4; j >= i; j--)
{
System.out.print(" ");
}
for(int n=1; n <= i ; n++)
{
System.out.print(n);
}
System.out.println();
}
} }
