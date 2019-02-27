package me.yekki.algorithm.two_sum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {


        if (nums == null || nums.length < 2) return null;

        HashMap<Integer, Integer> numHash = new HashMap<Integer, Integer>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (numHash.containsKey(nums[i])) return new int[]{numHash.get(nums[i]), i};
            numHash.put((target - nums[i]), i);
        }

        return null;
    }

    public static void main(String... args) {
        int[] nums = {2, 7, 11, 15};
        int[] ret = (new Solution()).twoSum(nums, 9);

        assert ((new Solution()).twoSum(nums, 9).equals(new int[]{0, 1}));
    }
}