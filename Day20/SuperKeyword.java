/* 
    Super 
    -> Super keyword is a reference variable which is used to  refer immediate parent class object.

    Usage of Super keyword 
    1- Super keyword can be used to refer immediate parent class instance variable 
    2- Super() can be used to invoke immediate parent class constructor 
    3- Super can be used to invoke immediate parent class method.

    -> Write a program to demonstrate the use of Super keyword for parent class instance variable.

*/

package Day20;

class Animal 
{
    // define an instance variable 
    String color = "black";    
}
class Dog extends Animal
{
    // define an instance variable for Dog class 
    String color = "white";
    
    // Create a method to print both class color variable
    void print()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
    
}
class TestSuper
{
    public static void main(String[] args) {
        // Create an instance of Dog class
        Dog d1 = new Dog();
        d1.print();
        

        
    }
}