/*
Multiple Inheritance 

-> When a single class inherit multiple class then it is known as multiple inheritance such as 
class C extends A,B

Note -> Multiple inheritance is not supported through classes in java 

Let understand through program why multiple inheritance is not supported in java through classes.

*/
package Day16;

class PrinterMachine 
{
    // Create a method
    void print()
    {
        System.out.println("Print through big machine");
    }    
}
class ColorPrinter
{
    // Create a method
    void print()
    {
        System.out.println("Print through color printer");
    }
}
class BlackPrinter extends PrinterMachine,ColorPrinter  // Suppose if it were 
{
    // create a method
    void msg()
    {
        System.out.println("Hello , I m in BlackPrinter class");
    }
}
class Test2
{
    public static void main(String[] args) {
        // Create an instance of the class
        BlackPrinter bp = new BlackPrinter();

        bp.print();     /* now ambiguity occurs in program which print method will execute that's
                            why multiple inheritacne is not supported in java through class 
                            it can be acheive through interface in java.
                        */
    }
}