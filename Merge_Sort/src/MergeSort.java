public class MergeSort {
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return; // Base case
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Split the array into two halves
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left); // Sort the left half
        mergeSort(right); // Sort the right half
        merge(arr, left, right); // Merge the sorted halves
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        // Merge the two halves
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        // Copy remaining elements
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10}; // Example array
        mergeSort(arr); // Call the merge sort method
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " "); // Print the sorted array
        }
    }
}
/*Divide: The array is recursively split into halves until each sub-array contains one element.
  Conquer: The sub-arrays are merged back together in sorted order.
  Merge Function: Combines two sorted arrays into one sorted array.

  Time Complexity: 𝑂(𝑛log𝑛)
*/