package classwork.animal;

public class Animal {
    Color color;
    Age age;
    String name;
  public void display(){
      System.out.println("Hi from animal");
  }

    public enum Color {
        GREEN,
        BLUE,
        PURPLE,
        SCARLET,
        WHITE,
    }

    public enum Age {
        YOUNG,
        OLD,
    }

    public Animal(Color color, Age age, String name) {
        this.color = color;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color=" + color +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
