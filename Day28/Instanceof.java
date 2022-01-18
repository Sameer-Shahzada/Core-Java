/*
    Instanceof Operator

    -> The java Instanceof Operator is used to test whether the object is an instanceof a specified 
    type (class , subclass or Interface)

    -> The java instanceof operator is also known as Comparison operator because it compares the 
    instances with type.

    -> It gives true and false.

    -> If we apply the instacneof operator with any variable that has null value then it gives false.
*/
//-> Write a program to demonstrate the use of Instance of operator by a single program.

package Day28;

class Test 
{
    public static void main(String[] args) {
        // Create an instance of the class 
        Test t1 = new Test();

        System.out.println(t1 instanceof Test);
    }
}
