/* 
     Abstraction 
        -> Abstraction is a process in java which is used to hiding the internal detail and show the 
        necessary detail to the user.

     Abstract class 
        -> A class which is declared with abstract keyword then it is called abstract class. An abstract 
        class can have abstract and non - abstract methods.

     Ways to achieve abstraction 
     -> Abstraction (0 to 100%)
     -> Interface (100%)
    
     Points to remember 
     -> An abstract class must declare with abstract keyword.
     -> An abstract class can have abstract and non-abstract method.
     -> It cannot be instantiated.
     -> It needs to be extended when a sub class(child class) contain the implementation of abstract method.
     -> It can have constructor and methods also.
     -> It can have final methods which will force the subclass not to change the body of the method.

*/

//-> Write a program to demonstrate the use of abstract class 

package Day29;

abstract class Bike 
{
    // Create an abstract method
    abstract void run();
}
class Honda extends Bike
{
    // define the implementation of abstract method here
    void run()
    {
        System.out.println("Honda bike running safely");
    }
}
class TestBike
{
    public static void main(String[] args) {
        // We cannot create the instance of abstract class thats why we create the object reference here
        Bike obj = new Honda();

        // invoke method
        obj.run();
    }
}
