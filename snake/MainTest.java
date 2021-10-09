package snake;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Tabish Hussain Raza
 */
public class MainTest {

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
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main newMain = new Main();
        newMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
