package classwork;

import classwork.animal.Animal;
import classwork.animal.Dog;
import classwork.animal.SecondCat;
import classwork.util.ASCII;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog(Animal.Color.WHITE,
                Dog.Breed.SHPIZ, Animal.Age.OLD, "Bobik");
        System.out.println(bobik.toString());
        Animal muck = new Dog(Animal.Color.WHITE,
                Dog.Breed.SHPIZ, Animal.Age.OLD, "Muck");
        if (muck instanceof Dog)
            System.out.println("Doggo");
        System.out.println(muck.toString());
        if (muck instanceof Animal)
            System.out.println("Animal");
        Animal rita = new Dog(Animal.Color.WHITE,
                Dog.Breed.SHPIZ, Animal.Age.OLD, "Rita");
        if (rita instanceof Dog)
            System.out.println("Rita is a Doggo");
        System.out.println(rita.toString());
        if (rita instanceof Animal)
            System.out.println("Rita is an Animal");
        if (rita instanceof Object)
            System.out.println("Rita is an Object");
        Animal temp = (Dog) rita;
        System.out.println(temp.getClass());
        ((Animal) rita).display();
        Animal marta = new SecondCat(Animal.Color.WHITE,
                Animal.Age.OLD, "Marta", SecondCat.Breed.HOMELESS);
        if (marta instanceof Dog)
            System.out.println("Marta is a Dog");
        else System.out.println("Marta isn't a Dog");
        System.out.println(Test.TEST1.displayName());
    }

     public enum Test{
        TEST1("test1"),
        TEST2("test2");
         String name;
        Test(String name){
            this.name = name;
        }
        public String displayName(){
            return name;

        }
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