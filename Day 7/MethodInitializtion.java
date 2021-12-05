
// Write a program to initialize the objects with the help of method.

class Student2 
{
    // define fields
    int id;
    String name;

    void insertRecord(int i, String n)
    {
        
        id = i;
        name = n;
    }

    void display()
    {
        System.out.println(id + " " + name);
    }
}
class StudentTest2
{
    public static void main(String[] args) {
        
        // Create object of the class
        Student2 s2 = new Student2();

       
        s2.insertRecord(24, "Mohd Sameer");
         // Invoke through method
        s2.display();

         
    }
}
