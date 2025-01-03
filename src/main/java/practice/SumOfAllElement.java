package practice;

import java.util.stream.IntStream;

public class SumOfAllElement {
    public static void main(String[] args) {
        int[] arr = {25, 11, 1, 7, 75, 56};

        int sumTraditional = 0;
//Traditional way
        for (int i : arr) {
            sumTraditional += i;
        }

        System.out.println(sumTraditional);

        //IntStream
        int sumStream = IntStream.of(arr).sum();

        System.out.println(sumStream);


    }
}
