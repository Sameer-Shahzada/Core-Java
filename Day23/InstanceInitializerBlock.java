/* 
    Instance Initializer Block 
    -> Instance initializer block is used to initialize the instance data member. It run each time 
    when the object of class is created.

*/

package Day23;

class Bike  
{
    // Create an instance variable
    int speed;

    // instance initializer block 
    {
        speed = 55;
    }

    // Create a constructor 
    {
        System.out.println("Bike run at a speed of " + speed +"km/hr");
    }

    public static void main(String[] args) {
        // Create an instance of the class
        Bike b1 = new Bike();
        Bike b2 = new Bike();
    }
}
