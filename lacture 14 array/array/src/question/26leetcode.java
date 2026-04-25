package question;

import java.util.Arrays;

class Leetcode {
    public static int removeDuplicate(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Use two-pointer method
        int count = 0;  // unique indexl
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[count]) {
                count++;
                arr[count] = arr[i];  // place unique element
            }
        }

        return count + 1;  // unique element count
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 1, 3, 1, 4, 5, 4, 3};

        int k = removeDuplicate(arr);

        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
