package com.company.animal;

public class Hamster {
    String name;
    String gender;
    int weight;
    int age;

    public Hamster(String name, String gender, int weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;

        if (age > 20) {
            System.out.println("This hamster is so old...");
        } else {
            this.age = age;
        }
    }

    {
        name = "Hamster";
        weight = 0;
        age = 0;
    }

    public void condition() {
        if (age > 5 || weight > 4) {
            System.out.println("Z-Z-Z-Z");
        } else
            System.out.println(name + " is awaken");
    }

    public void foodRecommended() {
        if (age < 1) {
            System.out.println(name + "'d better eat mashed vegetables and fruit");
        } else {
            System.out.println(name + "'d better eat fresh vegetables and fruit");
        }
    }

    public void relationship(Hamster hamster) {
        if ((gender == "male" && hamster.gender == "female") || (hamster.gender == "male" && gender == "female")) {
            System.out.println(name + " and " + hamster.name + " can have little hamsters");
        } else {
            System.out.println("They have the same gender");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}