package org.example.selection;
import java.util.*;
//user is given an array of integers and is asked to sort the array in ascending order suching selection sort
public class Sorting {
    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the first unsorted element is the smallest
            int minIndex = i;

            // Find the smallest element in the unsorted portion of the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update minIndex if a smaller element is found
                }
            }

            // Swap the found smallest element with the first unsorted element
            // otherwise swapping doesnot make sense
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,4,1,9,12};
        Sorting.selectionSort(nums);
    }
}