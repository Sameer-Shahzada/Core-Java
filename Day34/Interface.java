package Day34;

interface Sport 
{
    void sportMark();
}
class Student 
{
    // define data member 
    int m1 , m2;
    
    // define a method
    void getMarks(int x , int y)
    {
        m1 = x;
        m2 = y;
    }
    void putMarks()
    {
        System.out.println("First marks" + m1);
        System.out.println("Second marks" + m2);
    } 
}
class Result extends Student implements Sport
{
    // Create a data member

    int spmark = 10;
    int total;
    
    // Create a method for sport marks to display
    public void sportMark()
    {
        System.out.println("Sport Marks " + spmark);
    }
    // Create a method to display the result
    void showResult()
    {
        putMarks();
        sportMark();

        total = m1 + m2 + spmark;

        System.out.println("Total is " + total);

    }
}
class Test
{
    public static void main(String[] args) {
        // Create an isntance of the class 
        Result obj = new Result();

        obj.getMarks(70, 50);

        obj.showResult();
    }
}
