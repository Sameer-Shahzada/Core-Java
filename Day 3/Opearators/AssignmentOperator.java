/*
Java Assignment Operator
Java assignment operator is one of the most common operators. It is used to assign the value on its right to the operand on its left.
*/

public class AssignmentOperator 
{
    public static void main(String[] args) {

        int a = 10;  
        int b = 20;  

        a += 4;   //a=a+4 (a=10+4)  --> 14
        b -= 4;   //b=b-4 (b=20-4)  --> 16 

        System.out.println(a);  
        System.out.println(b);  
    }
}
