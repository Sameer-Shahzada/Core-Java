/*
    Method Overloading
    -> When we have more then one method in a single class with the same name then the method overloading
    occurs in program and we need to arrange both method in a way to execute each method.

    -> Ways of method overloading
    1- By changing the no. of arguments
    2- By changing the data types
  

*/

// -> Write a program to demonstrate the use of method overloading by changing the no. of arguments.

package Day17;

class Addition 
{
    // Create a method with two args parameter list
    void add(int x , int y )
    {
        System.out.println(x+y);
    }

    // Create another method with three parameter list
    void add(int x , int y , int  z)
    {
        System.out.println(x+y+z);
    }
}
class Test
{
    public static void main(String[] args) {
        // Create an instance of the class 
        Addition a1 = new Addition();

        a1.add(4,5,1);
        a1.add(4, 5);
    }
}
