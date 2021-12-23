/*
There is no copy constructor concept in java like C++ but we can achieve copy constructor through
some of the following ways - 
1 - By Constructor
2 - Assigning one object value into another object.
3 - clone() method.
*/

/* Write a program to initialize the value through constructor and assign the one object value 
into another object.
*/

class Student
{
    // define data fields of Student class
    int id;
    String name;

    // Create a constructor to initialize the variables
    Student(int i , String n)
    {
        id = i;
        name = n;
    }

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
        Student s1 = new Student(24 , "X");
        Student s2 = new Student(0, null);

        // Assigning s1 object values into s2 object
        s2.id = s1.id;
        s2.name = s1.name;

        s1.show();
        s2.show();
    }
}