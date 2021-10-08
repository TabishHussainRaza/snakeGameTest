package snake;

import java.awt.Color;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Tabish Hussain Raza
 */
public class DataOfSquareTest {

    public DataOfSquareTest() {
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
