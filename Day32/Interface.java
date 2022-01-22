/*
     Interface 
        -> Interface is blue print of a class in java. Interface is a mechanism which is used to achieve 
        abstraction and multiple inheritance. It have static final data member and abstract method.
        It cannot be instantiated.

        Why use interface 
            -> Interface is used to achieve abstraction.
            -> It provide the functionality of multiple inheritance through interface.
            -> It is used to achieve loose coupling.
        
        Relationship of interface between class and interface.
            -> An interface can extend another interface.
            -> Sub-Class extends Super-class
            -> But a class implement interface.
         
    //-> Write a simple program of interface

*/
package Day32;

interface Printable
{
    // Define a method 
    void print();   // by default it public abstract method.
}
class A implements Printable
{
    // Provide the implementation of parent class method
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        // Create an instance of the class 
        A a = new A();

        a.print();
    }
}
