package util;

public enum Level {
    HEROIC(1), //1
    HARD(4), //3
    NORMAL(5), // 5
    EASY(10);//10
    private int count;

    public int getCount(){
        return count;
    }

    Level(int count) {
        this.count = count;
    }
}

class Level2{
    private int count;
    private String name;

    public int getCount() {
        return count;
    }

    public Level2(String name, int count){
        this.count = count;
        this.name = name;
    }
}

class Test{
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        Level2 easy = new Level2("Easy", 10);
        Level2 normal = new Level2("Normal", 5);
        Level.NORMAL.getCount();
        System.out.println("Choose level(Easy, Normal, Hard, Heroic ");
        String level = fs.next();
        System.out.println(Level.valueOf(level.toUpperCase()));
    }
}
