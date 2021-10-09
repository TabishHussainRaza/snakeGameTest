package snake;

import java.awt.Button;
import java.awt.event.KeyEvent;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Tabish Hussain Raza
 */
public class KeyboardListenerTest {

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
     * Test of keyPressed method, of class KeyboardListener.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("Key Press started");

        Button myButton = new Button();

        KeyEvent leftKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_LEFT); //left key
        KeyEvent rightKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_RIGHT); //right key
        KeyEvent upKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_UP); //up key
        KeyEvent downKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_DOWN); //down key
        KeyEvent escapeKeyPressed = new KeyEvent(myButton, 1, 1, 1, KeyEvent.VK_ESCAPE); //down key

        KeyboardListener keyEvent = new KeyboardListener();

        /*
            The following lines of codes checks for towards and opposite keys. For instance
            when snake is going right, the right key and left key will be not be able to work.
            This is checked for all possible combinations in the same manner.
         */
        keyEvent.keyPressed(leftKeyPressed);
        System.out.println("Left Key Pressed");
        keyEvent.keyPressed(rightKeyPressed);
        System.out.println("Right Key Pressed");
        keyEvent.keyPressed(downKeyPressed);
        System.out.println("Down Key Pressed");
        keyEvent.keyPressed(upKeyPressed);
        System.out.println("Up Key Pressed");
        keyEvent.keyPressed(rightKeyPressed);
        System.out.println("Right Key Pressed");
        keyEvent.keyPressed(leftKeyPressed);
        System.out.println("Left Key Pressed");
        keyEvent.keyPressed(upKeyPressed);
        System.out.println("Up Key Pressed");
        keyEvent.keyPressed(downKeyPressed);
        System.out.println("Down Key Pressed");
        keyEvent.keyPressed(escapeKeyPressed);
        System.out.println("Down Key Pressed");

        /*
            The following lines of codes causes the snake to visit all of the squares several times.
            It's not necessary to run it the number of times i have selected rather it can be completed in a few cycles. 
            Because it contains numerous iterations, it can take a bit longer depending on the pc. 
            More number of iterations will ensure that the snake will move across the board diagonally in all directions.
         */
        for (int i = 0; i < 1800; i++) {
            keyEvent.keyPressed(leftKeyPressed);
            System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed);
            System.out.println("Down Key Pressed");
            keyEvent.keyPressed(leftKeyPressed);
            System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed);
            System.out.println("Down Key Pressed");
            keyEvent.keyPressed(leftKeyPressed);
            System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed);
            System.out.println("Down Key Pressed");
        }

        for (int i = 0; i < 1800; i++) {
            keyEvent.keyPressed(rightKeyPressed);
            System.out.println("Right Key Pressed");
            keyEvent.keyPressed(upKeyPressed);
            System.out.println("Up Key Pressed");
            keyEvent.keyPressed(rightKeyPressed);
            System.out.println("Right Key Pressed");
            keyEvent.keyPressed(upKeyPressed);
            System.out.println("Up Key Pressed");
            keyEvent.keyPressed(rightKeyPressed);
            System.out.println("Right Key Pressed");
            keyEvent.keyPressed(upKeyPressed);
            System.out.println("Up Key Pressed");
        }

        for (int i = 0; i < 1800; i++) {
            keyEvent.keyPressed(leftKeyPressed);
            System.out.println("Left Key Pressed");
            keyEvent.keyPressed(upKeyPressed);
            System.out.println("Up Key Pressed");
            keyEvent.keyPressed(leftKeyPressed);
            System.out.println("Left Key Pressed");
            keyEvent.keyPressed(upKeyPressed);
            System.out.println("Up Key Pressed");
            keyEvent.keyPressed(leftKeyPressed);
            System.out.println("Left Key Pressed");
            keyEvent.keyPressed(upKeyPressed);
            System.out.println("Up Key Pressed");
        }

        for (int i = 0; i < 1800; i++) {
            keyEvent.keyPressed(leftKeyPressed);
            System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed);
            System.out.println("Down Key Pressed");
            keyEvent.keyPressed(leftKeyPressed);
            System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed);
            System.out.println("Down Key Pressed");
            keyEvent.keyPressed(leftKeyPressed);
            System.out.println("Left Key Pressed");
            keyEvent.keyPressed(downKeyPressed);
            System.out.println("Down Key Pressed");
        }

        //The following lines fo code makes the snake bite itself.
        keyEvent.keyPressed(leftKeyPressed);
        System.out.println("Left Key Pressed");
        keyEvent.keyPressed(leftKeyPressed);
        System.out.println("Left Key Pressed");
        keyEvent.keyPressed(downKeyPressed);
        System.out.println("Down Key Pressed");
        keyEvent.keyPressed(downKeyPressed);
        System.out.println("Down Key Pressed");
        keyEvent.keyPressed(upKeyPressed);
        System.out.println("Up Key Pressed");
        keyEvent.keyPressed(upKeyPressed);
        System.out.println("Up Key Pressed");
        keyEvent.keyPressed(rightKeyPressed);
        System.out.println("Right Key Pressed");
        keyEvent.keyPressed(rightKeyPressed);
        System.out.println("Right Key Pressed");

        System.out.println("Key press test Success!");

        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
