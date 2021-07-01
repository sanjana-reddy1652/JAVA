/* Pattern_25
A
B A
C B A
D C B A
E D C B A
*/

package Patterns;
public class pattern_25{
public static void main(String[] args) {
for(int i = 1; i <= 5; i++) 
{
for (int j=i; j >= 1 ;j--) 
{
System.out.print((char)(j+64)+" ");
}
System.out.println();
}
} 
}
