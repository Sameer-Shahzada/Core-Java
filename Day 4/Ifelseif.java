/*
Syntax of if-else-if statement is given below.

if(condition 1) {    
statement 1; //executes when condition 1 is true   
}  
else if(condition 2) {  
statement 2; //executes when condition 2 is true   
}  
else {  
statement 2; //executes when all the conditions are false   
}  
*/

public class Ifelseif 
{
    public static void main(String[] args) {
        
        String city = "Meerut";

        if(city == "Delhi")
        System.out.println("You are live in Delhi");
        
            else if(city == "Sikandrabad")
            System.out.println("You are live in Sikandrabad");

            else if(city == "Gurugram")
            System.out.println("You are live in Gurugram");

        else 
        System.out.println("You are live in " + city);


    }   
}
