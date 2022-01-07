
// -> Method overloading with type promotion in case of ambiguity

package Day17;

class Sum1  
{
    // Create a method 
    void sum (int x , long y)
    {
        System.out.println(x + y);
    }    

    // Create another method
    void sum (long x , int y)
    {
        System.out.println(x + y);
    }
}
class TestSum1
{
    public static void main(String[] args) {
        // Create an instance of the class 
        Sum1 s1 = new Sum1();
        Sum1 s2 = new Sum1();

        s1.sum(2, 5);
        s2.sum(3, 7); // ambiguity occurs in program 

    }
}
