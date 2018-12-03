package hangman;

import players.Person;
import util.FastScanner;
import util.IGame;
import util.Level;

import java.util.ArrayList;

public class Hangman implements IGame {
    FastScanner fs = new FastScanner();
    Person player;
    String word;
    int mistakes = 0;
    int border;
    boolean victory;
    Level level;

    public Hangman(Person player, Level level) {
        this.player = player;
        this.border = level.getCount();
        this.word = Dictionary.INSTANCE.getWord();
    }

    public void exit() {
        if (victory == false) {
            System.out.println("You lose");
            player.setScore(player.getScore() - 20 / level.getCount());
        } else {
            System.out.println("You win");
            System.out.println("The word was " + word);
            player.setScore(player.getScore() + 20 / level.getCount());
        }
    }

//    public void attempts(String letter) {
//        if (word.contains(letter)) {
//            System.out.println("Correct letter");
//        } else {
//            System.out.println("Wrong letter");
//            mistakes++;
//            System.out.println(mistakes + "/" + border);
//        }
//        for (int i = 0; i < word.length(); i++) {
//            char elem = word.charAt(i);
//            if (String.valueOf(elem).equals(letter)) {
//                System.out.print(letter);
//                continue;
//            } else {
//                System.out.print("_");
//                continue;
//            }
//
//        }
//    }

    @Override
    public void execute() {
        System.out.println("Enter a letter \n>> ");
        //приветствие, в дисплее печатать слово, цикл в дисплее,
        ArrayList<String> letters = new ArrayList<String>();
        int numberOfEmptyLetters = word.length();
        while (numberOfEmptyLetters != 0) {
            String letter = fs.next();
            if (mistakes == border) {
                victory = false;
                System.out.println("Loser");
                exit();
            } else {

                if (word.contains(letter)) {
                    System.out.println("Correct letter");
                    letters.add(letter);
                    numberOfEmptyLetters--;
                } else {
                    System.out.println("Wrong letter");
                    mistakes++;
                    System.out.println(mistakes + "/" + border);
                }
                for (int i = 0; i < word.length(); i++) {
                    if (String.valueOf(word.charAt(i)).equals(letter)) {
                        word.charAt(i);
                        System.out.print(letter);
                    } else {
                        System.out.print("@");
                    }
                }
            }
        }
        if (numberOfEmptyLetters == 0 && mistakes != border) {
            victory = true;
            exit();
        }
    }

    @Override
    public void display() {
//        for (int i = 0; i < word.length(); i++) {
//            String letter = fs.next()
//
//            if (String.valueOf(word.charAt(i)).equals(letter)) {
//                word.charAt(i);
//                System.out.print(letter);
//            } else {
//                System.out.print("@");
//            }
//
//    }}
    }
}