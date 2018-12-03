package classwork;

import classwork.gamesForMyMaster.slotMachines.Card;
import classwork.gamesForMyMaster.slotMachines.Game;
import classwork.gamesForMyMaster.slotMachines.PrizeCategory;
import classwork.gamesForMyMaster.slotMachines.Terminal;
import classwork.gamesForMyMaster.slotMachines.hangman.Hangman;
import classwork.paper.Book;
import classwork.paper.Magazine;
import classwork.paper.Printer;
import classwork.util.ASCII;
import classwork.util.Data;
import classwork.util.Day;
import classwork.util.Month;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Dog bobik = new Dog(Animal.Color.WHITE,
//                Dog.Breed.SHPIZ, Animal.Age.OLD, "Bobik");
//        System.out.println(bobik.toString());
//        Animal muck = new Dog(Animal.Color.WHITE,
//                Dog.Breed.SHPIZ, Animal.Age.OLD, "Muck");
//        if (muck instanceof Dog)
//            System.out.println("Doggo");
//        System.out.println(muck.toString());
//        if (muck instanceof Animal)
//            System.out.println("Animal");
//        Animal rita = new Dog(Animal.Color.WHITE,
//                Dog.Breed.SHPIZ, Animal.Age.OLD, "Rita");
//        if (rita instanceof Dog)
//            System.out.println("Rita is a Doggo");
//        System.out.println(rita.toString());
//        if (rita instanceof Animal)
//            System.out.println("Rita is an Animal");
//        if (rita instanceof Object)
//            System.out.println("Rita is an Object");
//        Animal temp = (Dog) rita;
//        System.out.println(temp.getClass());
//        ((Animal) rita).display();
//        Animal marta = new SecondCat(Animal.Color.WHITE,
//                Animal.Age.OLD, "Marta", SecondCat.Breed.HOMELESS);
//        if (marta instanceof Dog)
//            System.out.println("Marta is a Dog");
//        else System.out.println("Marta isn't a Dog");
//        System.out.println(Test.TEST1.displayName());
//        String str = in.next();
//        Printer paper = getPrinter(str);
//        paper.print();
//        Object bob = new Human("Bob", 20, true);
//        Object bob1 = new Human("Bob", 20, false);
//        System.out.println(bob.toString());
//        Human tom = new Human("Tom", 23, true);
//        System.out.println("bob-" + bob.hashCode());
//        System.out.println("bob1-" + bob1.hashCode());
//        System.out.println("tom-" + tom.hashCode());
//        if (bob.hashCode() == bob1.hashCode()) {
//            System.out.println("bob=bob1");
//        } else System.out.println("bob!=bob1");
//        System.out.println(bob.getClass());
//        if (((Human) bob).getName().equals(((Human) bob1).getName())) {
//            System.out.println("eq");
//        } else
//            System.out.println("not eq");
//        if (bob.equals(bob1)) {
//            System.out.println("eq");
//        } else
//            System.out.println("not eq");
//        String greet = "hi";
//        String greet2 = new String("hi");
//        System.out.println(greet.equals(greet2));
//        System.out.println(greet.hashCode() + " " + greet2.hashCode());
//        System.out.println(greet.hashCode() == greet2.hashCode());
//        Integer test = 2345;
//        Integer test1 = new Integer(2345);
//        System.out.println(test.hashCode() == test1.hashCode());
//        Container cont = new Container<Integer, String>(2, "con");
//        Container cont2 = new Container<String, Integer>("Container", 47);
//        cont.printDisplay();
//        cont2.printDisplay();
//        System.out.println("Select a game:");
//        System.out.println("Overwatch, Hearthstone");
//        Card card = new Card();
//        card.cardID = card.hashCode();
//        Terminal terminal = new Terminal();
//        Game game = new Game(in.next());
//        System.out.println("Your card ID is " + card.hashCode());
//        game.moneyBoost(card);
//        System.out.println("YOur balance is " + card.numberOfPoints + " points");
//        System.out.println("Choose a prize you want:");
//        System.out.println("teddyBear, rubber, pizza");
//        PrizeCategory prize = new PrizeCategory(in.next());
//
//        prize.prizeChoose(terminal, card);
//        prize.prizeGive();
        Hangman hangman = new Hangman("java", 10);
       hangman.attempts(in.next());
    }


    public enum Test {
        TEST1("test1"),
        TEST2("test2");
        String name;

        Test(String name) {
            this.name = name;
        }

        public String displayName() {
            return name;

        }
    }

    public static Printer getPrinter(String str) {
        if (str.equals("book")) {
            System.out.println("Plz write data about author, name, sheets, data of writing and data of publishing");
            String author = in.next();
            String name = in.next();
            int sheets = in.nextInt();
            Data publishData;
            Day dayPub = Day.valueOf(in.next());
            Month monthPub = Month.valueOf(in.next());
            publishData = new Data(dayPub, monthPub);
            Data writeData;
            Day dayWrite = Day.valueOf(in.next());
            Month monthWrite = Month.valueOf(in.next());
            writeData = new Data(dayWrite, monthWrite);

            return new Book(author, name, sheets, publishData, writeData);

        } else return new Magazine("Magazine", new Data(Day.THURSDAY, Month.April));
    }

    public static void jpegToASCII() {
        Scanner in = new Scanner(System.in);
        String path = in.next();
        File file = new File(path);
        BufferedImage img = null;
        FileWriter writer = null;
        try {
            img = ImageIO.read(file);
            writer = new FileWriter("outFile.txt", true);
            String ascii = new ASCII(true).convert(img);
            System.out.println(ascii);
            writer.write(ascii);
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}