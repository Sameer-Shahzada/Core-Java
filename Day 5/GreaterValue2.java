// Write a program to find the greatest value by user input 

import java.util.Scanner;

class GreaterValue2
{
    public static void main(String[] args) 
    {
        int num1 , num2;    

        System.out.println("Enter the value for num1 & num2");

        Scanner scr = new Scanner(System.in);

        num1 = scr.nextInt();
        num2 = scr.nextInt();

        if(num1 > num2)
        System.out.println("num1 is greater");
        else
        System.out.println("num2 is greater");
        scr.close();
    }
}