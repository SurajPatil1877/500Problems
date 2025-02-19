package arrays;

public class RotateArrayByOne {

    private static int[] swapAndReturn(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
//way1
//        for (int i = 0; i < arr.length - 1; i++) {
//            int[] arr1 = swapAndReturn(arr[0], arr[i + 1]);
//            arr[0] = arr1[0];
//            arr[i + 1] = arr1[1];
//        }

        //way2
        int lastElement = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;

        for (int i : arr) System.out.println(i);

    }
}
