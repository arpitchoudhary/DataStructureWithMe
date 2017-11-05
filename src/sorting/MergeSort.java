package sorting;

public class MergeSort {

    void sort(int[] arr, int start, int end) {

        if (start < end) {

            int middle = (start + end) / 2;
            sort(arr, start, middle);
            sort(arr, middle + 1, end);

            merge(arr, start, middle, end);
        }

    }

    private void merge(int[] arr, int start, int middle, int end) {

        int i, j, k;
        int sizeLeft = middle - start + 1;
        int sizeRight = end - middle;

        int[] left = new int[sizeLeft];
        int[] right = new int[sizeRight];

        for (i = 0; i < sizeLeft; i++)
            left[i] = arr[start + i];
        for (j = 0; j < sizeRight; j++)
            right[j] = arr[middle + 1 + j];

        i = 0;
        j = 0;
        k = start;

        while (i < left.length && j < right.length) {

            if (left[i] <= right[j]) {
                arr[k] = left[i];
                k++;
                i++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }

        }

        while (i < left.length) {
            arr[k] = left[i];
            k++;
            i++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            k++;
            j++;
        }

    }

    public static void main(String... args) {

        MergeSort mergeSort = new MergeSort();
        int[] array = {1, 45, 21, 32, 4};
        mergeSort.sort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print("  " + i);
        }
    }
}
