package classwork.gamesForMyMaster.slotMachines;

public class PrizeCategory {
    String prize;
    public int prizeCost;
    public int numberOfPrizes = 10;

    public void prizeChoose(Terminal term, Card card) {
        int[] cost = {200, 100, 40000};
        if (prize.equals("teddyBear")) {
            prizeCost = cost[0];
        } else if (prize.equals("rubber")) {
            prizeCost = cost[1];
        } else if (prize.equals("pizza")) {
            prizeCost = cost[2];
        } else {
            System.out.println("we don't have this prize");
            System.exit(00);
        }
        term.actions(card, prizeCost, numberOfPrizes);
        System.out.println("Here is your " + prize);
    }

    public PrizeCategory(String prize) {
        this.prize = prize;
        this.prizeCost = prizeCost;
    }
}