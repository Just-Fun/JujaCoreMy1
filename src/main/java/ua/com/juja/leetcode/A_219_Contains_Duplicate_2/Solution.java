package ua.com.juja.leetcode.A_219_Contains_Duplicate_2;

/**
 * Created by serzh on 3/12/16.
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (Math.abs(i - j) == k) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
 */

    /*
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.add(nums[i])==false) return true;
            if(hs.size()==k+1) hs.remove(nums[i-k]);
        }
        return false;
}
     */
}