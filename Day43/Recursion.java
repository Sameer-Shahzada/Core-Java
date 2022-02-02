package Day43;

public class Recursion 
{
    // define data member 
    static int count = 0;

    // define a recursive method 
    static void printMsg()
    {
        count++;
        if(count <= 5)
        {
            System.out.println("Hello Recursive method " + count);
            printMsg();  // Calling same name method (Recursive calling | Call itself)
        }     
    }
    public static void main(String[] args) {
        // invoke recursive method 
        printMsg();
    }
}
