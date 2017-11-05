package sorting;

/**
 * this sort picks the smallest number then move it to the right place
 */
public class SelectionSort {

    void sort(int[] arr) {

        if (arr == null || arr.length < 2) {
            System.out.println("Given array is either Empty or have only one element!!!");
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            int index = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[index] > arr[j]) {
                    index = j;
                }
            }

            if (index != i) {
                arr[i] = arr[i] + arr[index];
                arr[index] = arr[i] - arr[index];
                arr[i] = arr[i] - arr[index];
            }
        }

    }

    public static void main(String... args) {

        SelectionSort selectionSort = new SelectionSort();
        int[] array = {1, 45, 43, 65, 232, 5, 2, 6, 21};
        selectionSort.sort(array);

        for (int i : array) {
            System.out.print("  " + i);
        }

        System.out.println();

    }
}
