package com.company.animal;

public class Cat {
    int age;
    String name;
    String breed;
    int weight;

    {
        age = 3;
        name = "Барсик";
        breed = "Бродячий";
        weight = 5;
    }

    public Cat(int age, String name, String breed, int weight) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void condition() {
        if (age > 3 || weight > 5) {
            System.out.println(name + " wants to eat");
        } else
            System.out.println("Meow...");
    }

    public void namesakesDetector(Cat cat) {
        if (cat.name == name) {
            System.out.println(name + " and " + cat.name + " are namesakes");
        } else {
            System.out.println(name + " and " + cat.name + " don't have the same names");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}