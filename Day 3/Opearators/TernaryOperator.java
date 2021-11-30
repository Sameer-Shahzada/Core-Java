/*
Java Ternary Operator

Java Ternary operator is used as one line replacement for if-then-else statement and used a lot 
in Java programming. It is the only conditional operator which takes three operands.
*/

public class TernaryOperator 
{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int Minresult = (a<b)?a:b;

        System.out.println(Minresult);
    }
}
