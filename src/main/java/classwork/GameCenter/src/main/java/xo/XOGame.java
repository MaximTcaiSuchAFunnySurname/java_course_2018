package xo;

import players.Person;
import players.Player;
import util.FastScanner;
import util.IGame;

import java.util.Random;

public class XOGame implements IGame {
    private FastScanner fs = new FastScanner();
    private Person player;
    private Person bot;
    private boolean finish, playerSideX;
    private int emptyCells = 9;
    private XOCell[][] matrix = new XOCell[3][3];

    public XOGame(Person player, Person bot) {
        this.player = player;
        this.bot = bot;
        this.finish = false;
        this.playerSideX = false;
        for (XOCell[] elem : matrix
        ) {
            for (int i = 0; i < elem.length; i++) {
                elem[i] = XOCell.E;
            }
        }
    }

    @Override
    public void execute() {
        display();
        System.out.print("Choose side(X/O)\n>> ");
        playerSideX = fs.next().equals("X");
        int[] input;
        while (!finish) {
            if (playerSideX) {
                input = inputData(true);
                matrix[input[1]][input[0]] = XOCell.X;
                finish = checkMatrix(XOCell.X);
                if (finish) {
                    exit(true);
                    return;
                }
                input = inputData(false);
                matrix[input[1]][input[0]] = XOCell.O;
                finish = checkMatrix(XOCell.O);
                if (finish) {
                    exit(false);
                    return;
                }
                display();
            } else {
                input = inputData(false);
                matrix[input[1]][input[0]] = XOCell.X;
                finish = checkMatrix(XOCell.X);
                if (finish) {
                    exit(false);
                    return;
                }
                display();
                input = inputData(true);
                matrix[input[1]][input[0]] = XOCell.O;
                finish = checkMatrix(XOCell.O);
                if (finish) {
                    exit(true);
                    return;
                }
            } if (emptyCells==0){
                System.out.println("Draw");
                bot.setScore(bot.getScore()+5);
                player.setScore(player.getScore()+5);
                return;
            }
        }
    }

    private void exit(boolean user) {
        if (user) {
            display();
            System.out.println("You win");
            player.setScore(player.getScore() + 10);
            bot.setScore(bot.getScore() - 10);
        } else {
            display();
            System.out.println("Bot win");
            player.setScore(player.getScore() - 10);
            bot.setScore(bot.getScore() + 10);
        }
    }

    private boolean checkMatrix(XOCell cell) {
        for (XOCell[] elem : matrix
        ) {
            if (cell == elem[0] && elem[1] == elem[2] && elem[0] == elem[1]) return true;
        }
        if (cell == matrix[0][0] && matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2] ||
                cell == matrix[0][2] && matrix[0][2] == matrix[1][1] && matrix[2][0] == matrix[1][1]) return true;
        if (cell == matrix[0][0] && matrix[0][0] == matrix[1][0] && matrix[2][0] == matrix[1][0] ||
                matrix[0][1] == cell && matrix[1][1] == matrix[0][1] && matrix[1][1] == matrix[2][1] ||
                cell == matrix[0][2] && matrix[0][2] == matrix[1][2] && matrix[1][2] == matrix[2][2]) return true;
        return false;
    }

    private int[] inputData(boolean user) {
        if (user) {
            System.out.println("Please, write x,y");
            System.out.print("x >> ");
            int x = fs.nextInt();
            System.out.print("y >> ");
            int y = fs.nextInt();
            while (matrix[y][x] != XOCell.E) {
                System.out.println("Incorrest input, write x,y again");
                System.out.print("x >> ");
                x = fs.nextInt();
                System.out.print("y >> ");
                y = fs.nextInt();
            }
            emptyCells--;
            return new int[]{x, y};
        } else {
            Random rand = new Random();
            int x = rand.nextInt(3);
            int y = rand.nextInt(3);
            while (matrix[y][x] != XOCell.E) {
                x = rand.nextInt(3);
                y = rand.nextInt(3);
            }
            emptyCells--;
            return new int[]{x, y};
        }
    }

    @Override
    public void display() {
        System.out.println("\t0\t1\t2");
        int i = 0;
        for (XOCell[] elem : matrix
        ) {
            System.out.print(i + " ");
            i++;
            for (XOCell el : elem
            ) {
                System.out.print("\t" + el);

            }
            System.out.println();
        }
    }

}