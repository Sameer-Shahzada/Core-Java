import java.util.Scanner;

// Write a program to find the +ve & -ve number 

class PositiveNegative
{
    public static void main(String[] args) {
       
        int num;

        System.out.println("Enter any numbet to check");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if(num < 0)
        System.out.println("Negative value");
        else if(num == 0)
        System.out.println("Its zero nor negative not positive");
        else 
        System.out.println("Positive value");
        sc.close();
    
    }
}