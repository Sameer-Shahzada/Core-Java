/* 
    Write a program to print factorial by using recursion 
*/
package Day44;

public class Recursion 
{
    // Create a method
    static int factorial(int n)
    {
        if (n == 1)
            return 1;
        else 
            return (n * factorial(n -1));
    }
    public static void main(String[] args) {
        System.out.println("Factorial is " + factorial(5));
    }
}
