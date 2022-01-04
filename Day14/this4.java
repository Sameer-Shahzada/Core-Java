// Real usage of this constructor call by reusing constructor 

package Day14;

class Student4
{
    // define data fields
    int rollno;
    String name , course;
    float fee;

    // Create a constructor 
    Student4(int rollno , String name , String course)
    {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }
    // Create another constructor
   Student4(int rollno , String name , String course , float fee)
   {
       this(rollno, name, course);  // reuse constructor
       this.fee = fee;
   }
   // Create a method to display the information
   void display()
   {
       System.out.println(rollno + " " + name + " " + course + " " + fee);
   }
}
class Testconst
{
    public static void main(String[] args) {
        // Create instance of the class
        Student4 s1 = new Student4(24, "X", "MCA");
        Student4 s2 = new Student4(25 , "Y" , "MCA" , 1000f);

        // invoke 
        s1.display();
        s2.display();
    }
}
