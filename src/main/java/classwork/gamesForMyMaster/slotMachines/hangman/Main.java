package classwork.gamesForMyMaster.slotMachines.hangman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hangman hangman = new Hangman();
        hangman.wordReturn();
    }
}
