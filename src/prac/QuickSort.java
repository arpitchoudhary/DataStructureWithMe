package prac;

public class QuickSort {


    public static void main(String... args) {

        int[] arr = new int[]{45, 23, 29, 100, 3, 200};

        QuickSort quickSort = new QuickSort();

        quickSort.sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print("    " + i);
        }

    }


    int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int partionIndex = (start - 1); // index of smaller element
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                partionIndex++;

                int temp = arr[partionIndex];
                arr[partionIndex] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[partionIndex + 1];
        arr[partionIndex + 1] = arr[end];
        arr[end] = temp;

        return partionIndex + 1;
    }


    void sort(int arr[], int start, int end) {
        if (start < end) {
            int pi = partition(arr, start, end);

            sort(arr, start, pi - 1);
            sort(arr, pi + 1, end);
        }

    }


}
