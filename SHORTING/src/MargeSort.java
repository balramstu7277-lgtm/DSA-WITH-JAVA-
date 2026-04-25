public class MargeSort {

    // Function to display array elements
    static void Display(int[] arr) {
        for (int val : arr) {
            System.out.print(val);
        }
    }

    // Merge function: merges two sorted subarrays
    // arr[l..mid] and arr[mid+1..r]
    static void merge(int[] arr, int l, int r, int mid) {

        // Size of left and right subarrays
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Temporary arrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy elements into left subarray
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }

        // Copy elements into right subarray
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Initial indexes for left, right and merged array
        int i = 0, j = 0;
        int k = l;

        // Compare elements of left and right arrays
        // and place smaller one into original array
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left array (if any)
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right array (if any)
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    // Recursive Merge Sort function
    static void meargesort(int[] arr, int l, int r) {

        // Base case: single element is already sorted
        if (l >= r) {
            return;
        }

        // Find middle index
        int mid = (l + r) / 2;

        // Sort left half
        meargesort(arr, l, mid);

        // Sort right half
        meargesort(arr, mid + 1, r);

        // Merge sorted halves
        merge(arr, l, r, mid);
    }

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 7, 8, 6};

        System.out.println("Array before sorting:");
        Display(arr);

        // Call merge sort
        meargesort(arr, 0, arr.length - 1);
        System.out.println(" ");
        System.out.println("Array after sorting:");
        Display(arr);
    }
}
