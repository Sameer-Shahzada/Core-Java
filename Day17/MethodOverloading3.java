/*
    Method Overloading by changing the data type 
*/
package Day17;

class Addtion1
{
    // Create a method 
    static int add(int x , int y)
    {
        return x + y;
    }

    // Create another method 
    static float add(float x , float y)
    {
        return x + y;
    }
}
class TestAddition1
{
    public static void main(String[] args) {
        
        System.out.println(Addtion1.add(2, 4));
        System.out.println(Addtion1.add(2.0f , 4.5f));
    }
}
