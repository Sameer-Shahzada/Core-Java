/* 

    Object Cloning 
        -> Object cloning in java is a way to create the exact copy of an object. The clone() method is
        used to create a copy of object.

        The java.lang.Cloneable interface must be implemented by the class whose object clone we want 
        to create. If we don't implement Cloneable interface, clone() method generates 
        CloneNotSupportedException.

The clone() method is defined in the Object class. Syntax of the clone() method is as follows:

protected Object clone() throws CloneNotSupportedException 

    Why use clone() method
        -> We use clone method to save extra processing task and a lot of processing. When we use 
        new keyword to create an object then it takes a lot of processing and time.
        That's why we use clone() method in java.
*/



package Day39;

class Student implements Cloneable
{
    // define data member 
    int rollNo;
    String name;
    
    // define a constructor to initialize the variable
    Student(int rollNo , String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public static void main(String[] args) {
        // Create an instance of the class 
        try {
            Student s1 = new Student(24, "Mr. X");
            Student s2 = (Student)s1.clone();

            System.out.println(s1.rollNo+" " + s1.name);
            System.out.println(s2.rollNo+" " + s2.name);

        } catch (CloneNotSupportedException e) {
            //TODO: handle exception
        }
    }
}
