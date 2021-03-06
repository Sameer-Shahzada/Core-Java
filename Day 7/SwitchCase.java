
/* 
Syntax of switch case

switch(conditon)
{
    case 1:
    // Statement to be executed.
    break;
    .
    .
    .
    case N:
    // Statement to be executed. 
    break;

    default:
    // Statement to be executed if it is not matched with above statements
}

*/
// Write a program to print the month name by using switch case statement.
import java.util.Scanner;
public class SwitchCase 
{
    public static void main(String[] args) {
        int month;

        System.out.println("Enter any value to print the month name");

        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();

        switch(month)
        {
            case 1:
            System.out.println("January");
            break;

            case 2:
            System.out.println("Febuary");
            break;

            case 3:
            System.out.println("March");
            break;

            case 4:
            System.out.println("April");
            break;

            case 5:
            System.out.println("May");
            break;

            case 6:
            System.out.println("June");
            break;

            case 7:
            System.out.println("July");
            break;

            case 8:
            System.out.println("August");
            break;

            case 9:
            System.out.println("September");
            break;

            case 10:
            System.out.println("October");
            break;

            case 11:
            System.out.println("November");
            break;

            case 12:
            System.out.println("December");
            break;

            default:
            System.out.println("Invalid input");
        }
        sc.close();
    }    
}
