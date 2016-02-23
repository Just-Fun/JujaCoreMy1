package ua.com.juja.leetcode.A_104_Maximum_Depth_of_Binary_Tree;

/**
 * Created by serzh on 23.02.16.
 */
public class Test {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node4.left = node3;
        node3.left = node2;
        node2.left = node1;
        node4.right = node5;

        int ans = Solution3.maxDepth(node4);
        System.out.println(ans);


    }
}
