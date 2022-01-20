/* 

    Abstract class having constructor, data member and methods
        -> An abstract class can have constructor , data members , abstract methods and non - abstract 
        method (with the method body).

*/

//-> Write an example in which having constructor , abstract and non-abstract methods.

package Day30;

abstract class Bike 
{
    // Create a constructor 
    Bike()
    {
        System.out.println("Bike is created");
    }

    // define an abstract method
    abstract void run();

    // create a non - abstract method
    void changeGear()
    {
        System.out.println("Gear changed");
    }

}
class Honda extends Bike
{
    // define the implementation of run method
    void run()
    {
        System.out.println("Honda Bike running safely");
    }
}
class TestBike
{
    public static void main(String[] args) {
        // Create reference type 
        Bike b = new Honda();

        b.changeGear();
        b.run();
    }
}
