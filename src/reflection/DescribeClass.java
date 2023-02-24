package reflection;

import java.util.Arrays;

public class DescribeClass {
    // Write a Java program, `DescribeClass`, that reads the name of a class from the command line and emits
    // the interface of the class in Java syntax (interface or class, modifiers, constructors, methods,
    // fields; no method bodies).

    // Hint: You can load a class whose name you know with `java.lang.Class.forName()`. The `java.lang.Class`
    // class offers a rich interface that enables you to inspect the interface of any class.
    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length != 1)
            System.out.println("Usage: enter a classname argument to get the related interface(s)");
        System.out.println(Arrays.toString(Class.forName(args[0]).getInterfaces()));
    }
}
