package practice;

import java.util.Arrays;

public class SumOfElementInAnArray {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 6, 2, 6, 3, 7, 3};

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);


        int sum1 = Arrays.stream(arr).sum();
        System.out.println(sum1);
    }
}
