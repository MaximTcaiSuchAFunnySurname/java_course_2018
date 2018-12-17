package classwork;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(search(4, new int[]{-2, -1, 0, 1, 2, 3, 4, 5, 6}));
    }

    public static int search(int key, int[] array) {
        //Находим середину массива
        //Смотрим на значение этого элемента
        //Если он меньше нужного
        //Сужаем левую границу до медианы + 1
        //Если он больше нужного •
        //Сужаем правую границу до медианы - 1
        //Если он равен
        //Выходим
    /*
     int left = 0
     int right = array.length()-1
     int mid
     while left<=right
        mid = (left+right)/2
        if(array[mid] == key)
        return mid
        if array[mid]>key
        right = mid - 1
        else
        left = mid+1

        return -1

    */

        int left = 0;
        int right = array.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] > key) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
