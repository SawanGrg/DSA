package org.example.binarySearch;

public class BinarySearchTarget {

    private static int search(
            int[] array,
            int target
    ){
        int step = 0;

        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(array[mid] < target){
                left = mid + 1;
                step++;
            }else if (array[mid] > target ){
                right = mid - 1;
                step++;
            }else{
                return step;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12,33,52,67,72,81,88,98};
        System.out.println("steps to search the target :"+search(arr, 88));
    }
}
