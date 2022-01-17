/*  

    Binding 
        -> Connecting a method call to the method body is known as Binding.
    There are two types of binding are - 
    1- Static Binding (is also known as Early Binding)
    2- Dynamic Binding (is also known as Late Binding)

    Static Binding 
        -> When the type of the object is determined at the compile time (by the compiler) is known as 
        static binding.

    Let consider an example which is based on static binding.
*/

package Day27;

class Animal 
{
    // Create a method
    void eat()
    {
        System.out.println("Animal is eating");
    }    

    public static void main(String[] args) {
        // Create an instance of the class 
        Animal a = new Animal();

        // invoke method
        a.eat();
    }
}
