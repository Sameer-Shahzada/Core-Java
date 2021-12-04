import java.util.Scanner;

// Write a program to print the vowels by switch statement.

public class SwitchCase2 
{
    public static void main(String[] args) {
        char ch;

        System.out.println("Enter any character");

        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        switch(ch)
        {
            case 'a':
            System.out.println("Vowels");
            break;

            case 'e':
            System.out.println("Vowels");
            break;

            case 'i':
            System.out.println("Vowels");
            break;

            case 'o':
            System.out.println("Vowels");
            break;

            case 'u':
            System.out.println("Vowels");
            break;

            default:
            System.out.println("Consonant");

        }
        sc.close();
    }    
}
