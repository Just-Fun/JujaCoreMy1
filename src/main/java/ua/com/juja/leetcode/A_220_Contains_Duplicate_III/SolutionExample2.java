package ua.com.juja.leetcode.A_220_Contains_Duplicate_III;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by serzh on 3/14/16.
 */
public class SolutionExample2 {
    private long getID(long i, long w) {
        return i < 0 ? (i + 1) / w - 1 : i / w;
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (t < 0) return false;
        int n = nums.length;
        Map<Long, Integer> d = new HashMap<>();
        long w = (long) t + 1;
        for (int i = 0; i < n; ++i) {
            if (i > k) d.remove(getID(nums[i - k - 1], w));
            long m = getID(nums[i], w);
            if (d.containsKey(m))
                return true;
            if (d.containsKey(m - 1) && Math.abs(nums[i] - d.get(m - 1)) < w)
                return true;
            if (d.containsKey(m + 1) && Math.abs(nums[i] - d.get(m + 1)) < w)
                return true;
            d.put(m, nums[i]);
        }
        return false;
    }
}