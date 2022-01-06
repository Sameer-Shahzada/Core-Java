/* 
Heirarchichal Inheritance 
-> When two or more classes inherit a single class then it is known Heirarchichal inheritance.

*/


package Day16;

class Animal1 
{
    // create a method
    void eat()
    {
        System.out.println("Eating");
    }    
}
class Dog extends Animal1
{
    // Create a method
    void bark()
    {
        System.out.println("Dog Barking.");
    }
}
class BabyDog extends Animal1
{
    // Create a method
    void weep()
    {
        System.out.println("BabyDog weeping");
    }
}
class Test1 
{
    public static void main(String[] args) {
        // Create an instance of the class
        BabyDog bd = new BabyDog();

        bd.weep();
        bd.eat();

        // Create an instance of Dog class
        Dog d = new Dog();

        d.bark();
        d.eat();


    }
}
