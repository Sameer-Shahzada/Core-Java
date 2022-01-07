/* 
-> Method overloading with type promotion
*/

package Day17;

class Sum 
{
    // Create a method 
    void sum(int x , long y)
    {
        System.out.println(x + y);
    }
    // Create another method
    void sum(int x , int y)
    {
        System.out.println(x + y);
    }
}
class TestSum
{
    public static void main(String[] args) {
        // Create an instance of the class 
        Sum s1 = new Sum();
        Sum s2 = new Sum();

        s1.sum(2, 100); // now second int literal will be promoted to long
        s2.sum(5, 5);

    }
}
