import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] mergedArray = new int[n + m];
        int i = 0, j = 0, k = 0;

        // Merge elements
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        
        // Add remaining elements from arr1
        while (i < n) mergedArray[k++] = arr1[i++];
        // Add remaining elements from arr2
        while (j < m) mergedArray[k++] = arr2[j++];

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] result = mergeArrays(arr1, arr2);
        System.out.println("Merged Sorted Array: " + Arrays.toString(result));
    }
}