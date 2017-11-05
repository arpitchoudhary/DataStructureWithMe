package sorting;

/**
 * divide the existing two array into sorted and unsorted parts and keep on increasing the sorted part.
 */
public class InsertionSort {


    void sort(int[] arr) {

        if (arr == null || arr.length < 2) {
            System.out.println("Given array is either Empty or have only one element!!!");
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;

            while (j != 0) {

                if (arr[j] < arr[j - 1]) {

                    arr[j] = arr[j] + arr[j - 1];
                    arr[j - 1] = arr[j] - arr[j - 1];
                    arr[j] = arr[j] - arr[j - 1];

                }

                j--;
            }
        }

    }


    public static void main(String... args) {

        InsertionSort insertionSort = new InsertionSort();
        int[] array = {1, 45, 43, 65, 232, 5, 2, 6, 21};
        insertionSort.sort(array);

        for (int i : array) {
            System.out.print("  " + i);
        }

        System.out.println();
    }

}
