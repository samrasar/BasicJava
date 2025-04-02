package Sorting;


import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2}; // Example array

        bubbleSort(arr); // Call the sorting function

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
        /*
        5  3  8  1  2  → Compare (5,3) → Swap →  [3,5,8,1,2]
        3  5  8  1  2  → Compare (5,8) → No Swap
        3  5  8  1  2  → Compare (8,1) → Swap →  [3,5,1,8,2]
        3  5  1  8  2  → Compare (8,2) → Swap →  [3,5,1,2,8] ✅ (Largest element placed at last)

        3  5  1  2  8  → Compare (3,5) → No Swap
        3  5  1  2  8  → Compare (5,1) → Swap →  [3,1,5,2,8]
        3  1  5  2  8  → Compare (5,2) → Swap →  [3,1,2,5,8] ✅ (Second largest placed at second-last)

        3  1  2  5  8  → Compare (3,1) → Swap →  [1,3,2,5,8]
        1  3  2  5  8  → Compare (3,2) → Swap →  [1,2,3,5,8] ✅ (Third largest placed)

        1  2  3  5  8  → Compare (1,2) → No Swap ✅ (Array is fully sorted)
        */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) { //j < n - 1 - i ensures that already sorted elements
                // at the end are not compared again.
                if (arr[j] > arr[j + 1]) { // Swap if the element is greater
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // If no swaps, the array is already sorted
        }
    }
}
