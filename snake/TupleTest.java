package snake;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Tabish Hussain Raza
 */
public class TupleTest {

    /**
     * The following method executes before all the test methods.
     */
    @BeforeAll
    public static void setUpAll() {
        System.out.println("This should be printed before all the test cases");
    }

    /**
     * The following method executes before each test methods in the class.
     */
    @BeforeEach
    public void setUp() {
        System.out.println("This should be printed before each test case");
    }

    /**
     * The following method executes after each test methods in the class.
     */
    @AfterEach
    public void afterEach() {
        System.out.println("This should be printed after each test case");
    }

    /**
     * The following method executes after all the test methods.
     */
    @AfterAll
    public static void tearDown() {
        System.out.println("This should be printed at the end after all the test cases");
    }

    /**
     * Test of ChangeData method, of class Tuple.
     */
    @Test
    public void testChangeData() {
        System.out.println("ChangeData");
        Tuple tupleInstance = new Tuple(1, 2);
        int x = 0;
        int y = 0;
        tupleInstance.ChangeData(x, y);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getX method, of class Tuple.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Tuple tupleInstance = new Tuple(1, 2);
        int expResult = 1;
        int result = tupleInstance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getY method, of class Tuple.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Tuple tupleInstance = new Tuple(1, 2);
        int expResult = 2;
        int result = tupleInstance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("Success!");

    }

    /**
     * Test of getXf method, of class Tuple.
     */
    @Test
    public void testGetXf() {
        System.out.println("getXf");
        Tuple tupleInstance = new Tuple(1, 2);
        int expResult = 0;
        int result = tupleInstance.getXf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYf method, of class Tuple.
     */
    @Test
    public void testGetYf() {
        System.out.println("getYf");
        Tuple tupleInstance = new Tuple(1, 2);
        int expResult = 0;
        int result = tupleInstance.getYf();
        assertEquals(expResult, result);
    }

}
