/*Pattern_32
A B C D E
A B C D
A B C
A B
A
*/
package Patterns;
public class Pattern_32 {
public static void main(String[] args) {
for(int i = 5; i >= 1; i--) 
{
for (int j=1; j <= i ;j++)
{
System.out.print((char)(j+64)+" ");
}
System.out.println();
}
}
}
