public class ArrayMergeSort {

    public static int[] b; // Auxiliary array for merging

    public static void merge(int[] arr, int s, int mid, int l) {
        int i = s;
        int j = mid + 1;
        int k = s;

        // Merge the two subarrays into the auxiliary array
        while (i <= mid && j <= l) {
            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left subarray if any
        while (i <= mid) {
            b[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right subarray if any
        while (j <= l) {
            b[k] = arr[j];
            j++;
            k++;
        }

        // Copy the merged elements back to the original array
        for (k = s; k <= l; k++) {
            arr[k] = b[k];
        }
    }

    public static void mergeSort(int[] arr, int s, int l) {
        if (s < l) {
            int mid = (s + l) / 2;
            mergeSort(arr, s, mid);
            mergeSort(arr, mid + 1, l);
            merge(arr, s, mid, l);
        }
    }

    public static void main(String[] args) {
        int[] arr = {199, 23, 55, 3, 1};

        // Initialize the auxiliary array
        b = new int[arr.length];

        // Perform the merge sort
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
