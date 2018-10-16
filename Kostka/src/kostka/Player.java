/*
 * To change this license header, choose License Headers in Project
Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kostka;

import java.util.Random;

/**
 *
 * @author Student
 */
public class Player {

    public int guess() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }

}