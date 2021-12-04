import java.util.Scanner;

// Write a program to understand the concept of Switch case statement.

public class SwitchCase 
{
    public static void main(String[] args) 
    {
        int num;
        
        System.out.println("Please enter any number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        switch(num)
        {
            case 1: 
            System.out.println("zero");
            break;

            case 2:
            System.out.println("One");
            break;

            case 3:
            System.out.println("Two");
            break;
            
            default:
            System.out.println(num);
        }
        sc.close();
    }    
}
