import javax.imageio.ImageTypeSpecifier;

// Write a program to calculate the area of a rectangle

class Rectangle 
{
    // define rectangle fields
    int length;
    int width;

    void calculateAr(int l , int w)
    {
        length = l;
        width = w;
    }

    void display()
    {
        System.out.println("Area of rectangle = " + length * width);
    }

}
class RectangleTest
{
    public static void main(String[] args) {
        // Create instance of the class
        Rectangle r1 = new Rectangle();

        // insert data in method
        r1.calculateAr(4, 5);

        // invoke
        r1.display();

    }
}