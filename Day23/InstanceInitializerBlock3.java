/* 
    Rules of Instance Initializer Block 

    1- The instance initializer block is invoked when the object of the class is created.
    2- The instance initializer block is invoked after the parent class constructor is invoked 
    (i.e  after super() constructor call()).
    3- The instance initializer block comes in order in which they appear.
*/


package Day23;

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
        super();
        System.out.println("Dog is created");
    }
    // Instance Initializer Block
    {
        System.out.println("Instance Initializer Block");
    }

    public static void main(String[] args) {
        // Create an instance of the class 
        Dog d1 = new Dog();
    }
}
