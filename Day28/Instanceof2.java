/*
    An object of subclass type is also a type of their parent class. If Dog class inherit Animal class
    then the instance of the Dog class can be referred either Dog or Animal class.
*/
package Day28;

class Animal 
{

}
class Dog extends Animal 
{
    public static void main(String[] args) {
        // Create an instance of the class 
        Dog d = new Dog();

        System.out.println(d instanceof Dog);
        System.out.println(d instanceof Animal);
    }
}
