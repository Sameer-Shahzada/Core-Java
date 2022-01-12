/* 
    -> Real use of super keyword by re-use the constructor
*/

package Day22;

class Person 
{
    // define data fields
    int id;
    String name;

    // Create a constructor to initialize the variables
    Person(int id , String name)
    {
        this.id = id;
        this.name = name;
    }
}
class Employee extends Person
{
    // define data fields 
    float salary;

    // Create a constructor 
    Employee(int id , String name , float salary)
    {
        super(id, name); // reusing constructor
        this.salary = salary;
    }

    // Define a method to display
    void display()
    {
        System.out.println("Emp id - " + id + " Emp Name - " + name + " Emp salary - " + salary);
    }
}
class TestEmp
{
    public static void main(String[] args) {
        // Create an instance of the class
        Employee emp1 = new Employee(24, "H", 5.5f);

        // invoke
        emp1.display();
    }
}

