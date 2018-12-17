package classwork.phoneBook;

import classwork.util.ArrayList;

public class PhoneBook {

    public static ArrayList<Phone> phoneBook = new ArrayList<Phone>();

    public void add(String name, int phoneNumber) {
        Phone phone = new Phone(name, phoneNumber);
        phone.hash = phoneNumber / name.length();
        phoneBook.push(phone);
    }

    public void getByHash(int code) {
        if (phoneBook.isEmpty()) {
            System.out.println("EMPTY");
            return;
        } else {
            for (int i = 0; i < phoneBook.size(); i++) {
                if (phoneBook.get(i).hash == code)
                    System.out.println(phoneBook.get(i).toString() +
                            "\n" + phoneBook.get(i).name + " " + phoneBook.get(i).phoneNumber);
            }
        }
    }

    public void getByName(String name) {
        if (phoneBook.isEmpty()) {
            System.out.println("EMPTY");
            return;
        } else {
            for (int i = 0; i < phoneBook.size(); i++) {
                if (phoneBook.get(i).name.equals(name))
                    System.out.println(phoneBook.get(i).toString() +
                            "\n" + phoneBook.get(i).name + " " + phoneBook.get(i).phoneNumber);
            }
        }
    }

    public void getByPhoneNumber(int number) {
        if (phoneBook.isEmpty()) {
            System.out.println("EMPTY");
            return;
        } else {
            for (int i = 0; i < phoneBook.size(); i++) {
                if (phoneBook.get(i).phoneNumber == number)
                    System.out.println(phoneBook.get(i).toString() +
                            "\n" + phoneBook.get(i).name + " " + phoneBook.get(i).phoneNumber);
            }
        }
    }

    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.getByHash(543);
        pb.add("Pat", 79214);
        pb.add("Bob", 432143);
        pb.add("Tom", 43121);
        pb.getByHash(43121 / "Tom".length());
        pb.getByName("Bob");
        pb.getByPhoneNumber(79214);
    }
}
