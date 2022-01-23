/* 
    Interface inheritance
        A class implements an interface but an interface extends another interface
*/

package Day33;

interface Printer 
{
    // define a method
    void print();   // public abstract by default    
}
interface Output extends Printer
{
    // define a method 
    void takeOutput();
}
class TestII implements Output
{
    // Provide implementation
    @Override
    public void print()
    {
        System.out.println("Hello");
    }

    // another implementation
    @Override
    public void takeOutput() {
        // TODO Auto-generated method stub
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        TestII obj = new TestII();

        obj.print();
        obj.takeOutput();
    }
}