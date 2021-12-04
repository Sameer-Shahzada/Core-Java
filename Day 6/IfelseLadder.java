// Write a program to understand the concept of if else ladder.
import java.util.Scanner;
public class IfelseLadder 
{
    public static void main(String[] args) {
        
        int marks;

        System.out.println("Enter student marks");

        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();

        if(marks < 33)
        System.out.println("Fail");
        
        else if(marks > 33 && marks <50)
        System.out.println("Pass");

        else if(marks > 50 && marks <60)
        System.out.println("D Grade");

        else if(marks > 60 && marks <70)
        System.out.println("C Grade");

        else if(marks > 70 && marks <80)
        System.out.println("B Grade");

        else if(marks > 80 && marks <90)
        System.out.println("A Grade");

        else if(marks > 90 && marks <100)
        System.out.println("A+ Grade");

        else 
        System.out.println("Invalid marks");

        sc.close();
    }
}
