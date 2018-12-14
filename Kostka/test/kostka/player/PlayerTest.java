/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kostka.player;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adam Małota
 */
public class PlayerTest {

    private Player instanceParamHuman;
    private Player instanceHuman;
    private Player instanceParamComp;
    private Player instanceComp;

    /**
     * Set up a intance of Player's class, for Human and Computer
     */
    @Before
    public void setUpPlayer() {
        instanceParamHuman = new PlayerHuman("Tomek");
        instanceHuman = new PlayerHuman();
        instanceParamComp = new PlayerComp("Lukasz");
        instanceComp = new PlayerComp();
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetNameHumanParam() {
        assertEquals("Tomek", instanceParamHuman.getName());
    }

    @Test
    public void testGetNameHumanParamOtherName() {
        assertNotEquals("Sylwia", instanceParamHuman.getName());
    }

    @Test
    public void testGetNameHumanParamNull() {;
        assertNotEquals(null, instanceParamHuman.getName());
    }

    @Test
    public void testGetNameHumanParamNumber() {
        assertNotEquals(1, instanceParamHuman.getName());
    }

    @Test
    public void testGetNameHumanParamLower() {
        assertNotEquals("tomek", instanceParamHuman.getName());
    }

    @Test
    public void testGetNameHumanParamUpper() {
        assertNotEquals("TOMEK", instanceParamHuman.getName());
    }

    @Test
    public void testGetNameHumanParamHex() {
        assertNotEquals(0x322, instanceParamHuman.getName());
    }

    @Test
    public void testGetNameHuman() {
        assertEquals("Domyślny Adam", instanceHuman.getName());
    }

    @Test
    public void testGetNameHumanOtherName() {
        assertNotEquals("Sylwia", instanceHuman.getName());
    }

    @Test
    public void testGetNameHumanNull() {
        assertNotEquals(null, instanceHuman.getName());
    }

    @Test
    public void testGetNameHumanNumber() {
        assertNotEquals(1, instanceHuman.getName());
    }

    @Test
    public void testGetNameHumanLower() {
        assertNotEquals("domyślny adam", instanceHuman.getName());
    }

    @Test
    public void testGetNameHumanUpper() {
        assertNotEquals("DOMYŚLNY ADAM", instanceHuman.getName());
    }

    @Test
    public void testGetNameHumanHex() {
        assertNotEquals(0x322, instanceHuman.getName());
    }

    @Test
    public void testGetNameCompParam() {
        assertEquals("Lukasz", instanceParamComp.getName());
    }

    @Test
    public void testGetNameCompParamOtherName() {
        assertNotEquals("Sylwia", instanceParamComp.getName());
    }

    @Test
    public void testGetNameCompParamNull() {
        assertNotEquals(null, instanceParamComp.getName());
    }

    @Test
    public void testGetNameCompParamNumber() {
        assertNotEquals(1, instanceParamComp.getName());
    }

    @Test
    public void testGetNameCompParamLower() {
        assertNotEquals("lukasz", instanceParamComp.getName());
    }

    @Test
    public void testGetNameCompParamUpper() {
        assertNotEquals("LUKASZ", instanceParamComp.getName());
    }

    @Test
    public void testGetNameCompParamHex() {
        assertNotEquals(0x322, instanceParamComp.getName());
    }

    @Test
    public void testGetNameComp() {
        assertEquals("Domyślny Adam", instanceComp.getName());
    }

    @Test
    public void testGetNameCompOtherName() {
        assertNotEquals("Sylwia", instanceComp.getName());
    }

    @Test
    public void testGetNameCompNull() {
        assertNotEquals(null, instanceComp.getName());
    }

    @Test
    public void testGetNameCompNumber() {
        assertNotEquals(1, instanceComp.getName());
    }

    @Test
    public void testGetNameCompLower() {
        assertNotEquals("domyslny adam", instanceComp.getName());
    }

    @Test
    public void testGetNameCompUpper() {
        assertNotEquals("DOMYŚLNY ADAM", instanceComp.getName());
    }

    @Test
    public void testGetNameCompHex() {
        assertNotEquals(0x322, instanceComp.getName());
    }

    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetNameHuman() {
        String name = "Kuba";
        instanceHuman.setName(name);
        assertEquals("Kuba", instanceHuman.getName());
    }

    @Test
    public void testSetNameHumanOtherName() {
        String name = "Kuba";
        instanceHuman.setName(name);
        assertNotEquals("Sylwia", instanceHuman.getName());
    }

    @Test
    public void testSetNameHumanNull() {
        String name = "Kuba";
        instanceHuman.setName(name);
        assertNotEquals(null, instanceHuman.getName());
    }

    @Test
    public void testSetNameHumanNumber() {
        String name = "Kuba";
        instanceHuman.setName(name);
        assertNotEquals(1, instanceHuman.getName());
    }

    @Test
    public void testSetNameHumanLower() {
        String name = "Kuba";
        instanceHuman.setName(name);
        assertNotEquals("kuba", instanceHuman.getName());
    }

    @Test
    public void testSetNameHumanUpper() {
        String name = "Kuba";
        instanceHuman.setName(name);
        assertNotEquals("KUBA", instanceHuman.getName());
    }

    @Test
    public void testSetNameHumanHex() {
        String name = "Kuba";
        instanceHuman.setName(name);
        assertNotEquals(0x322, instanceHuman.getName());
    }

    @Test
    public void testSetNameHumanNotMatchToReg() {
        String name = "Kuba";
        instanceHuman.setName(name);
        assertNotEquals("K", instanceHuman.getName());
    }

    @Test
    public void testSetNameComp() {
        String name = "Jola";
        instanceComp.setName(name);
        assertEquals("Jola", instanceComp.getName());
    }

    @Test
    public void testSetNameCompOtherName() {
        String name = "Jola";
        instanceComp.setName(name);
        assertNotEquals("Sylwia", instanceComp.getName());
    }

    @Test
    public void testSetNameCompNulll() {
        String name = "Jola";
        instanceComp.setName(name);
        assertNotEquals(null, instanceComp.getName());
    }

    @Test
    public void testSetNameCompNumber() {
        String name = "Jola";
        instanceComp.setName(name);
        assertNotEquals(1, instanceComp.getName());
    }

    @Test
    public void testSetNameCompLower() {
        String name = "Jola";
        instanceComp.setName(name);
        assertNotEquals("jola", instanceComp.getName());
    }

    @Test
    public void testSetNameCompUpper() {
        String name = "Jola";
        instanceComp.setName(name);
        assertNotEquals("JOLA", instanceComp.getName());
    }

    @Test
    public void testSetNameCompHex() {
        String name = "Jola";
        instanceComp.setName(name);
        assertNotEquals(0x322, instanceComp.getName());
    }

    @Test
    public void testSetNameCompNotMatchToReg() {
        String name = "Jola";
        instanceComp.setName(name);
        assertNotEquals("K", instanceComp.getName());
    }

    /**
     * Test of guess method, of class Player.
     */
    @Test
    public void testGuessComp() {
        int num = instanceComp.guess();
        for (int i = 1; i <= 6; i++) {
            if (i == num) {
                assertEquals(i, num);
            }
        }
    }

    @Test
    public void testGuessCompNegative() {
        assertNotEquals(-1, instanceComp.guess());
    }

    @Test
    public void testGuessCompZero() {
        assertNotEquals(0, instanceComp.guess());
    }

    @Test
    public void testGuessCompBiggerNumber() {
        assertNotEquals(7, instanceComp.guess());
    }

    @Test
    public void testGuessCompNull() {
        assertNotEquals(null, instanceComp.guess());
    }

    @Test
    public void testGuessCompString() {
        assertNotEquals("Ala", instanceComp.guess());
    }

    @Test
    public void testGuessCompChar() {
        assertNotEquals('x', instanceComp.guess());
    }
    
    @Test
    public void testGuessCompHex() {
        assertNotEquals(0x322, instanceComp.guess());
    }
}
