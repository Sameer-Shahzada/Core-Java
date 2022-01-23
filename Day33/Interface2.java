/* 

     Java Interface Example : Bank

*/


package Day33;

interface Bank 
{
    // define a method
    float getRateofInt();       // public abstract by default    
}
// Provide implementation by second user
class SBI implements Bank
{
    // Provide implementation
    @Override
    public float getRateofInt() {
        // TODO Auto-generated method stub
        return (5.5f);
    }
}
class PNB implements Bank
{
    @Override
    public float getRateofInt() {
        // TODO Auto-generated method stub
        return (7.7f);
    }
}
class TestBank
{
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println(b.getRateofInt());

        b = new PNB();
        System.out.println(b.getRateofInt());
    }
}