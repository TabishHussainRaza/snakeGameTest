package snake;

import java.awt.Color;
import java.util.ArrayList;
import org.junit.Test;
import org.junit.jupiter.api.*;

/**
 *
 * @author Tabish Hussain Raza
 */
public class DataOfSquareTest {

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
     * Test of lightMeUp method, of class DataOfSquare.
     */
    @Test
    public void testLightMeUp() {
        System.out.println("lightMeUp with three colors");

        /**
         * The following lines shows that a list of colors has been created.
         * Three colors are added to this list and using these three colors, the
         * DataofSquare Class is tested.
         */
        ArrayList<Color> C = new ArrayList<Color>();

        C.add(Color.darkGray);//0
        C.add(Color.BLUE);//1
        C.add(Color.white);//2

        DataOfSquare dataOfSquareInstance = new DataOfSquare(C.indexOf(Color.darkGray));
        dataOfSquareInstance.lightMeUp(0);

        dataOfSquareInstance = new DataOfSquare(C.indexOf(Color.BLUE));
        dataOfSquareInstance.lightMeUp(1);

        dataOfSquareInstance = new DataOfSquare(C.indexOf(Color.white));
        dataOfSquareInstance.lightMeUp(2);

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
