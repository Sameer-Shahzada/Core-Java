/* 
    Another example of Abstract class in java

*/

package Day30;

abstract class Bank 
{
    // define an abstract method for Bank class 
    abstract float getRateofInt();

}
class SBI extends Bank 
{
    // define implementation by SBI class 
    @Override
    float getRateofInt() {
        // TODO Auto-generated method stub
        return (8.5f);
    }
}
class AXIS extends Bank
{
    // define implementation by AXIS class 
    @Override
    float getRateofInt() {
        // TODO Auto-generated method stub
        return (5.5f);
    }
}
class PNB extends Bank
{
    @Override
    float getRateofInt() {
        // TODO Auto-generated method stub
        return (7.8f);
    }
}
class TestBank
{
    public static void main(String[] args) {
        // Create type of the Bank class 
    Bank b;

    // Create objects 
    b = new SBI();
    System.out.println(b.getRateofInt());

    b = new AXIS();
    System.out.println(b.getRateofInt());

    b = new PNB();
    System.out.println(b.getRateofInt());

    }  
}