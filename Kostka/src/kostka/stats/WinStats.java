package kostka.stats;

import java.util.HashMap;
import java.util.Map;

public class WinStats implements Stats{

    Map<String, Integer> rank = new HashMap();

    public void addWinner(String name) {
        int score = rank.getOrDefault(name, 0);
        ++score;
        rank.put(name, score);
    }

    public void deleteStats() {
        rank.clear();
    }

    public void print() {
        for (String name : rank.keySet()) {
            System.out.println(name + " - " + rank.get(name));
        }
    }

}
