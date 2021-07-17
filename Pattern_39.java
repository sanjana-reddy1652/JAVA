/* Pattern_39
5
45
345
2345
12345
*/

package Patterns;
public class Pattern_39 {
public static void main(String[] args) {
for(int i = 5; i >= 1; i--) 
{
for( int j = 1; j < i; j++) 
{
System.out.print(" ");
}
for(int n=i; n <= 5;n++) 
{
System.out.print(n);
}
System.out.println();
}
} }
