/* 

Que - Is final method inherited ?
Ans - Yes 

*/
package Day24;

class WildAnimal 
{
    // Create a final method 
    final void eat()
    {
        System.out.println("Eating the food");
    }
}
class Lion extends WildAnimal
{
    public static void main(String[] args) {
        // Create an instance of the class 
        Lion l1 = new Lion();

        // invoke method
        l1.eat();
    }
}

