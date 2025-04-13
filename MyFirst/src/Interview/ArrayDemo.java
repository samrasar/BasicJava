package Interview;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //Output: [0, 0, 0, 0, 1, 1, 1, 1, 1]
        int[] arr = {0, 1, 1, 0, 1, 1, 1, 0, 0};
        int[] result = new int[arr.length];

        int start = 0;
        int end = arr.length - 1;

        for (int value : arr) {
            if (value == 0) {
                result[start] = 0;
                start++;
            } else {
                result[end] = 1;
                end--;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
