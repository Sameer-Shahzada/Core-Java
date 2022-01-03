/*
Static Method

Write a program to demonstrate the use of static method in java 

*/

class Student 
{
    // define data field
    int id;
    String name;
    static String college ="WMIT";

    // Create a static method to change the college name 
    static void change()
    {
        college = "KNIT";
    }

    // Create a constructor to initialize the data fields
    Student(int i , String n)
    {
        id = i;
        name = n;
    }

    // Create a method to display the data 
    void show()
    {
        System.out.println(id + " " + name + " " + college);
    }
}
class Test
{
    public static void main(String[] args) {
       
       // Calling change method
       Student.change();
       
        // Create instance of the class 
        Student s1 = new Student(24, "X");
        Student s2 = new Student(25, "Y");
        
        // invoke 
        s1.show();
        s2.show();
    }
}
