package com.company.array;

import java.util.Arrays;

public class ArrayList<Item> {
    private static final int DEFAULT_CAPACITY = 10;
    private Item[] elementData;
    private int size;

    @SuppressWarnings("unchecked")
    public ArrayList(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
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


    public static int[] sort(int[] array) {
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
        return array;
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
