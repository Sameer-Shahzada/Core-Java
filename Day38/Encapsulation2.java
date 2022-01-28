/* 
    Write Only Class 
        -> A java class which has only setter method
*/

package Day38;

public class Encapsulation2 
{
    // private data member 
    private String College = "KNIT";
    
    // setter method 
    public void setCollege(String college) {
        College = college;
    }
    public static void main(String[] args) {
        // Create an instance of the class 
        Encapsulation2 e2 = new Encapsulation2();

        System.out.println(e2.getCollege());
        System.out.println(e2.College);
    }
}
