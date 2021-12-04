// Write a program to define the concept of nested if 

import java.util.Scanner;
public class NestedIf 
{
    public static void main(String[] args) 
    {
        int age , weight;
        
        System.out.println("Please enter the age & weight");

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        weight = sc.nextInt();

        if(age <= 18)
            if(weight > 45)
            System.out.println("You are eligible to donate the blood");
            else
            System.out.println("You are not eligible");
        else
        System.out.println("Your age must be 18");
        sc.close();
    }    
}
