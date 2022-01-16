/*  

    Java Runtime Polymorphism with data member



*/


package Day26;

class Bike 
{
    int speedlimit =  90;   
}
class Honda extends Bike 
{
    int speedlimit = 150;

    public static void main(String[] args) {
        // Create an instance of the class 
        Bike obj = new Honda();

        System.out.println(obj.speedlimit);
    }
}
