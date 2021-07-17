/* Pattern_40
1
21
321
4321
54321
*/

package Patterns;
public class Pattern_40 {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++)
{
for( int j = 4; j >= i; j--) 
{
System.out.print(" ");
}
for(int n=i; n >= 1;n--)
{
System.out.print(n);
}
System.out.println();
}
} }
