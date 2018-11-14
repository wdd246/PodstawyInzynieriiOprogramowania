package kostka;

import java.util.Random;

public class Game {

    protected Player player; //poliformizm, konstruktor parametrowy
    protected Random r = new Random();

//     play a game
    public void play() {

        int number, random;
        do {
            System.out.print(player.getName() + " Wpisz liczbe 1-6\n");
            number = player.guess();
            random = r.nextInt(6) + 1;
            if (number != random) {
                System.out.print("Źle. " + player.getName() + " podałeś " + number + " a na kostce było " + random + "\n");
            }
        } while (number != random);

        System.out.print(player.getName() + " wpisałeś " + number + " i zgadłeś\n");
    }
//    add player to multiplayer

    public void addPlayer(Player player) {
        this.player = player;
    }
}
