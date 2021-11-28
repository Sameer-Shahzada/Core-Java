/*
Write a program to print the ASCII value from (0 to 255) of all characters.
 */

package ASCIIValue;

public class ASCIIEX_5 
{
    public static void main(String s[])
    {
        int i;
        for(i = 0; i<=255; i++)
        {
            System.out.println("The ASCII value of" +" "+ (char)i +" "+ "is:"+ i);
        }
    }
}
