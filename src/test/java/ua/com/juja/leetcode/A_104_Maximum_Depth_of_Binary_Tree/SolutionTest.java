package ua.com.juja.leetcode.A_104_Maximum_Depth_of_Binary_Tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by serzh on 23.02.16.
 */
public class SolutionTest {

    @Test //
    public void testMaxDepth2() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);


        node2.left = node1;
        node2.right = node3;


        int ans = Solution.maxDepth(node2);
        assertEquals(2, ans);
    }

    @Test //
    public void testMaxDepth() throws Exception {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node4.left = node3;
        node3.left = node2;
        node2.left = node1;
        node4.right = node5;

        int ans = SolutionBestRecursiv.maxDepth(node4);
        assertEquals(4, ans);
    }

    @Test // [-8,-6,7,6,null,null,null,null,5]
    public void testMaxDepth1() throws Exception {
        TreeNode node1 = new TreeNode(-8);
        TreeNode node2 = new TreeNode(-6);
        TreeNode node3 = new TreeNode(7);
        TreeNode node4 = new TreeNode(6);
        TreeNode node5 = null;
        TreeNode node9 = new TreeNode(5);

        node2.left = node1;
        node2.right = node3;
        node3.right = node4;
        node4.right = node9;
//        node5.right = node9;

        int ans = Solution.maxDepth(node2);
        assertEquals(4, ans);
    }
}