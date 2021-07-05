/* Pattern_31
A A A A A
B B B B
C C C
D D
E
*/
package Patterns;
public class Pattern_31 {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++)
{
for (int j=5; j >= i ;j--) 
{
System.out.print((char)(i+64)+" ");
}
System.out.println();
}
} 
}
