package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FrequencyOfEachElementInArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }


        for (int i : set) {
            int count = 0;
            for (int j : arr) {
                if (i == j) {
                    count++;
                }
            }
            System.out.println(i + " : " + count);
        }
    }
}
