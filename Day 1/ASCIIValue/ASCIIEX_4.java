/* Write a program to print the ASCII value by taking a user input. */

package ASCIIValue;
import java.util.Scanner;
public class ASCIIEX_4 
{
    public static void main(String s[])
    {
        
        System.out.println("Enter any character to find the ASCII value");
        
        char ch;
        int asciivalue;

        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        asciivalue = ch;
        
        System.out.println("Entered character ASCII value is " + asciivalue);
        sc.close();
    }   
}
