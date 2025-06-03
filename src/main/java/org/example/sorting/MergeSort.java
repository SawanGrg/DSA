package org.example.sorting;

import java.util.Arrays;

public class MergeSort {

    private static int[] mainMerger(
            int[] left,
            int[] right
    ){
            int[] combinedArray = new int[left.length + right.length];
            int index = 0;
            int i = 0;
            int j = 0;
            while(i < left.length && j < right.length){
                if (left[i] < right[j]){
                    combinedArray[index] = left[i];
                    index++;
                    i++;
                }else{
                    combinedArray[index] = right[j];
                    index++;
                    j++;
                }
            }
            while(i < left.length){
                combinedArray[index] = left[i];
                index++;
                i++;
            }
            while(j < right.length){
                combinedArray[index] = right[j];
                index++;
                j++;
            }
            return combinedArray;
    }

    private static int[] mergeSort(
            int[] unSortedArray
    ){
        if (unSortedArray.length <= 1) {
            return unSortedArray;
        }

        int midIndex = unSortedArray.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(unSortedArray, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(unSortedArray, midIndex, unSortedArray.length));

        return mainMerger(left, right);
    }

    public static void main(String[] args) {
        int[] unSortedArray = {2,3,1,6,5,9,8};
        System.out.println(Arrays.toString(mergeSort(unSortedArray)));
    }
}
