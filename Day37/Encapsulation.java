/* 
    Encapsulation 
        -> Encapsulation is the process of java which wrap the code and data together into a single unit
        is called Encapsulation.
        For Ex - Capsule(Mixed with several medicine).
    
        -> We can create a fully encapsulated class by making private all the data member in the class 
        and use the setter and getter method to set and get the value.

        -> We can create a read only class and write only class through encapsulation.

        -> It is a way to achieve data hiding.
    
*/

// -> Lets write a simple program to demonstrate the use of Encapsulation.

package Day37;
// Create a fully encapsulated class 
public class Encapsulation
{
    // Make private data member 
    private String name;

    // getter method 
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

}
// Create another class to test the program 
class Test 
{
    public static void main(String[] args) {
        // Create an instance of the class 
        Encapsulation s1 = new Encapsulation();

        // set name 
        s1.setName("Mr. X");

        // get name
        System.out.println(s1.getName());
    }
}