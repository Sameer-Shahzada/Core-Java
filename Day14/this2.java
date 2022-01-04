/*
    -> this can be used to refer the current class method 

 Write a program to demonstrate the use of this keyword for current class method.
*/

package Day14;

class Methods 
{
    // Create methods
    void m1()
    {
        System.out.println("Hello, I'm M1");
    }

    void m2()
    {
        System.out.println("Hello, I'm M2");
        this.m1();
    }

}
class Test1
{
    public static void main(String[] args) {
        // Create instance of the class 
        Methods obj = new Methods();

        // call method
        obj.m2();
    }
}
