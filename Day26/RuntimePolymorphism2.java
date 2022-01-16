
// -> Write a program to demonstrate the use of Runtime Polymorphism in java

package Day26;

class Shape 
{
    // Create a method
    void draw()
    {
        System.out.println("drawing...");
    }    
}
class Circle extends Shape
{
    // Create a method
    @Override
    void draw()
    {
        System.out.println("drawing circle");
    }
}
class Rectangle extends Shape
{
    // Create method
    @Override
    void draw()
    {
        System.out.println("drawing Rectangle");
    }
}
class Triangle extends Shape
{
    // Create a method 
    @Override
    void draw()
    {
        System.out.println("draw Triangle");
    }
}
class TestShape
{
    public static void main(String[] args) {
        // Create an instance of the class
        Shape s;

        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();

        s = new Triangle();
        s.draw();
    }
}
