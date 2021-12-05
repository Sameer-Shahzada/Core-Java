/*
Syntax - 
do 
{
    Statements to be executed
    incr/decr;
}
while(conditon)
*/

// Write a program to demonstrate the use do while loop.
public class Dowhile 
{
    public static void main(String[] args) {
        int i = 1;
        do
        {
            System.out.println(i);
            i++;
        }
        while(i<=10);
    }    
}
