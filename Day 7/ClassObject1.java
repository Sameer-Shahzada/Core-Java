
/*
Ways to initialize object
->  By reference variable
->  By Constructor
->  By Method
*/
// Write a program to demonstrate the use of reference variable where we use reference variable to
// initialize the object.

class Student1 
{
    // define fields.
    int id;
    String name;

}
class StudentTest1
{
    public static void main(String[] args) {
                
        // Create object of class
        Student1 s1 = new Student1(); 
        // initializing objects through reference
        s1.id = 24;
        s1.name = "Md. Sameer Shahzada";
        
        System.out.println(s1.id);
        System.out.println(s1.name);
    }  
}
