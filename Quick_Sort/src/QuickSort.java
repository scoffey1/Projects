public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); // Partitioning index
            quickSort(arr, low, pi - 1); // Recursively sort elements before partition
            quickSort(arr, pi + 1, high); // Recursively sort elements after partition
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5}; // Example array
        quickSort(arr, 0, arr.length - 1); // Call the quick sort method
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " "); // Print the sorted array
        }
    }
}
/*Pivot Selection: A pivot element is chosen (commonly the last element).
 Partitioning: The array is rearranged so that elements less than the pivot are on the left and those greater are on the right.
 Recursion: The process is repeated for the left and right sub-arrays. 
 Time Complexity: O(n2)
*/
