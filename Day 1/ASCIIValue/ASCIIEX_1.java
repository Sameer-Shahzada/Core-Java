/*

ASCII acronym for American Standard Code for Information Interchange. 
It is a 7-bit character set contains 128 (0 to 127) characters. 
It represents the numerical value of a character. For example, the ASCII value of A is 65.

There are two ways to print ASCII value in Java

1-Assigning a Variable to the int Variable
2-Using Type-Casting

*/

/* Write a program to print the ASCII value by assigning a variable to the int variable */

package ASCIIValue;

class ASCIIEX_1
{
    public static void main(String s[])
    {
        // Assign the characters into the ch1 & ch2 variable.
        char ch1 = 'a';
        char ch2 = 'b';

        int asciivalue1 = ch1;
        int asciivalue2 = ch2;

        System.out.println("The ASCII value of ch1 is"+" "+asciivalue1);
        System.out.println("The ASCII value of ch2 is"+" "+asciivalue2);

    }
}
