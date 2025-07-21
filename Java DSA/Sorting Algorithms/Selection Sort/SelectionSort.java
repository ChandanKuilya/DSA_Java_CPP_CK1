public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted portion
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minimum index
                }
            }

            // Swap the minimum element with the first element of the unsorted portion
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        //int[] arr = {64, 34, 25, 12, 22};
        int[] arr ={-79,23,45,-109,11,98,2,1,-10};
        System.out.println("Original array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Utility method to print array
    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}