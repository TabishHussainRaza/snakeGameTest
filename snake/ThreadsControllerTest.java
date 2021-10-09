package snake;

import java.util.ArrayList;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Tabish Hussain Raza
 */
public class ThreadsControllerTest {

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
     * Test of run method, of class ThreadsController.
     */
    @Test
    public void testRun() {

        Tuple myTuple = new Tuple(10, 10);

        System.out.println("run");
        ThreadsController instance = new ThreadsController(myTuple);
        instance.start();
        instance.interrupt();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of moveInterne method, of class ThreadsController.
     */
    @Test
    public void testMoveInterne() {

        ArrayList<ArrayList<DataOfSquare>> Squares = new ArrayList<ArrayList<DataOfSquare>>();
        Tuple headSnakePos;
        int sizeSnake = 3;
        long speed = 50;
        int directionSnake;

        ArrayList<Tuple> positions = new ArrayList<Tuple>();
        Tuple foodPosition;

        Tuple myTuple = new Tuple(10, 10);
        ThreadsController instance = new ThreadsController(myTuple);

        instance.start();

        new KeyboardListenerTest().testKeyPressed();

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
