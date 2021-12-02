/*
if(condition 1) {    
statement 1; //executes when condition 1 is true   
if(condition 2) {  
statement 2; //executes when condition 2 is true   
}  
else{  
statement 2; //executes when condition 2 is false   
}  
}  
*/

public class NestedIf 
{
    public static void main(String[] args) {    
        String address = "Delhi, India";    
            
       if(address.endsWith("India"))
            if(address.contains("Meerut"))
            System.out.println("Your city is Meerut");

            else if(address.contains("Delhi"))
            System.out.println("Your city is Delhi");

            else 
            System.out.println(address.split(",")[0]);

       else
       System.out.println("You are not living in India");
    }
}