package reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Autograder {

    static final String CLASS_NAME = ""; // TODO: insert the class name to be tested

    @Test
    public void testMoreThanFourFields() throws ClassNotFoundException {
        Field[] fields = Class.forName(CLASS_NAME).getDeclaredFields();
        assertTrue(fields.length > 4);
    }

    @Test
    public void testNonPrivateFields() throws ClassNotFoundException {
        Field[] fields = Class.forName(CLASS_NAME).getDeclaredFields();
        for (Field field : fields) {
            assertFalse(Modifier.isPrivate(field.getModifiers()));
        }
    }

    @Test
    public void testFieldsOfTypeArrayList() throws ClassNotFoundException {
        Field[] fields = Class.forName(CLASS_NAME).getDeclaredFields();
        for (Field field : fields) {
            assertNotEquals(field.getType(), ArrayList.class);
        }
    }

    @Test
    public void testFewerThanTwoHelperMethods() {
        // TODO
    }

    @Test
    public void testAnyMethodThatHasAThrowsClause() {
        // TODO
    }

    @Test
    public void testAnyMethodThatReturnsAnInt() {
        // TODO
    }

    @Test
    public void testMissingZeroArgumentContructor() {
        // TODO
    }
}
