/* 

Que - Can we initialize blank final variable ?
Ans - Yes, we can initialize blank final variable but only in constructor.

*/

package Day24;

class Student 
{
   // Create a final variable 
   final int PAN_CARD_NO;
   
   // Create a constructor 
   Student(int PAN_CARD_NO)
   {
        this.PAN_CARD_NO = PAN_CARD_NO;
   }
   // Create a method 
   void display()
   {
       System.out.println("PAN_CARD_NO is " + PAN_CARD_NO);
   }
   public static void main(String[] args) {
       // Create an instance of the class 
       Student s1 = new Student(4560);

       // invoke method
       s1.display();
   }
}
