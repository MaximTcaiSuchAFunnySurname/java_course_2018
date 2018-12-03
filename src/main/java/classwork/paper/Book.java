package classwork.paper;

import classwork.util.Data;

public class Book implements Printer {
    String author;
    String name;
    int sheets;
    Data writeData;
    Data publishData;

    public Book(String author, String name, int sheets, Data writeData, Data publishData) {
        this.author = author;
        this.name = name;
        this.sheets = sheets;
        this.writeData = writeData;
        this.publishData = publishData;
    }

    public void print() {
        System.out.println(author);
        System.out.println(name);
        System.out.println(sheets);
        System.out.println(writeData);
        System.out.println(publishData);
    }
}
