
// Write a program to copying values without constructor.

class TestStudent 
{
    // define data fields of Student2 class
    int id;
    String name;
     
    // Create a method to show the data 
    void show()
    {
        System.out.println(id + " " + name);
    }

}
class Test
{
    public static void main(String[] args) {
        // Create instance of the class
        TestStudent s1 = new TestStudent(); 
        TestStudent s2 = new TestStudent(); 

        // initialize the values
            s1.id = 24;
            s1.name = "X";

        // Assigning values through reference variables
            s2.id = s1.id;
            s2.name = s1.name;

        // Invoke the method
        s1.show();
        s2.show();

    }
}
