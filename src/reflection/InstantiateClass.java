package reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

//Write a program, InstantiateClass, that reads a class name and a list of arguments and creates an object
// of that class where the read arguments are passed to the constructor.

// Hint: Treat arguments as strings. A java.lang.Class can enumerate its constructors. Choose a constructor with
// the appropriate parameter count, then find the parameter types. To create typed argument objects, call the
// proper constructors that take a string as their only argument. You can call dynamic constructors using:
// `java.lang.reflect.Constructor.newInstance()`
public class InstantiateClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        if (args.length < 1)
            System.out.println("Usage: provide a classname and its arguments");
        Class<?> reflectedClass = Class.forName(args[0]);
        Constructor<?> constructer = reflectedClass.getConstructor(String.class);  //
        Class<?> sampleObject = (Class<?>)constructor.newInstance("data");

        Object obj = construct.newInstance(Arrays.copyOfRange(args, 1, args.length));
    }
}
