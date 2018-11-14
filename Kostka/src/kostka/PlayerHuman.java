package kostka;

import java.util.Scanner;

public class PlayerHuman extends Player {

    private final Scanner in = new Scanner(System.in);

    public PlayerHuman(String name) {
        //this.name = name;
        super(name); //odwołuje sie do konstruktora wyższej
        //super.setName(name); 
    }

    //konstruktor bezparametrowy
    public PlayerHuman() {

    }

    @Override //nadpisanie / przyslanianie
    //zgadujace
    public int guess() {
        return in.nextInt();
    }
}
