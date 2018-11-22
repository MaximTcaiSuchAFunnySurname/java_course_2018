package classwork.gamesForMyMaster.slotMachines.hangman;

import classwork.util.ArrayList;

import java.util.Scanner;

public class Hangman {
    Scanner in = new Scanner(System.in);
    String[] word = new String[]{"j","a","v","a"};
    ArrayList<String> stringArrayList = new ArrayList<>();
    public void wordReturn(){

       for(int i = 0; i < 33;){
           String guess = in.next();
           for (int k = 0; k<word.length-1; k++)
           if (guess == word[i]){
               System.out.print(word[i]);
           } else{
               System.out.print("_");

           }

       }


        }
    }

