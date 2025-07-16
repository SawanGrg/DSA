package org.example.binarySearch;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Compare middle with its next element
            if (nums[mid] < nums[mid + 1]) {
                // Peak is in the right half
                left = mid + 1;
            } else {
                // Peak is in the left half (including mid)
                right = mid;
            }
        }

        // left == right is the peak index
        return left;
        //or return right as both index are same
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 2, 1, 5, 3, 9};
        System.out.println("Found the peak element index at: " + findPeakElement(arr));
    }
}
