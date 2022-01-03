// Write a program of static count variable

class Counter 
{
    // define the data fields of the class
    static int count = 0;
    
    // Create a constructor 
    Counter()
    {
        count++;    // increament the value by 1
        System.out.println(count);

    }

    public static void main(String[] args) {
        // Create instance of the class
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
