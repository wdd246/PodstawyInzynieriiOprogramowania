package kostka;

import java.util.Random;

public class PlayerComp extends Player {

    private final Random r = new Random();

    public PlayerComp(String name) {
        super(name);
    }

    public PlayerComp() {
    }

    @Override //nadpisanie / przyslanianie
    //odgadujące
    public int guess() {
        return r.nextInt(6) + 1;
    }

}
