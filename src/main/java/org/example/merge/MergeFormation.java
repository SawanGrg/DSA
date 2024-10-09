package org.example.merge;

import java.util.Arrays;

public class MergeFormation {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
//            middleIndex = 0 + 6 % 2 = 3.5 = 3 is the index for division
//            but will hold 4 data {2,3,4,1} {5,23,12}
            int middleIndex = (left + right) / 2;

            mergeSort(arr, left, middleIndex);
            mergeSort(arr, middleIndex + 1, right);

            merge(arr, left, middleIndex, right);
        }
    }

    public static void merge (int[] arr, int left, int midIndex, int right){

//      3 - 0 + 1 = midIndex = 4
//      3 + 1 = 4 means 2,3,4,1 will be in first array
        int firstSize = midIndex  - left + 1;

//      6 - 3 = 3 means 5, 23, 12 will be second array
        int secondSize = right - midIndex;

//       it creates array of size 4 and 3
        int[] firstArr = new int[firstSize];
        int[] secondArr = new int[secondSize];

//        copying data from original array
        for(int x = 0; x < firstSize; x++){
            firstArr[x] = arr[left + x];
        }

        for(int y = 0; y< secondSize; y++){
            secondArr[y] = arr[midIndex + 1 + y];
        }

        int i = 0;
        int j = 0;
        int k = left; //left is 0

        while(i < firstSize && j < secondSize){

            if(firstArr[i] < secondArr[j]){
                arr[k] = firstArr[i];
                i++;
            }else{
                arr[k] =secondArr[j];
                j++;
            }
            k++;
        }

        while( i < firstSize){
            arr[k] = firstArr[i];
            i++;
            k++;
        }

        while (j < secondSize) {
            arr[k] = secondArr[j];
            j++;
            k++;
        }

    }

    // Helper function to print the array
    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 5, 23, 12};

        printArray(arr);
//        i will pass array, 0, 6
        mergeSort(arr, 0, arr.length - 1);

        printArray(arr);
    }
}
