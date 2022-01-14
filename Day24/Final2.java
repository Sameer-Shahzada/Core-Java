/* 

    2- final Method
        -> If we declare a method as final method then we cannot override that method.

*/

package Day24;

class Animal 
{
    // Create a method
    final void msg()
    {
        System.out.println("Hello, Animal is created");
    }    
}
class Cat extends Animal
{
    // Create a method 
    void msg()      // Cannot override the final method from Animal (Compile-time error)
    {
        System.out.println("Hello, Cat is created");
    }
}
class TestAnimal
{
    public static void main(String[] args) {
        // Create an instance of the class 
        Cat c1 = new Cat();

        // Invoke method 
        c1.msg();
    }
}
