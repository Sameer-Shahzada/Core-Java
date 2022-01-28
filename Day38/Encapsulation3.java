/* 
    Another example of encapsulation 
        -> Write a program to create a fully encapsulated class and use getter and setter method 
*/

package Day38;

class Account 
{
    // private data members
    private long Account_no;
    private String name , email;
    private long balance;    

    // getter and setter method 
    public double getAccount_no() {
        return Account_no;
    }

    public void setAccount_no(long account_no) {
        Account_no = account_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
// Create a test class 
class Test 
{
    public static void main(String[] args) {
        // Create an instance of the class 
        Account pnb = new Account();

        // set values 
        pnb.setName("Mr. X");
        pnb.setEmail("mr.x@gmail.com");
        pnb.setAccount_no(345674);
        pnb.setBalance(50000);

        // get values 
        System.out.println("Coustomer name - " + pnb.getName());
        System.out.println("Coustomer email - " + pnb.getEmail());
        System.out.println("Coustomer account no - " + pnb.getAccount_no());
        System.out.println("Coustomer balance - " + pnb.getBalance());

    }

}