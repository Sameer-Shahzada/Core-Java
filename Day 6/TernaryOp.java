import java.util.Scanner;

// Write a program to understand the concept of ternary operator.

public class TernaryOp 
{
    public static void main(String[] args) {
        
        int num;

        System.out.println("Enter any number to check");
        
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        String result = (num % 2 == 0)?"even number":"odd number";

        System.out.println(result);

        sc.close();

    }    
}
