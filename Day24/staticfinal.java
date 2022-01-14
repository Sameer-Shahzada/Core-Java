/* 
    Example of static blank final variable
*/

package Day24;

class Testdata 
{
    // create a static blank final variable
    static final int num;

    // Create a static block to initialize the static blank final variable
    static 
    {
        num = 25;
    }
    public static void main(String[] args) {
        System.out.println("Num is " + num);
    }
}
