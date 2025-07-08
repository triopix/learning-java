// * name of java class must match class name
public class Forge {
    public static void main(String[] args) {
        System.out.println("Forge is active.");
        /*
        Data types are divided into two groups:

        Primitive data types - includes byte, short, int, long, float, double, boolean and char
        Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)
         */

        float f1 = 3.32e4f;
        System.out.println(f1);

        // Non-primitive data types
        // created by the programmer, except for String class which is by Java default,
        // Can be used to call methods to perform certain operations
        // Non-primitive types can be null, but primitive types cannot

        // Examples of non-primitive types are Strings, Arrays, Classes, etc. You will learn more about these in a later chapter.

        // narrow vs wide cast (sometimes casts are redundant based on an order) - IDE tells you automatically
        // best practice though is to just cast anyway
        double a = 2;
        int b = (int) a;

//        int c = 22;
//        double d = (double) c;
        double d = 22;

        System.out.println(d);

        // value of right side (payload) determines what will be placed on left side
        // order of operations is right-to-lef
    }

    // java methods
    // methods are blocks of code which only run when they are called
    // you can pass parameters (into a method)
    // the method takes in (arguments)
    // interchangeable with functions (although methods are defined inside a class)
}
