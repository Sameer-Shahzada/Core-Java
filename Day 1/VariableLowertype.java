// Variable Example : Lowertype

public class VariableLowertype 
{
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;

       // byte c = a + b; // Compile time error because it will became int type.

        byte c = (byte) ((byte)a + b);

        System.out.println(c);
    }    
}
