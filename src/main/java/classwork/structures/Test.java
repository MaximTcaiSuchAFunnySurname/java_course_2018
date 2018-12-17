package classwork.structures;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Russia");
        list.add("Germany");
        list.add("France");
        list.add("USA");
        list.add("England");
        list.add("Canada");
        list.add("Japan");
        System.out.println(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
//        System.out.println();
//        for (String elem : list
//        ) {
//            System.out.print(elem + " ");
//            if (elem.equals("Russia"))
//                System.out.println("MOTHER RUSSIA ");
//        }
//        ListIterator<String> iter = list.listIterator();
//        while (iter.hasNext()) {
//            if (iter.hasPrevious()) {
//                System.out.println(iter.previous() + " " + iter.next());
//            } else {
//                System.out.println(iter.next());
//            }
//        }
        List<Human> humans = new ArrayList<Human>();
        humans.add(new Human("Bob", "Male"));
        humans.add(new Human("Jo", "Male"));
        humans.add(new Human("Mia", "Male"));
        humans.add(new Human("Alice", "Female"));
        new Test().humansCount(humans);
        System.out.println(Human.countFemale);
        System.out.println(Human.countMale);
    }

    private void humansCount(List<Human> humans){
        for (Human person:humans
             ) {
            if (person.gender.equals("Female")){
                Human.countFemale++;
            } else {
                Human.countMale++;
            }
        }
    }

}

class Human {
    String name, gender;
    static int countFemale, countMale;

    public Human(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
}
