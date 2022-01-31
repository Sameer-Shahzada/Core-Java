/* 
    Wrapper Class 
        -> Write a program to convert all primitive into object and vice versa.
*/
package Day41;

public class WrapperClass 
{
    public static void main(String[] args) {

        byte b=10;  
        short s=20;  
        int i=30;  
        long l=40;  
        float f=50.0F;  
        double d=60.0D;  
        char c='a';  
        boolean b2=true;  

        // Convert Primitive into objects
        Byte byteobj = b;
        Short shortobj = s;
        Integer intobj = i;
        Long longobj = l;
        Float floatobj = f;
        Double doubleobj = d;
        Character charobj = c;
        Boolean booleanobj = b2;

        System.out.println("---Conversion Primitive into Object---");
        System.out.println("Primitive object [Autoboxing] - " + byteobj);
        System.out.println("Primitive object [Autoboxing] - " + shortobj);
        System.out.println("Primitive object [Autoboxing] - " + intobj);
        System.out.println("Primitive object [Autoboxing] - " + longobj);
        System.out.println("Primitive object [Autoboxing] - " + floatobj);
        System.out.println("Primitive object [Autoboxing] - " + doubleobj);
        System.out.println("Primitive object [Autoboxing] - " + charobj);
        System.out.println("Primitive object [Autoboxing] - " + booleanobj);



        // Conversion Objects into Primitive 
        byte bytevalue = byteobj;
        short shortvalue = shortobj;
        int intvalue = intobj;
        long longvalue = longobj;
        float floatvalue = floatobj;
        double doublevalue = doubleobj;
        char charvalue = charobj;
        boolean booleanvalue = booleanobj;

        System.out.println("---Conversion Object into Primitive---");
        System.out.println("Object into Primitive [Unboxing] - " + bytevalue);
        System.out.println("Object into Primitive [Unboxing] - " + shortvalue);
        System.out.println("Object into Primitive [Unboxing] - " + intvalue);
        System.out.println("Object into Primitive [Unboxing] - " + longvalue);
        System.out.println("Object into Primitive [Unboxing] - " + floatvalue);
        System.out.println("Object into Primitive [Unboxing] - " + doublevalue);
        System.out.println("Object into Primitive [Unboxing] - " + charvalue);
        System.out.println("Object into Primitive [Unboxing] - " + booleanvalue);
    }    
}
