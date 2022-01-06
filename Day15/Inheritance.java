/*
    Inheritance 
        -> It is the technique in java which acquire the behaviour and properties of their parent 
        object is known as Inheritance.

        There are various types of inheritance in java are as follows-
        1- Single level inheritance
        2- Multi-level Inheritance
        3- Hierarchichal inheritance 
        4- Multiple Inheritance
        5- Hybrid Inheritance

    Note - Multiple inheritacne is not supported in java through classes.
*/

// Write a program to demonstrate the use of simple / single level inheritance
package Day15;
class Animal 
{
    // Create a method 
    void eat()
    {
        System.out.println("Eating");
    }

    void bark()
    {
        System.out.println("Barking");
    }
}
class Dog extends Animal
{
    public static void main(String[] args) {
        // Create instance of the class
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
