/* 
Que - What is final parameter ?
Ans - If you declare any parameter as final, you cannot change the value of it.
*/

package Day24;

class Bike  
{
    int cube(final int n)
    {
        n = n+2 // cant be change as n is final 
        n*n*n;
    }
    public static void main(String[] args) {
        // Create an isntance of the class
        Bike b1 = new Bike();
        b.cube(5);      // Compile time error
    }
}
