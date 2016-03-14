package ua.com.juja.leetcode.A_220_Contains_Duplicate_III;

import java.util.TreeSet;

/**
 * Created by serzh on 3/14/16.
 */
public class SolutionExample1 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums.length <= 1 || t < 0 || k < 1) {
            return false;
        }
        TreeSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < nums.length; i++) {
            long min = Math.min((long) nums[i] - t, (long) nums[i] + t + 1);
            long max = Math.max((long) nums[i] - t, (long) nums[i] + t + 1);
    /*1.if the subset is not empty, means that we have the element that satisfy the requirement
      2.if we cannot add the element to the set, that means we already have the element*/
            if (!set.subSet(min, max).isEmpty() || !set.add((long) nums[i])) {
                return true;
            }
            set.add((long) nums[i]);
            if (i >= k) {
                set.remove((long) nums[i - k]);
            }
        }
        return false;
    }
}