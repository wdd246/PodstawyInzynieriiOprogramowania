package kostka;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Iterator;

public class Game {

    //protected Player player; //poliformizm, konstruktor parametrowy
    protected List<Player> players = new ArrayList();
    //Iterator<Player> it = list.iterator();
    protected Random r = new Random();

//     play a game
    public void play() {

        int number, random;
        boolean oneMore;
        do {
            oneMore = true;

            random = r.nextInt(6) + 1;

            for (Player player : players) {
                System.out.print(player.getName() + " Wpisz liczbe 1-6\n");
                number = player.guess();
                if (number != random) {
                    System.out.print("Źle. " + player.getName() + " podałeś " + number + " a na kostce było " + random + "\n");
                } else {
                    oneMore = false;
                    System.out.print(player.getName() + " wpisałeś " + number + " i zgadłeś\n");
                }
            }
        } while (oneMore);

    }
//    add player to multiplayer

    public void addPlayer(Player player) {
        //this.player = player;
        if (player != null) {
            if (!isNameExist(player.getName())) {
                players.add(player);
            } else {
                player.setName(player.getName() + r.nextInt(10));
                addPlayer(player);
            }
        } else {
            throw new IllegalArgumentException("Gracz niemoże być NULL");
        }
    }

    public boolean isNameExist(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public void removePlayer(String name){
//        for (Player player : players) {
//            if(player.getName().equals(name)) {
//                players.remove(player);
//                break;
//            }
//        }

        Iterator <Player> playersit = players.iterator();
        while(playersit.hasNext()){
            if(playersit.next().getName().equals(name)) {
                playersit.remove();
                break;
            }
        }
        
//        for(Iterator <Player> playersit = players.iterator(); playersit.hasNext(); ){
//            if(playersit.next().getName().equals(name)) {
//                playersit.remove();
//                break;
//            }
//        }
    }
    
    public void printPlayers(){
        System.out.println("Lista graczy:");
        for (Player player : players) {
            System.out.println(player.getName());
        }
        
    }
}
