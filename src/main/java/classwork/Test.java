package classwork;

import java.util.Arrays;
import java.util.Random;

public class Test {

    public static void insertSort(int[] array) {
        int count = 0;
        int current;
        int i;
        int j;
        for (i = 0; i < array.length; i++) {
            current = array[i];
            for (j = i; j > 0 && array[j - 1] > current; j--, count++) {
                array[j] = array[j - 1];
            }
            array[j] = current;
        }
        System.out.println(count);
            /*
            Сортируем элементы
Поочерёдно просматриваем
Вставляем каждый элемент на своё место среди уже просмотренных
             */
    }

    public static void selectedSort(int[] array) {
        int count = 0;
        int minIndex;
        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
                count++;
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println(count);
            /*
            Находим в массиве от 1 до n минимальный элемент
Меняем его с первым элементом
Находим в массиве от 2 до n минимальный элемент
Меняем его со вторым элементом
…
Находим в массиве от n - 1 до n минимальный элемент
Меняем его с предпоследним элементом
             */
    }

    private static void bubbleSortVII(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
                count++;
            }
        }
        System.out.println(count);
    }

    private static void bubbleSortV1(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1])
                    swap(array, j, j + 1);
                count++;
            }
        }
        System.out.println("Count = " + count);
        /*
        Запускаем первый проход : i = 1
Идём по массиву от 1 до n - 1 : j
Меняем соседние, если порядок неверный
swap if a[j] > a[j + 1]
Запускаем второй проход
…
Запускаем n - 1 проход
ауууу
есть кто живой?
все меня бросили
         */
    }

    public static void swap(int[] array, int first, int second) {
        array[first] = array[first] + array[second];
        array[second] = array[first] - array[second];
        array[first] = array[first] - array[second];
    }

    private static void generate(int[] array) {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100);
        }
    }

    public static void printAray(int[] array) {
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        int[] array = new int[5];
        int[] arr = new int[5];
        int[] third = new int[5];
        generate(third);
        printAray(third);
        insertSort(third);
        printAray(third);
//        generate(arr);
//        printAray(arr);
//        generate(array);
//        printAray(array);
//        printAray(third);
//        bubbleSortV1(array);
//        bubbleSortVII(arr);
//        selectedSort(third);
//        printAray(array);
//        printAray(arr);
//        printAray(third);


    }


    static class Node {
        String text;
        int position;
        Node prev;
        Node next;
        ;


        {
            prev = null;
            next = null;
        }


        public Node(String text, int position) {
            this.text = text;
            this.position = position;
        }


        public Node(String text, int position, Node prev, Node next) {
            this.text = text;
            this.position = position;
            this.prev = prev;
            this.next = next;
        }

    }
}
