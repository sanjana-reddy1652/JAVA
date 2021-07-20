/* Pattern_45
E
DD
CCC
BBBB
AAAAA
*/

package Patterns;
public class Pattern_45 {
public static void main(String[] args) {
for(int i = 5; i >= 1; i--) 
{
for( int j = 1; j < i; j++) 
{
System.out.print(" ");
}
for(int n=i; n <= 5;n++) 
{
System.out.print((char)(i+64));
}
System.out.println();
}
} }
