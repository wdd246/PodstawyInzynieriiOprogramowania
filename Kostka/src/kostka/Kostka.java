package kostka;

import java.util.Random;
import java.util.Scanner;

public class Kostka {

    public static void main(String[] args) {
        Random r = new Random();

        //Player player = new Player();
        //PlayerHuman = new PlayerHuman();
        Player player = new PlayerHuman(); //poliformizm, konstruktor parametrowy
        int number, random;
        
        try {
            player.setName("ka7");
        } catch (IllegalArgumentException ex) {
            System.err.println("Błąd " + ex.getMessage());
        } //catch (Exception ex){}

        //player.setName(""); //w konstruktorze bezparametrowym
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
