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

    private String name = "Adam";

    //konstruktor
    public Player(String name) {
        //this.name = name;
        setName(name);
    }

    //konstruktor bezparametrowy
    public Player() {
        this.name = "Adam";
    }

    //getter name
    public String getName() {
        return this.name;
    }

    //setter name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.err.println("Wpisz poprawne imię");
        }
    }

    //odgadujące
    public int guess() {
        Random r = new Random();
        return r.nextInt(6) + 1;
    }

}
