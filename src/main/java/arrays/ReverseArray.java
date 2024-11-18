package arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5};

        int temp[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - i - 1];
        }

        System.arraycopy(temp, 0, arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));

    }
}
