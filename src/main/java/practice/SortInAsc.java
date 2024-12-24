package practice;

import java.util.Arrays;

public class SortInAsc {
    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 2, 7, 3, 4};

        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
