/* 
    Unboxing 
        -> The automatic conversion of an object into primitive is known as Unboxing.
*/

package Day41;

public class Unboxing 
{
    public static void main(String[] args) {
        Character object = 'H';
        char ch = object;

        System.out.println("Object character - " + object);
        System.out.println("Primitive Character - " + ch);
    }    
}
