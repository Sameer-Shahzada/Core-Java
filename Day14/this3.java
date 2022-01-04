/* 
    -> this keyword is used to refer the current class constructor
   Write a program to demonstrate the use of this keyword for current class constructor
*/

package Day14;

class this3 
{
    // define a constructor 
    this3()
    {
        System.out.println("Hello , I'm Default constructor");
    }
    // define the parameterized constructor
    this3(int x)
    {
        this();
        System.out.println(x);
    }
}
class Testconstructor
{
    public static void main(String[] args) {
        // Create instance of the class 
        this3 obj = new this3(24);

        
    }
}
