package arrays;

public class MaxandMin {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};

        int minTemp = arr[0];
        int maxTemp = arr[0];
        for (int a : arr) {
            if (minTemp > a) {
                minTemp = a;
            }
        }
        System.out.println("min: " + minTemp);
        for (int a : arr) {
            if (maxTemp < a) {
                maxTemp = a;
            }
        }

        System.out.println("max: " + maxTemp);


    }
}
