import java.util.Scanner;

// Write a program to demonstrate the use User-defined method.

class UserMethod
{
    public static void main(String[] args) 
    {
        int num; 

        System.out.println("Enter any number");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        // Calling method
        findEvenOdd(num);
    }
        
        public static void findEvenOdd(int num)
        {
            if(num % 2 == 0)
            System.out.println(num + " is Even");
            else
            System.out.println(num + " is Odd");
        }
    
}