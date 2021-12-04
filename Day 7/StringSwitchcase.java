import java.util.Scanner;

// Write a program to demonstrate the use switch case statement with String.

class StringSwitchcase
{
    public static void main(String[] args) {
        String stringLevel;
        int level = 0;

        System.out.println("Enter string value");

        Scanner sc = new Scanner(System.in);
        stringLevel = sc.next();

        switch(stringLevel)
        {
            case "Beginner": level = 1;
            break;

            case "Intermediate": level = 2;
            break;

            case "Advanced": level = 3;
            break;

            default:
            level = 0;
            break;

        }
        System.out.println("Your level is " + level);
        sc.close();
    }
}