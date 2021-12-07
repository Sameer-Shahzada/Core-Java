
// Write a program to understand the concept of Parameterized constructor.

package Constructor;

class Employee
{
    int id;
    String name;
    int age;

    // Create a parameterized constructor to initialize the object
    Employee(int i , String n , int a)
    {
        id = i;
        name = n;
        age = a;        // initialize the object through constuctor
    }

    // Create a method to display the data information.
    void display()
    {
        System.out.println("Id : " + id + "\n" + "Employee Name : " + name + "\n" + "Age : "   + age);
    }

    public static void main(String[] args) 
    {
        // Create objects for Employee class
        Employee e1 = new Employee(05, "Md. Sameer Shahzada" , 27);
        Employee e2 = new Employee(16, "Huma Khatoon" , 24);

        // To call the object
        e1.display();
        e2.display();


    }

}