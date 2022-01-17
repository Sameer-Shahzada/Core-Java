/* 

    Dynamic Binding
        -> When type of the object is determined at the runtime it is known Dynamic Binding.
*/

// -> Write a program to demonstrate the use of Dynamic Binding.

package Day27;

class WildAnimal 
{
    // Create a method for WildAnimal class 
    void eat()
    {
        System.out.println("Wild Animal is eating...");
    }
}
class Lion extends WildAnimal
{
    // Create a method
    @Override
    void eat()
    {
        System.out.println("Lion is eating");
    }
}
class TestWild
{
    public static void main(String[] args) {
        // Create an instance of the class 
        WildAnimal obj = new Lion();

        // invoke method
        obj.eat();
    }
}
