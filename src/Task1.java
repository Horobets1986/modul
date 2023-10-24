
/* знайти кількість різних елементів масиву. Наприклад 1 4 5 1 1 3 відповідь 4
 *створити метод який приймає масив і повертає кількість різних елементів
 */

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        fill(arr);
        sort(arr);
    }
    public static void fill(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = ThreadLocalRandom.current().nextInt(1, 10);

    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int uniqueNumber = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i])
                uniqueNumber--;
        }
        System.out.println();
        System.out.println(uniqueNumber);
    }
}
