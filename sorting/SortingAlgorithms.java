public class SortingAlgorithms {

    // ---------------- QUICK SORT ----------------

    // Partition Function
    public static int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot
        i++;

        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

    // Quick Sort Function
    public static void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }












    
    // ---------------- MERGE SORT ----------------
    // Divide Function
    public static void divide(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        conquer(arr, si, mid, ei);
    }

    // Merge Function
    public static void conquer(int arr[], int si, int mid, int ei) {

        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {

            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy back
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // ---------------- PRINT ARRAY ----------------

    public static void printArray(int arr[]) {

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    // ---------------- MAIN FUNCTION ----------------

    public static void main(String args[]) {

        // Quick Sort Array
        int arr1[] = {8, 4, 7, 2, 1, 9, 3};

        // Merge Sort Array
        int arr2[] = {6, 3, 9, 5, 2, 8};

        // Quick Sort
        quickSort(arr1, 0, arr1.length - 1);

        System.out.println("Quick Sort Output:");
        printArray(arr1);

        // Merge Sort
        divide(arr2, 0, arr2.length - 1);

        System.out.println("Merge Sort Output:");
        printArray(arr2);
    }
}