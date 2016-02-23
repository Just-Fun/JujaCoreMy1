package ua.com.juja.leetcode.A_104_Maximum_Depth_of_Binary_Tree;

/**
 * Created by serzh on 23.02.16.
 */
/*
Given a binary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class SolutionBestRecursiv {

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int stepLeft = maxDepth(root.left);
        int stepRight = maxDepth(root.right);
        return 1 + Math.max(stepLeft, stepRight);
    }
}
