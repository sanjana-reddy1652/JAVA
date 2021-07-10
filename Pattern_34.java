/* Pattern_34
E D C B A
E D C B
E D C
E D
E
*/

package Patterns;
public class Pattern_34 {
public static void main(String[] args) {
for(int i = 1; i <= 5; i++)
{
for (int j=5; j >= i ;j--) 
{
System.out.print((char)(j+64)+" ");
}
System.out.println();
}
} 
}
