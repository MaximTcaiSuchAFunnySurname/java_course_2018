package codewars;

public class People{
    public int age;
    public String name;
    public String lastName;

    final String greet="hello";

    public String greet(){
        return greet+" my name is "+name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGreet() {
        return greet;
    }
  public People build(){
      People people = new People(String name, String lastName,;
      return people;

}}
