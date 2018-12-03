package classwork.gamesForMyMaster.slotMachines;

import classwork.gamesForMyMaster.slotMachines.Card;

public class Terminal {
    public void actions(Card card, int prizeCost, int numberOfPrizes) {
        if (card.numberOfPoints >= prizeCost) {
            card.numberOfPoints -= prizeCost;
            numberOfPrizes--;
            System.out.println("Done");
        } else System.out.println("Not enough money");

    }

}