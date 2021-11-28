/* Write a program to print the ASCII value by assigning a variable to the int variable 
by type casting*/

package ASCIIValue;

class ASCIIEX_2
{
    public static void main(String s[])
    {
        char ch1 = 'a';
        char ch2 = 'b';

        int asciivalue1 = (int)ch1;
        int asciivalue2 = (int)ch2;

        System.out.println("The ASCII value of ch1 is "+asciivalue1);
        System.out.println("The ASCII value of ch2 is "+asciivalue2);
    }
}