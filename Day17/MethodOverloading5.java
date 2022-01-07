/* 

Can we overload main method in java 

Yes, We can overload the main method in java but JVM only calls the original main method, 
it will never call our overloaded main method.

In short, the main method can be overloaded but cannot be overridden in Java. 
That's all about overloading and overriding the main method in Java. 
Now you know that it's possible to overload main in Java but it's not possible to override it, 
simply because it's a static method.

*/

package Day17;

class TestMain 
{
    public static void main(String[] args) {
        System.out.println("Main with string args");
    }    
    public static void main() {
        System.out.println("Main with blank paranthesis");
    }
    public static void main(String args) {
        System.out.println("Main with string args only");
    }
}
