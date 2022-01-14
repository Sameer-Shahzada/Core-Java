/* 
    Instance Variable 
        -> If we declare a variable as final variable then we cannot reinitialized that variable.
*/

package Day24;


class Test  
{
    // instance variable
    final int num = 25;

    // Create a method 
    
        void speed()
        {
            num = 55;   // final variable cannot be re-initialized again.
            System.out.println("speed is " + num);
        }
    

    public static void main(String[] args) {
        // Create an instance of the class
        Test t1 = new Test();

        t1.speed();


    }
}

