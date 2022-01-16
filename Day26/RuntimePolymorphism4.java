/* 
    Java Runtime Polymorphism with Multilevel Inheritance
*/

package Day26;

class Animal 
{
    // Create a method 
    void eat()
    {
        System.out.println("Animal is eating...");
    }    
}
class Cat extends Animal
{
    // Create a method 
    @Override
    void eat()
    {
        System.out.println("Cat is eating...");
    }
}
class Kitten extends Cat
{
    // Create a method 
    @Override
    void eat()
    {
        System.out.println("Kitty is eating");
    }
}
class TestAnimal 
{
    public static void main(String[] args) {
        // Create types of the Animal Class 
        Animal a1, a2; 
        
        a1 = new Cat();
        a1.eat();

        a2 = new Kitten();
        a2.eat(); 
    }
}