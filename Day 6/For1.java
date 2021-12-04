
// Write a program to find the first 10 digit sum of natural number.

public class For1 
{
   public static void main(String[] args) {
    int i; 
    int sum = 0;

    for(i = 1; i <= 10; i++)
    {
        sum = sum + i;
        System.out.println(sum);
    }
   }
}
