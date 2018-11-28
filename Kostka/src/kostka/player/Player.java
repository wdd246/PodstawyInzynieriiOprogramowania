package kostka.player;

import java.util.Random;

public abstract class Player {

    private String name = "Domyślny Adam";

//    konstruktor
    public Player(String name) {
//        this.name = name;
        setName(name);
    }

//    konstruktor bezparametrowy
    public Player() {
        this.name = "Domyślny Adam";
    }

//    getter name
    public String getName() {
        return this.name;
    }

//    setter name
    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z][a-zA-Z0-9@_.\\-]{2,29}$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Wpisz poprawne imię");
        }
    }

    abstract public int guess();

}
