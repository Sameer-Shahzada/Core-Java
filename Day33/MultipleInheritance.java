/* 

    Multiple Inheritance 
       -> If a class implements more then one interface or an interface extends more then one (multiple)
          interface then it is known as Multiple Inheritance.
*/
package Day33;

interface Print 
{
    // define a method
    void print();           // public abstract by default 
}
interface Show
{
    // define a method
    void show();
}
class TestMultiInheritance implements Print , Show
{
    // Provide implementation of interface method 
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Hello Printer ");
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println("Hello Java");
    }

    public static void main(String[] args) {
        TestMultiInheritance obj = new TestMultiInheritance();

        obj.print();
        obj.show();
    }
}