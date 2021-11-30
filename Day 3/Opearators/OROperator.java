/*
Java OR Operator Example: Logical || and Bitwise |
The logical || operator doesn't check the second condition if the first condition is true. 
It checks the second condition only if the first one is false.

The bitwise | operator always checks both conditions whether first condition is true or false.
*/

class OROperator
{
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println(a>b || a<c); // True || True -> True
        System.out.println(a>b | a<c);  // True | True -> True

        // || Vs |

        System.out.println(a>b||a++<c);     //True || 10 (11) < 20 True -> True
        System.out.println(a);      // 10 because second condition is not checked.
        System.out.println(a>b|a++<c);  // True | 10 (11) < 20 True -> True 
        System.out.println(a);      // 11 because second conditon is not checked.
    }
}