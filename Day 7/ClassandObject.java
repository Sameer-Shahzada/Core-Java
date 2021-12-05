
// Write a program to understand the concept of class and object

class Student 
{
    // define fields
    int id;
    String name;

}
class StudentTest
{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
        
    }
}
