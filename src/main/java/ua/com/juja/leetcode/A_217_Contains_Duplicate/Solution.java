package ua.com.juja.leetcode.A_217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by serzh on 3/12/16.
 */
public class Solution {

    public static void main(String[] args) {


        System.out.println();
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (!set.add(i)) return true;
        }
        return false;
    }

    /*public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(new Integer(i));
        }
        return nums.length != set.size();
    }*/
}
