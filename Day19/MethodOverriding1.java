/* 

-> Write a program to demonstrate the use of Method Overriding in java
 
*/

package Day19;

class Bank 
{
    // define a method
    int getRateofInt()
    {
        return 0;
    }
}
class SBI extends Bank
{
    // define a method
    int getRateofInt()
    {
        return (7);
    }
}
class AXIS extends Bank
{
    // define a method
    int getRateofInt()
    {
        return (8);
    }
}
class PNB extends Bank
{
    // define a method
    int getRateofInt()
    {
        return (10);
    }
}
class TestBank
{
    public static void main(String[] args) {
        // Create instance of each class 
        SBI sbi = new SBI();
        AXIS axis = new AXIS();
        PNB pnb = new PNB();

        // invoke 
        System.out.println("SBI rate of interest " + sbi.getRateofInt());
        System.out.println("AXIS rate of interest " + axis.getRateofInt());
        System.out.println("PNB rate of interest " + pnb.getRateofInt());
       
    }
}