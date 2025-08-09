package org.example.backTrack;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backTrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    private void backTrack(
            List<List<Integer>> mainArray,
            List<Integer> tempArray,
            int[] nums
    ) {
        if (tempArray.size() == nums.length) {
            mainArray.add(new ArrayList<>(tempArray));
            return;
        }

        for (int number : nums) {
            if (tempArray.contains(number)) {
                continue; // Skip already used number
            }

            tempArray.add(number);
            backTrack(mainArray, tempArray, nums);
            tempArray.remove(tempArray.size() - 1); // Backtrack
        }
    }
}
