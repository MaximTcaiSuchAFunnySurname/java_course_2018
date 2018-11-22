package classwork.gamesForMyMaster;

public class Terminal {
    public void actions(Card card,int prizeCost, int numberOfPrizes ) {
        if (card.numberOfPoints >=  prizeCost) {
            card.numberOfPoints -= prizeCost;
            numberOfPrizes -= 1;
            System.out.println("Done");;

        } else System.out.println("Not enough money");;

    }

}
