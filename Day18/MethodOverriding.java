/* 
    Method Overriding
    -> If a sub class (child class) have the same name method as declared in their parent class. 
    It is known as Method Overriding.

    Rules of Method Overriding
    -> It must be an IS-A relationship (Inheritance).
    -> Method name should be same as declared in the parent class 
    -> Method name and parameter list should be same as in parent class 

    Usage of Method Overriding 
    -> It can be used to achieve the runtime polymorphism in java 

*/

// -> Write a program to demonstrate the use of Method Overriding 
package Day18;
class Vehicle
{
    // define a method
    void run()
    {
        System.out.println("Vehicle is running");
    }
}
class Bike extends Vehicle
{
   // define a method as declared in the parent class
   void run()
   {
       System.out.println("Bike is running safely");
   }
}
class VehicleTest
{
    public static void main(String[] args) {
        // Create an instance of the class
        Bike b1 = new Bike();

        // invokation of method
        b1.run();
    }
}