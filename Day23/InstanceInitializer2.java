/* 
    There are three places where we can use the instance initializer block
    1- Method
    2- Constructor 
    3- Block

*/

// -> What is invoked first constructor or instance initializer block?

package Day23;

class Test   
{
    // Create a constructor 
    Test()
    {
        System.out.println("Hello , Constructor is here");
    }    

    // Instance Initializer Block 
    {
        System.out.println("Hello, Instance Initializer block is here");
    }

    public static void main(String[] args) {
        // Create an instance of the class 
        Test t1 = new Test();
    }
}

/* 
Explanation
    In the above example, it seems that instance initializer block is firstly invoked but NO. 
    Instance intializer block is invoked at the time of object creation. The java compiler copies 
    the instance initializer block in the constructor after the first statement super(). So firstly, 
    constructor is invoked. 
*/
