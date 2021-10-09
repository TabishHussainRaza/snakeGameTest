/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Color;
import static java.awt.Color.blue;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author Tabish Hussain Raza
 */
public class SquarePanelTest {

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
     * Test of ChangeColor method, of class SquarePanel.
     */
    @Test
    public void testChangeColor() {
        System.out.println("ChangeColor");
        Color d = null;
        SquarePanel squarePanelInstance = new SquarePanel(blue);
        squarePanelInstance.ChangeColor(d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
