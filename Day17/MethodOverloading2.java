// -> Write a program to demonstrate the use of method overloading by changing the no. of arguments.


package Day17;

class Subtraction 
{
    // Create a method with two parameter list 
    static int sub(int x , int y)
    {
        return x-y;
    }    

    // Create another method with three parameter list 
    static int sub(int x , int y , int z)
    {
        return x-y-z;
    }

}
class Testsub
{
    public static void main(String[] args) {
       
        System.out.println(Subtraction.sub(5, 4));
        System.out.println(Subtraction.sub(10, 5, 4));  
    
}
}