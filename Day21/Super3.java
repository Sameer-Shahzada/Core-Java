/* 

    3 -> Super can be used to invoke the parent class method
    
    -> Write a program to demonstrate the use of super keyword for calling the parent class method.

*/
package Day21;

class WildAnimal 
{
    // Create a method
    void eat()
    {
        System.out.println("Animal is eating...");
    }   
}
class Lion extends WildAnimal
{
    // Create a method
    void eat()
    {
        System.out.println("Lion is eating...");
    }
    // Create another method
    void roar()
    {
        System.out.println("Lion roar");
    }
    // Create third method
    void bothWork()
    {
        super.eat();    // calling parent class method.
        roar();
    }
}
class TestWild
{
    public static void main(String[] args) {
        // Create an instance of the class
        Lion lion = new Lion();

        // invoke
        lion.bothWork();
    }
}

