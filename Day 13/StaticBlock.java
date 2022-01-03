

public class StaticBlock 
{
    // define a static block
    static 
    {
        System.out.println("Hello, I'm static block");
    }    
    // Note -> static block is also used to initialize the static variable

    public static void main(String[] args) {
        System.out.println("Hello,  I'm in Main method");
    }

}
