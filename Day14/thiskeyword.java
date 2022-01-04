/*
    this keyword in java is a reference variable that refers to the current object.
    -> Usage of this keyword
    1- this keyword is used to refer the current class instance variable 
    2- this keyword is used to refer the current class method
    3- this keyword is used to refer the current class constructor
    4- this keyword is used to pass as argument in the method call 
    5- this can be passed as an argument in the constructor call
    6- this can be used to return the current class instance from the method
*/

// Write a program to demonstrate the use this keyword 

package Day14;

class Student
{
    // define the data fields of the class
    int id;
    String name;
    int age;

    // Create a constructor to initialize the instance variable
    Student(int id, String name ,int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    // Create a method to display 
    void display()
    {
        System.out.println(id + " " + name + " " + age);
    }

}
class Test 
{
    public static void main(String[] args) {
        // Create instance of the class
        Student s1 = new Student(1, "X", 24);
        Student s2 = new Student(2, "Y", 25);

        // invoke the display method
        s1.display();
        s2.display();
        
    }
}



