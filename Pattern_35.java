/*Pattern_35
E D C B A
D C B A
C B A
B A
A
*/

package Patterns;
public class Pattern_35 {
public static void main(String[] args) {
for(int i = 5; i >= 1; i--) 
{
for (int j=i; j >= 1 ;j--) 
{
System.out.print((char)(j+64)+" ");
}
System.out.println();
}
} }
