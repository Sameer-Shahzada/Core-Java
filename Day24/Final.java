/* 
    Final Keyword
    -> The final keyword is used to restrict the user. It may be use in various context such as -
    1- Class 
    2- Method
    3- Instance Variable
    
*/
//-> If we declare a class as final class then we cannot inherit that class.
    //-> Write a program to demonstrate the use of final keyword for final class 

package Day24;

final class TestA 
{
    void printMsg()
    {
        System.out.println("Hello, I'm TestA class");
    }
}
class TestB extends TestA   // Compile time error occurs because we cannot inherit the final class. 
{
    void hello()
    {
        System.out.println("Hello, I'm TestB class ");
    }
}
class TestM
{
    public static void main(String[] args) {
        // Create an instance of the class 
        TestB t1 = new TestB();
    }
}