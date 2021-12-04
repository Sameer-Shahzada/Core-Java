import java.util.Scanner;

// Write a program to find out the leap year 

// Condition -> year % 4 & 100 != 0 || year % 400  == 0

public class LeapYear 
{
    public static void main(String[] args) {
        int year;

        System.out.println("Enter year ");

        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if((year % 4 == 0  && year % 100 != 0) || (year % 400 == 0))
        System.out.println("Leap Year");
        else 
        System.out.println("Not a leap year");
        sc.close();

    }    
}
