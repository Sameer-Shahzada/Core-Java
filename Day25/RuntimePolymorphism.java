/* 
    Polymorphism 
        Polymorphism is a concept in java which is used to perform a single action in different ways.
    The word 'Polymorphism' is a combination of 'poly + morphism' in which poly means many and 
    morphims means forms. So it means many forms.

    There are two types of polymorphism 
    1- Method Overloading (Compile - time polymorphism)
    2- Method Overriding  (Runtime polymorphism)

    Here let discuss about Runtime polymorphism
        -> If a subclass (child class) have same name method as declared in the parent class then it 
        is known as Runtime polymorphism.
    
*/

// - > Write a program to demostrate the use of Runtime polymorphism in java


package Day25;

class Bank 
{
    // Create a method 
    float getRateofInt()
    {
        return 0;
    }
}
class SBI extends Bank
{
    // Create a method
    float getRateofInt()
    {
        return (7.5f);
    }
}
class AXIS extends Bank 
{
    // Create a method
    float getRateofInt()
    {
        return (6.5f);
    }
}
class PNB extends Bank
{
    // Create a method
    float getRateofInt()
    {
        return (5.5f);
    }
}
class TestBank
{
    public static void main(String[] args) {
        // Create type of the Bank class 
        Bank b;

        // initialize objects 
        b = new SBI();
        System.out.println(b.getRateofInt());

        b = new AXIS();
        System.out.println(b.getRateofInt());

        b = new PNB();
        System.out.println(b.getRateofInt());
    }
}