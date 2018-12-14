/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kostka.player;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.StringBufferInputStream;
import static java.lang.System.in;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.w3c.dom.ranges.Range;

/**
 *
 * @author adamm
 */
public class PlayerTest {

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetNameHumanParam() {
        Player instance = new PlayerHuman("Tomek");
        String result = instance.getName();
        assertEquals("Tomek", result);
    }

    @Test
    public void testGetNameHumanParamFail() {
        Player instance = new PlayerHuman("Tomek");
        String result = instance.getName();
        assertNotEquals("Sylwia", result);
        assertNotEquals(null, result);
        assertNotEquals(1, result);
        assertNotEquals("tomek", result);
    }

    @Test
    public void testGetNameHuman() {
        Player instance = new PlayerHuman();
        String result = instance.getName();
        assertEquals("Domyślny Adam", result);
    }

    @Test
    public void testGetNameHumanFail() {
        Player instance = new PlayerHuman();
        String result = instance.getName();
        assertNotEquals("Sylwia", result);
        assertNotEquals(null, result);
        assertNotEquals(1, result);
        assertNotEquals("domyślny adam", result);
    }

    @Test
    public void testGetNameCompParam() {
        Player instance = new PlayerComp("Lukasz");
        String result = instance.getName();
        assertEquals("Lukasz", result);
    }

    @Test
    public void testGetNameCompParamFail() {
        Player instance = new PlayerComp("Lukasz");
        String result = instance.getName();
        assertNotEquals("Sylwia", result);
        assertNotEquals(null, result);
        assertNotEquals(1, result);
        assertNotEquals("lukasz", result);
    }

    @Test
    public void testGetNameComp() {
        Player instance = new PlayerComp();
        String result = instance.getName();
        assertEquals("Domyślny Adam", result);
    }

    @Test
    public void testGetNameCompFail() {
        Player instance = new PlayerComp();
        String result = instance.getName();
        assertNotEquals("Sylwia", result);
        assertNotEquals(null, result);
        assertNotEquals(1, result);
        assertNotEquals("domyslny adam", result);
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetNameHuman() {
        String name = "Kuba";
        Player instance = new PlayerHuman();
        instance.setName(name);
        assertEquals("Kuba", instance.getName());
    }

    @Test
    public void testSetNameHumanFail() {
        String name = "Kuba";
        Player instance = new PlayerHuman();
        instance.setName(name);
        assertNotEquals("Sylwia", instance.getName());
        assertNotEquals(null, instance.getName());
        assertNotEquals(1, instance.getName());
        assertNotEquals("kuba", instance.getName());
        assertNotEquals("K", instance.getName());
    }

    @Test
    public void testSetNameComp() {
        String name = "Jola";
        Player instance = new PlayerComp();
        instance.setName(name);
        assertEquals("Jola", instance.getName());
    }

    @Test
    public void testSetNameCompFail() {
        String name = "Jola";
        Player instance = new PlayerComp();
        instance.setName(name);
        assertNotEquals("Sylwia", instance.getName());
        assertNotEquals(null, instance.getName());
        assertNotEquals(1, instance.getName());
        assertNotEquals("jola", instance.getName());
        assertNotEquals("K", instance.getName());
    }

    /**
     * Test of guess method, of class Player.
     */
    @Test
    public void testGuessComp() {
        Player instance = new PlayerComp();
        int num = instance.guess();
        for (int i = 1; i <= 6; i++) {
            if (i == num) {
                assertEquals(i, num);
            }
        }
    }

    @Test
    public void testGuessCompFail() {
        Player instance = new PlayerComp();
        assertNotEquals(-1, instance.guess());
        assertNotEquals(0, instance.guess());
        assertNotEquals(7, instance.guess());
        assertNotEquals(null, instance.guess());
        assertNotEquals("Ala", instance.guess());
        assertNotEquals('x', instance.guess());
    }
}
