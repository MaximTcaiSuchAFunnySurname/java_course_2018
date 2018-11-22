package classwork.gamesForMyMaster;

import java.util.Scanner;

public class PrizeCategory {
    Scanner sc = new Scanner(System.in);
    String prize;
    public int prizeCost;
    public int numberOfPrizes = 10;
    public void prizeChoose(Terminal term, Card card){
        int[] cost = {200, 100, 40000};
        if (prize.equals("teddyBear")){
            prizeCost = cost[0];
        } else if(prize.equals("rubber")){
            prizeCost = cost[1];
        } else if(prize.equals("pizza")){
            prizeCost = cost[2];
        }
        term.actions(card, prizeCost, numberOfPrizes);
    }

    public void prizeGive() {


    }

    public PrizeCategory(Scanner sc, String prize) {
        this.sc = sc;
    }

    public PrizeCategory(String prize) {
        this.prize = prize;
        this.prizeCost = prizeCost;
    }
}
