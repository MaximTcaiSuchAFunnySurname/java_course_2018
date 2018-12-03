package hangman;

import java.util.Random;

public class Dictionary {
    public static final Dictionary INSTANCE = new Dictionary();
    private String[] words = {"cat", "dog", "hamster"};
    private  Random rd = new Random();

    public String getWord(){
        return words[new Dictionary().rd.nextInt(words.length)];
    }
}
