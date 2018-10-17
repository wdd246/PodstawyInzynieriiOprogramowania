package kostka;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Adam
 */
public class Kostka {

    public static void main(String[] args) {
        Random r = new Random();

        Player player = new Player();
        int number, random;

        player.setName("Adam");

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

}
