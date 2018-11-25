package classwork.gamesForMyMaster.slotMachines.hangman;

import classwork.util.ArrayList;

public class Hangman {
    String word;
    int n = 0;
    int border;

    public void attempts(String letter) {
        if (word.contains(letter)) {
            System.out.println("Correct letter");
        } else {
            System.out.println("Wrong letter");
            n++;
            System.out.println(n + "/" + border);
        }
        for (int i = 0; i<word.length(); i++){
            char elem = word.charAt(i);
            Character.toString(elem);
            if ( elem==letter){
                System.out.print(letter);
                continue;
            } else{
                System.out.print("_");
                continue;
            }

        }
    }

    public Hangman(String word, int border) {
        this.word = word;
        this.border = border;
    }
}




