package practice;

public class SortAsc {
    public static void main(String[] args) {
        int[] arr = {25, 11, 1, 7, 75, 56};
        int[] temp = new int[arr.length];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] < min) {
                    min = arr[i];
                    temp[i] = min;
                }
            }
        }

        for (int i : temp) System.out.println(i);
    }
}
