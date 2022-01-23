/* 
    Since Java 8 we have method body in interface but we need to make it default method.

*/

package Day33;

interface Drawable 
{
    // define methods
    void draw();
    
    // define defautl method
    default void msg()
    {
        System.out.println("Hello Default method");
    }
}
class Rectangle implements Drawable
{
    // Provide implementation 
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Draw Rectangle");
    }
}
class TestDraw
{
    public static void main(String[] args) {
        Drawable d;
        d = new Rectangle();
        d.draw();

        d.msg();
    }
}