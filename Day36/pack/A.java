/* 
    How to access package from another package ?

    There are three ways to access the package
        1 - import package.*;   // import all class 
        2 - import package.classname
        3 - Fully qualified name

*/
//-> Write a program to access the package by importing all classes of another package.

package Day36.pack;

public class A 
{
    // define a method 
    public void msg()
    {
        System.out.println("Hello, I'm from class A");
    }    
}

