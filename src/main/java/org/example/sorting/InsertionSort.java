package org.example.sorting;

import java.util.Arrays;

public class InsertionSort {

    private static int[] insertion(int[] number){

        System.out.println("Original array: " + Arrays.toString(number));
        System.out.println("number in array :"+ number.length);

        for(int i = 1; i < number.length; i++){
            int j = i - 1;
            while( j >= 0 && number[j + 1] < number[j]){
                int temp = number[j + 1];
                number[j + 1] = number[j];
                number[j] = temp;
                j--;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        int[] unsorted = {7,3,4,1,6,2};
        System.out.println("Sorted array: " + Arrays.toString(insertion(unsorted)));
    }

    //insertion algo assumes that the first element is sorted
    // so it starts from the second element eg for(int i = 1; i < number.length; i++)
    // it starts from the second element and compares it with the first

    // if the second element is smaller than the first, it swaps them
    // if the second element is larger than the first, it moves to the next element

    // this process continues until the end of the array
    // the array is sorted in ascending order

    // the time complexity of insertion sort is O(n^2) in the worst case
    // the space complexity is O(1) as it does not use any extra space

    // i and j are the array index
    //number[i] or number[j]  extracts or returns the value of the array
}
