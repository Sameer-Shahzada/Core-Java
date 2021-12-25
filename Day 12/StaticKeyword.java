/*
Static keyword is mainly used for memory management in java. When we declare a variable as static 
then its allocate memory at once during the execution of the program.

We use the static keyword with the following -
-> Variable
-> Method
-> Block
-> Nested Class

*/

class Student
{
    // data fields
    int id;
    String name;
    static String college = "KNIT";

    // Create a parameterized constructor
    Student(int i , String n)
    {
        id = i;
        name = n;
    }
    // Create a method to display the student information
    void show()
    {
        System.out.println(id + " " + name + " " + college);
    }

}
class StudentTesting
{
    public static void main(String[] args) {
        // Create instance of the Student class
        Student s1 = new Student(24, "X");
        Student s2 = new Student(25, "Y");
        // Call show method through object reference
        s1.show();
        s2.show();
    }
}