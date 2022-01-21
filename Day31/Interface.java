package Day31;

interface A 
{
    // Create methods
    void a();   // public abstract by default 
    void b();   
    void c();   
    void d();   
}
abstract class B
{
    // Provide implementation for b method
    void b()
    {
        System.out.println("I am b");
    }
}
class M extends B 
{
    // Provide implementation for rest methods
    void a()
    {
        System.out.println("I am a");
    }

    void c()
    {
        System.out.println("I am c");
    }

    void d()
    {
        System.out.println("I am d");
    }
}
class Test
{
    public static void main(String[] args) {
        // Create object reference
        M a = new M();

        a.a();
        a.b();
        a.c();
        a.d();
    }
}