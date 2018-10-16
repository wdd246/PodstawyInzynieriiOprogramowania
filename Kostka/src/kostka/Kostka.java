/*
 * To change this license header, choose License Headers in Project
Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kostka;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Kostka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        //Scanner in = new Scanner(System.in);
        Player player = new Player();
        int number, random;

        do {
            System.out.print("Wpisz liczbe 1-6\n");
            number = player.guess();
            random = r.nextInt(6) + 1;
            if (number != random) {
                System.out.print("Źle. Podałeś " + number +
" a na kostce było " + random + "\n");
            }
        } while (number != random);

        System.out.print("Wpisałeś " + number + " i zgadłeś\n");

    }

}