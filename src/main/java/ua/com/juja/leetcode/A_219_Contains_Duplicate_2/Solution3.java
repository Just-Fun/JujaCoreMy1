package ua.com.juja.leetcode.A_219_Contains_Duplicate_2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by serzh on 3/12/16.
 */
public class Solution3 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int remove = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[remove++]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}