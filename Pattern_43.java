/* Pattern_43
A
BA
CBA
DCBA
EDCBA
*/

package Patterns;
public class Pattern_43 {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++) 
{
for( int j = 4; j >= i; j--) 
{
System.out.print(" ");
}
for(int n=i; n >= 1;n--) 
{
System.out.print((char)(n+64));
}
System.out.println();
}
} 
}
