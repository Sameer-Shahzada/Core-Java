/* 
    Wrapper Class -  
        Wrapper class in java is a mechanism which convert primitive into an object & vice versa.

    Autoboxing -
        The automatic conversion of primitive into an object is known as Autoboxing.
    
        
*/


package Day41;

public class Autoboxing 
{
    public static void main(String[] args) {
        int num = 20;

        // Conversion primitive into an object 
        Integer obj = num;

        System.out.println("Primitive number - " + num);
        System.out.println("Object number - " + obj);
    }    
}
