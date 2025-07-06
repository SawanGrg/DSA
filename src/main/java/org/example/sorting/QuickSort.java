package org.example.sorting;

import java.util.Arrays;

public class QuickSort {

    private static int[] quickSort(
            int[] arr,
            int start,
            int end
    ){
        if(end - start + 1 <= 1) return arr;

        int pivot = arr[end];
        int leftPointer = start;

        for ( int i = start; i < end; i++){
            if(arr[i] < pivot){
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[i];
                arr[i] = temp;
                leftPointer++;
            }
        }

        arr[end] = arr[leftPointer];
        arr[leftPointer] = pivot;

        quickSort(arr, start, leftPointer - 1);
        quickSort(arr, leftPointer + 1, end);

        return arr;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {2,8,6,1,5,3};
        System.out.println(Arrays.toString(quickSort(unsortedArray,
                0,
                unsortedArray.length-1
                )));
    }
}
