
//Write a program to understand the concept of if-else Statement.

import java.util.Scanner;
public class Ifelse 
{
    public static void main(String[] args) {
        
        int a , b;

        System.out.println("Enter the value for a & b");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if(a > b)
        System.out.println("A is greater");
        else
        System.out.println("B is greater");
        sc.close();

    }    
}
