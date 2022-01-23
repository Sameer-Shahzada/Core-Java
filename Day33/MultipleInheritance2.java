/* 
Multiple inheritance is not supported through class in java, but it is possible by an interface, why?
    As we have explained in the inheritance chapter, multiple inheritance is not supported in the case 
    of class because of ambiguity. However, it is supported in case of an interface because there is no 
    ambiguity. It is because its implementation is provided by the implementation class. 
    For example:
*/


package Day33;

interface Printable 
{
    // define a method 
    void print();    
}
interface Showable
{
    // define same name method
    void print();
}
class TestInterface implements Printable , Showable
{
    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println("Hello");
    }
    
    public static void main(String[] args) {
        TestInterface obj = new TestInterface();
        obj.print();
    }
}
/*
As you can see in the above example, Printable and Showable interface have same methods but its 
implementation is provided by class TestTnterface1, so there is no ambiguity.
*/
