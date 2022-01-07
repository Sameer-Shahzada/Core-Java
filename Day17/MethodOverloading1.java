// -> Write a program to demonstrate the use of method overloading by changing the no. of arguments.

package Day17;

class Adder 
{
    // define data fields
    int num1 , num2 , num3;

    // Create a method with two parameter list
    void addition(int n1 , int n2)
    {
        num1 = n1;
        num2 = n2;
    }

    // Create another method with three parameter list 
    void addition(int n1 , int n2 , int n3)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }

    // Create a method to display the result 
    void show()
    {
        System.out.println(num1 + num2 + num3);
    }
}
class TestAdder
{
    public static void main(String[] args) {
        // Create an instance of the Adder class
        Adder a1 = new Adder();
        Adder a2 = new Adder();

        // pass values 
        a1.addition(4, 4);
        a2.addition(4, 5, 9);

        // invoke the show method to display the result
        a1.show();
        a2.show();
    }
}
