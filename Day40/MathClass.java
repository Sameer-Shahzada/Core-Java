/* 

    Java Math class
Java Math class provides several methods to work on math calculations like min(), max(), avg(), sin(), 
cos(), tan(), round(), ceil(), floor(), abs() etc.


*/

package Day40;

public class MathClass 
{
    public static void main(String[] args) {
        // define data fields
        double x = 28;
        double y = 8;

        // return max number 
        System.out.println("Max number - " + Math.max(x, y));

        // return min number 
        System.out.println("Minimum number - " + Math.min(x, y));

        // return square root
        System.out.println("Square root - " + Math.sqrt(y));

        //returns 28 power of 4 i.e. 28*28*28*28    
        System.out.println("Power of x and y is: " + Math.pow(x, y));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of x is: " + Math.log(x));   
        System.out.println("Logarithm of y is: " + Math.log(y));  
          
        // return the logarithm of given value when base is 10      
        System.out.println("log10 of x is: " + Math.log10(x));   
        System.out.println("log10 of y is: " + Math.log10(y));    
          
        // return the log of x + 1  
        System.out.println("log1p of x is: " +Math.log1p(x));    
  
        // return a power of 2    
        System.out.println("exp of a is: " +Math.exp(x));    
          
        // return (a power of 2)-1  
        System.out.println("expm1 of a is: " +Math.expm1(x));
    }
}
