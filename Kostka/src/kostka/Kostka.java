package kostka;

import kostka.player.Player;
import kostka.player.PlayerComp;
import kostka.stats.WinStats;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Kostka {

    public static void main(String[] args) {

        WinStats stat = new WinStats();

        Game game = new Game(stat);

//        Player player = new Player();
//        PlayerHuman = new PlayerHuman();
        Player player = new PlayerComp("Adam"); //poliformizm, konstruktor parametrowy

//        try {
//            player.setName("ka7");
//        } catch (IllegalArgumentException ex) {
//            System.err.println("Błąd " + ex.getMessage());
//        } //catch (Exception ex){}
//        player.setName(""); //w konstruktorze bezparametrowym
        game.addPlayer(player);
        game.addPlayer(new PlayerComp("Beata"));
        game.addPlayer(new PlayerComp("Beata"));
        game.addPlayer(new PlayerComp("Beata"));
        game.addPlayer(new PlayerComp("Celina"));
        game.removePlayer("Celina");
        game.printPlayers();
        for (int i = 0; i < 100; i++) {
            System.out.println("------ Game number: " + i + " ------");
            game.play();
        }
        System.out.println("--------- TOP ---------");
        stat.print();

        /* LISTY I ARRAYLISTY */
//        List<String> list = new ArrayList();
//        
//        list.add("raz");
//        list.add("dwa");
//        list.add("trzy");
////        
////        for(int i=0; i<list.size();i++){
////            System.out.println(list.get(i));
////        }
////        
////        for(String o : list){
////            System.out.println(o);
////        }
//        
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        /* LISTY I ARRAYLISTY 2 */
//        List<Integer> list = new ArrayList();
//
//        for (int i = 10; i >= 0; i--) {
//            list.add(i);
//        }
//        Iterator<Integer> it = list.iterator();
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//        System.out.println(list);
    }

}
