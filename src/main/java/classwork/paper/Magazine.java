package classwork.paper;

import classwork.util.Data;

public class Magazine implements Printer {
    String label;
    Data data;

    public Magazine(String label, Data data) {
        this.label = label;
        this.data = data;
    }

    public void print() {
        System.out.println(label);
        System.out.println(data);
    }
}
