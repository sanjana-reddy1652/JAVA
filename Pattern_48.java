/* Pattern_48
AAAAA
BBBB
CCC
DD
E
*/

package Patterns;
public class Pattern_48 {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++) 
{
for( int j = 1; j < i; j++) 
{
System.out.print(" ");
}
for(int n=5; n >= i;n--) 
{
System.out.print((char)(i+64));
}
System.out.println();
}
} 
}
