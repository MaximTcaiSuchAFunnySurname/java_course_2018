import hangman.Hangman;
import players.Bot;
import storage.Storage;
import util.FastScanner;
import players.Person;
import players.Player;
import util.IGame;
import util.Level;
import xo.XOGame;

import java.io.File;
import java.io.IOException;

public class Main {
    private static FastScanner fs = new FastScanner();
    private static IGame game;


    public static void main(String[] args) {
        System.out.println("Greetings, please write ur name");
        System.out.print(">> ");
        Person player = new Player(fs.next());
        Person bot = new Bot("Bob");
        System.out.println(player);
        System.out.print("Please, choose game \n>> ");
        String cmd = fs.next().toLowerCase();
        while (!cmd.equals("exit")) {
            switch (cmd) {
                case "stat":
                    System.out.println(player);
                    break;
                case "xo": game = new XOGame(player, bot); game.execute();
                    break;
                case "hangman" :
                    System.out.println("Choose level(Easy, Normal, Hard, Heroic ");
                    String level = fs.next();
                    game = new Hangman(player, Level.valueOf(level.toUpperCase()));
                    game.execute();
                    break;
                default:
                    cmd = error();
                    continue;
            }

            System.out.print("Please, choose game \n>> " );
            cmd = fs.next();
            game = null;
        }

    }

    private static String error(){
        System.out.println("Error. Wrong command. Please, try again");
        System.out.println("stat/exit/xo/hangman");
        System.out.print(">> ");
        return fs.next();
    }
}