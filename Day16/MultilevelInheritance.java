/*
    Multilevel Inheritance
    -> Let consider a scenerio we have three classes A,B,C. A is the super class for B & C . B is
    the super class for C.
    So , when class C extends class B and class B extends class A then it is known as Multilevel 
    inheritance.

*/

// Write a program to demonstrate the use of multilevel inheritance 

package Day16;

class Animal 
{
    // Create a method
    void eat()
    {
        System.out.println("Eating...");
    }
}
class Cat extends Animal
{
    // Create a method
    void meow()
    {
        System.out.println("Cat meow");
    }

}
class kitten extends Cat
{
    // Create a method
    void sleep()
    {
        System.out.println("kitty cat is sleeping");
    }
}
class Test
{
    public static void main(String[] args) {
        Cat c = new Cat();
        kitten k = new kitten();

        c.eat();
        k.eat();

        k.sleep();
        k.meow();
    }
}
