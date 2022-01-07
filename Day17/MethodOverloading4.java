/* 
    -> Why we cannot overload the method by changing the return type only ?
    Ans - We cannot overlaod the method by changing the return type only due to ambiguity occurs 
    in program 
*/


package Day17;

class Addition2 
{
    // Create a method
    static int add (int x, int y)
    {
        return x + y;
    }    
    // Create another method
    static double add (int x , int y)
    {
        return x + y;
    }
}
class TestAddition2
{
    public static void main(String[] args) {
        
        System.out.println(Addition2.add(1,5)); // ambiguity
    }

}
