package ua.com.juja.leetcode.A_283_Move_Zeroes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by serzh on 3/14/16.
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> array = new ArrayList<>();
        List<Integer> arrayNol = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                arrayNol.add(nums[i]);
            } else {
                array.add(nums[i]);
            }
        }
        array.addAll(arrayNol);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = array.get(i);
        }

    }
}
