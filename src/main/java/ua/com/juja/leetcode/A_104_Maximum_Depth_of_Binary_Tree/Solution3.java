package ua.com.juja.leetcode.A_104_Maximum_Depth_of_Binary_Tree;

/**
 * Created by serzh on 23.02.16.
 */
/*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class Solution3 {

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        TreeNode temp;
        int countLeft = 1;
        int countRight = 1;
        temp = root;
        while (temp.left  != null) {
            countLeft++;
            temp = temp.left;
        }
        temp = root;
        while (temp.right  != null) {
            countRight++;
            temp = temp.right;
        }


        return countLeft + countRight - 1;
    }
}
