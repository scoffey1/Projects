public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        // Loop through each element in the array starting from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // The element to be inserted
            int j = i - 1;
            // Move elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift element to the right
                j--;
            }
            arr[j + 1] = key; // Place key in its correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11}; // Example array
        insertionSort(arr); // Call the insertion sort method
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " "); // Print the sorted array
        }
    }
}