package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class LargestElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 6, 2, 6, 3, 7, 3};

        int value = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > value) {
                value = arr[i];
            }
        }

        System.out.println(value);
    }
}
