// Write a program to print the table 

import java.util.Scanner;

class Table
{
    public static void main(String[] args) {
        int i , num;

        System.out.println("Enter any number");
       
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(i = 1; i <= 10; i++)
        {
            System.out.println(num * i);
        }

    }
}