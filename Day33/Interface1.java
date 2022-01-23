/*
    Java Interface Example : Drawable
*/


package Day33;

interface Drawable 
{
    void draw();    // public abstract by default    
}
    // implementation by second user
class Rectangle implements Drawable
{
    // Provide implementation
   @Override
   public void draw() {
       // TODO Auto-generated method stub
       System.out.println("Draw Rectangle");
   }
}
class Triangle implements Drawable
{
    // Provide implementation
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Draw Triangle");
    }
}
class Test 
{
    public static void main(String[] args) {
        Drawable d;
        d = new Rectangle();
        d.draw();

        d = new Triangle();
        d.draw();
    }
}