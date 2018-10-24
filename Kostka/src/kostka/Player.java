package kostka;

import java.util.Random;

public abstract class Player {

    private String name = "Adam";

    //konstruktor
    public Player(String name) {
        //this.name = name;
        setName(name);
    }

    //konstruktor bezparametrowy
    public Player() {
        this.name = "Tomek";
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

    abstract public int guess();

}
