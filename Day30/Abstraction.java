/* 

    Understanding the real scenario of Abstract class 
        -> In this example, Shape is the abstract class, and its implementation is provided by the 
        Rectangle and Circle class. 

*/
package Day30;

abstract class Shape 
{
    // define an abstract method for Shape class 
    abstract void draw();
}
class Rectangle extends Shape
{
    // define the implementation of draw method
    @Override
    void draw() {
        // TODO Auto-generated method stub
        System.out.println("Draw Rectangle");
    }
}
class Circle extends Shape
{
    // define the implementation of draw method
    @Override
    void draw() {
        // TODO Auto-generated method stub
        System.out.println("Draw Circle");
    }
}
class TestShape
{
    public static void main(String[] args) {
        // Create type of the Shape class 
        Shape s;

        // Create objects 
        s = new Rectangle();
        s.draw();

        s = new Circle();
        s.draw();           
    }
}