package homework;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 12, 7, 0};
        int arrayLength = array.length;
        boolean swapped;
        for (int i = 0; i < arrayLength - 1; i++) {
            swapped = false;
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        System.out.println("sorted array = " + Arrays.toString(array));
        // I know that it can be done by function, but I just solve tasks according to presented materials.
    }


}
