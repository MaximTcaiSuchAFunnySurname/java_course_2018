package classwork.animal;

public class Dog extends Animal{
    Breed breed;

    public Dog(Color color, Dog.Breed breed, Age age, String name) {
        super(color, age, name);
        this.breed = breed;
    }
    public void display(){
        System.out.println("Hi from dog");
    }
    @Override
    public String toString() {
        return "Dog{" +
                "breed=" + breed +
                ", color=" + color +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public enum Breed{
        MOPS,
        DALMATINE,
        SHPIZ,
    }
}
