/* 

    Read Only Class 
        -> A java class which has getter method only

*/
package Day38;

public class Encapsulation1 
{
    // private data member 
    private String College = "KNIT";
    
    // getter method
    public String getCollege() {
        return College;
    }
    public static void main(String[] args) {
        // Create an instance of the class 
        Encapsulation1 readonly = new Encapsulation1();

        System.out.println(readonly.setCollege("WMIT"));
        
    }
}
