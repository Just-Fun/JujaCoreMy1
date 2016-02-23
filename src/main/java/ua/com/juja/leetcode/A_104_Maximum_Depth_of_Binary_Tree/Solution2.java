package ua.com.juja.leetcode.A_104_Maximum_Depth_of_Binary_Tree;

/**
 * Created by serzh on 23.02.16.
 */
/*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class Solution2 {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        TreeNode l = null;
        TreeNode r = null;
        while (root.right  != null) {
            r = root.right;
        }
        while (root.left  != null) {
            l = root.left;
        }

        int countLeft = 1;
        int countRight = 1;
        while (l.right  != null) {
            countRight++;
            l = l.right;
        }
        while (r.left  != null) {
            countLeft++;
            r = r.left;
        }

        return countLeft > countRight ? countLeft : countRight;
    }
}
