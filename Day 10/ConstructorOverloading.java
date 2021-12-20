
// Write a program to demonstrate the use of constructor overloading.

/*
When a single class contains more than one constructor with the different parameter list then 
constructor overloading occurs. So we have to arrange in a way to execute each constructor 
and perform both constuctor.
*/

class Addition 
{
    // define data fields
    int num1 , num2 , num3;

    // Create two parameter constructor
    Addition(int n1 , int n2)
    {
        num1 = n1;
        num2 = n2;
    }

    // Create three parameter constructor
    Addition(int n1 , int n2 , int n3)
    {
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    // Create method to display the output
    void display()
    {
        System.out.println(num1 + num2 + num3);
    }

}
class Test 
{
    public static void main(String[] args) {
        // Create instance of the class
        Addition a1 = new Addition(4, 6);
        Addition a2 = new Addition(4, 6, 10);
        // invoke the display method 
        a1.display();
        a2.display();
    }
}
