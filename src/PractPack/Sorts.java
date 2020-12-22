package PractPack;

/**
 * <h2>PractPack.Sorts class contains all the major necessary sorting algorithms to understand for the students</h2>
 */
public class Sorts {

    /**
     * <p>The bubbleSort(int array[]) method to sort the non-empty array of integers using bubble sort algorithm</p>
     *
     * @param array a non-empty array of integers
     * @return the sorted array using the bubble sort algorithm
     */
    public static int[] bubbleSort(int array[]) {

        //assuming that every passed argument is integer type array and length greater than 0
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    //swap all the two adjacent index position values just like bubble is growing and blowing
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }   //end if
            }   //end j-for
        } //end i-for
        return array;
    }


    /**
     * <p>The selectionSort(int array[]) method to sort the non-empty array of integers using selection sort algorithm</p>
     *
     * @param array a non-empty array of integers
     * @return the sorted array using the selection sort algorithm
     */
    public static int[] selectionSort(int array[]) {
        //move the boundary number one by one to the next
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            //find the minimum index number from the unsorted array
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            //swap the number on minimum index with the first element of unsorted array
            int minNumber = array[min_index];
            array[min_index] = array[i];
            array[i] = minNumber;
        }
        return array;
    }


    /**
     * <p>The insertionSort(int array[]) method to sort the non-empty array of integers using selection sort algorithm</p>
     *
     * @param array a non-empty array of integers
     * @return the sorted array using the insertion sort algorithm
     */
    public static int[] insertionSort(int array[]) {

        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    //quick sort

    //insertion sort

    //merge sort

    //heap sort

    //comb sort

    //shell sort

    //cocktail shaker sort

    //gnome sort

    //optimized gnome sort

    //odd even sort

    //double selection sort

    //binary insertion sort


}   //end of sorts class

//https://www.youtube.com/watch?v=xoR-1KwQh2k