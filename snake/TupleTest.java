package snake;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tabish Hussain Raza
 */
public class TupleTest {

    public TupleTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of ChangeData method, of class Tuple.
     */
    @Test
    public void testChangeData() {
        System.out.println("ChangeData");
        Tuple instance = new Tuple(1, 2);
        int x = 0;
        int y = 0;
        instance.ChangeData(x, y);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getX method, of class Tuple.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Tuple instance = new Tuple(1, 2);
        int expResult = 1;
        int result = instance.getX();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getY method, of class Tuple.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Tuple instance = new Tuple(1, 2);
        int expResult = 2;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

        System.out.println("Success!");

    }
    @Test
    public void testGetXf() {
        System.out.println("getXf");
        Tuple instance = new Tuple(1, 2);
        int expResult = 0;
        int result = instance.getXf();
        assertEquals(expResult, result);
    }

    /**
     * Test of getYf method, of class Tuple.
     */
    @Test
    public void testGetYf() {
        System.out.println("getYf");
        Tuple instance = new Tuple(1, 2);
        int expResult = 0;
        int result = instance.getYf();
        assertEquals(expResult, result);
    }

}
