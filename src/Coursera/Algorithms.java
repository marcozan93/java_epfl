package Coursera;

import java.util.Arrays;

public class Algorithms {

    public static void insertionSortDescending(int[] array) {
        for (var i = 1; i < array.length; i++) {
            var pivot = array[i];
            var j = i - 1;
            while (j >= 0 && array[j] < pivot) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = pivot;
        }
    }


    public static void insertionSortAscending(int[] array) {
        for (var i = 1; i < array.length; i++) {
            var pivot = array[i];
            var j = i - 1;
            while (j >= 0 && array[j] > pivot) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = pivot;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {3, 7, 1, 9, 2};
        int[] array = {3, 7, 1, 9, 2};

        insertionSortDescending(myArray);
        insertionSortAscending(array);

        System.out.println("Insertion sort descending: " + Arrays.toString(myArray));
        System.out.println("Insertion sort ascending: " + Arrays.toString(array));
    }
}
