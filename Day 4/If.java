/*
It is the most basic statement among all control flow statements in Java. 
It evaluates a Boolean expression and enables the program to enter a block of code 
if the expression evaluates to true.

Syntax of if statement is given below.

if(condition) {    
statement 1; //executes when condition is true   
}    
*/
class Student 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
        
        if(a < b)
        System.out.println("Min" + a);

    }
}