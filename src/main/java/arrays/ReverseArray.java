package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5};

        int temp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        System.out.println(Arrays.toString(arr));

    }
}
