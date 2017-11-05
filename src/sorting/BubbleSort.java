package sorting;

/**
 * perform check on the  adjacent values
 */
public class BubbleSort {

    /**
     * method to sort the given array.
     *
     * @param arr
     * @return
     */
    void sort(int[] arr) {

        if (arr == null || arr.length < 2) {
            System.out.println("Given array is either Empty or have only one element!!!");
            return;
        }

        int length = arr.length;
        boolean isSwapped; // use if for optimization
        for (int i = 0; i < length; i++) {
            isSwapped = false;

            for (int j = 0; j < length - i - 1; j++) { // condition :- in every pass, last element is already sorted
                if (arr[j] > arr[j + 1]) {
                    // swap the numbers
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];

                    isSwapped = true;
                }
            }
            if (isSwapped == false) {
                break;
            }
        }

    }

    void recursiveSort(int[] arr, int pass) {

        if (pass == 1) {
            return;
        }

        for (int j = 0; j < pass - 1; j++) {

            if (arr[j] > arr[j + 1]) {
                // swap the numbers
                arr[j] = arr[j] + arr[j + 1];
                arr[j + 1] = arr[j] - arr[j + 1];
                arr[j] = arr[j] - arr[j + 1];

            }
        }

        recursiveSort(arr, pass - 1);
    }

    public static void main(String... args) {

        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {1, 45, 43, 65, 232, 5, 2, 6, 21, 32};
        bubbleSort.sort(array);

        for (int i : array) {
            System.out.print("  " + i);
        }

        System.out.println();
        System.out.println(" lets pass an sorted array ");

        int[] arra = {1, 2, 3, 4, 5, 6, 7, 9};
        bubbleSort.sort(arra);

        for (int i : arra) {
            System.out.print("  " + i);
        }

        System.out.println();
        System.out.println(" lets pass an array to recursive function");

        int[] rec = {1, 45, 43, 65, 232, 5, 2, 6, 21, 32, 216};
        bubbleSort.recursiveSort(rec, rec.length);

        for (int i : rec) {
            System.out.print("  " + i);
        }

    }

}
