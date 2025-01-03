package practice;

public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] arr = {25, 11, 1, 7, 75, 56};

        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println(min);

    }
}
