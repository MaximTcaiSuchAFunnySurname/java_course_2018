package com.company.array;

import java.util.Arrays;
// извиняюсь за то, что не успел сделать shrink, pop и другое. Постараюсь утром сделать
public class ArrayList<Item> {
    private static final int DEFAULT_CAPACITY = 10;
    private Item[] elementData;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayList() {
        elementData = (Item[]) new Object[DEFAULT_CAPACITY];
    }

    public void push(Item item) {
        grow();
        elementData[size++] = item;

    }

    public Item get(int index) {
        return elementData[index];
    }

    public Item pop() {
        Item[] copyOfElementData = Arrays.copyOf(elementData, elementData.length - 1);
        return elementData[elementData.length - 1];
    }


    public static void sort(int[] elementData) {
        for (int n = 0; n < 5; n++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    if (array[i] == 0) {
                        int buf = array[i];
                        array[i] = array[array.length - 1];
                        array[array.length - 1] = buf;
                    }
                }
            }
        }
    }

//    public int popByIndex(int index) {
//
//    }

    public boolean isEmpty() {
        return size == 0;
    }


    public int size() {
        return size;
    }

    /**
     * TODO: implement it
     * Если массив заполнился,
     * то увеличить его размер в полтора раз
     */
    private void grow() {
        if (size == elementData.length) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + oldCapacity;
            changeCapacity(newCapacity);
        }
    }

    /**
     * TODO: implement it
     * Если количество элементов в четыре раза меньше,
     * то уменьшить его размер в два раза
     */
    private void shrink() {

    }

    public void print() {
        System.out.println(Arrays.toString(elementData));
    }

    private void changeCapacity(int newCapacity) {
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

}