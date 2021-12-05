
// Write a program to initialize the object through constructor.

class Student3 
{
    // define data fields
    int id;
    String name;
    
    Student3(int i , String n)
    {
        id = i;
        name = n;
    }
    void display()
    {
        System.out.println(id + " " + name);
    }
}
class StudentTest3
{
    public static void main(String[] args) {
        // Create instance of the class 
        Student3 s3 = new Student3(24, "Md Sameer");

        s3.display();
    }
}
