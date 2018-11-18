package classwork.util;

import java.util.Arrays;

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


//    public  void sort() {
//        for (int n = 0; n < 5; n++) {
////            for (int i = 0; i < elementData.length - 1; i++) {
//                if (elementData[i] > elementData[i + 1]) {
//                    Item temp = elementData[i];
//                    elementData[i] = elementData[i + 1];
//                    elementData[i + 1] = temp;
////                    if (elementData[i] == (Item.) 0) {
//                        Item buf = elementData[i];
////                        elementData[i] = elementData[elementData.length - 1];
////                        elementData[elementData.length - 1] = buf;
////                    }
//                }
//            }
//        }
//    }

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