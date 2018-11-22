package classwork.gamesForMyMaster;

import java.util.Random;
import java.util.Scanner;

public class Game {
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    String name;

    public Game(String name) {
        this.name = name;
    }

    public void moneyBoost(Card card) {

            if (name.equals("Overwatch")) {
                card.numberOfPoints += random.nextInt(5000);
            } else if (name.equals("Hearthstone") ) {
                card.numberOfPoints += random.nextInt(2000) + random.nextInt(200);
            }else {
                System.out.println("We don't have this game:(");
                System.exit(7);
            }

    }
}
