/* Pattern_23
E
E D
E D C
E D C B
E D C B A
*/

package Patterns;
public class Pattern_23 {
public static void main(String[] args) {
for(int i = 5; i >= 1; i--)
{
for (int j=5; j >= i ;j--) 
{
System.out.print((char)(j+64)+" ");
}
System.out.println();
}
} 
}
