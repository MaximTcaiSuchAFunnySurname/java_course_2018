package classwork.human;

import java.util.Objects;

public class Human {
    private String name;
    private int age;
    private boolean ifMale;

    @Override
    public int hashCode(){
        return name.hashCode()*10+125+age*boolToInt(ifMale);
    }

    private int boolToInt(boolean bool){
        return bool? 1:2;
    }
    public Human(String name, int age, boolean ifMale) {
        this.name = name;
        this.age = age;
        this.ifMale = ifMale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                Objects.equals(name, human.name)&&
                Objects.equals(ifMale, human.ifMale);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
