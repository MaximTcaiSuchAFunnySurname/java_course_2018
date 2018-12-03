package classwork.animal;

public class SecondCat extends Animal {
    Breed breed;

    public SecondCat(Color color, Age age, String name, Breed breed) {
        super(color, age, name);
        this.breed = breed;
    }

    public enum Breed {
        BRITISH,
        SPHINKS,
        HOMELESS,
    }

    @Override
    public String toString() {
        return "SecondCat{" +
                "breed=" + breed +
                ", color=" + color +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
