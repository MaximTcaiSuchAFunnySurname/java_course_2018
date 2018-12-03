package classwork.gamesForMyMaster.slotMachines;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select a game:");
        System.out.println("Overwatch, Hearthstone");
        Card card = new Card();
        card.cardID = card.hashCode();
        Terminal terminal = new Terminal();
        Game game = new Game(in.next());
        System.out.println("Your card ID is " + card.hashCode());
        game.moneyBoost(card);
        System.out.println("YOur balance is " + card.numberOfPoints + " points");
        System.out.println("Choose a prize you want:");
        System.out.println("teddyBear, rubber, pizza");
        PrizeCategory prize = new PrizeCategory(in.next());

        prize.prizeChoose(terminal, card);
    }


}