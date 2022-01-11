/* 
    2- Super() can be used to invoke immediate parent class constructor 

    -> Write a program to demonstrate the use of super() to calling the parent constructor
*/


package Day21;

class Animal
{
    // Create a constructor
    Animal()
    {
        System.out.println("Animal is created");
    }
}
class Dog extends Animal
{
    // Create a constructor
    Dog()
    {
        super();    // invoke parent class constructor | if we remove super() calling here then 
        System.out.println("Dog is here");  // jvm provide super() calling implicitly
        
    }
}
class Test
{
    public static void main(String[] args) {
        // Create an instance of the class
        Dog dog = new Dog();

    }
}
