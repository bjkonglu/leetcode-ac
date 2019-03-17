package com.github.nadal.algo.easy.tree;

/**
 * Author: lukong
 * Date: 2019/1/17
 * Description:
 */
public class InvertBinaryTree {
    /**
     * Invert a binary tree.
     * Example:
     * Input:
     *      4
     *    /   \
     *   2     7
     *  / \   / \
     * 1   3 6   9
     *
     * Output:
     *      4
     *    /   \
     *   7     2
     *  / \   / \
     * 9   6 3   1
     *
     * 思路：
     *   旋转root节点，可以把问题拆分为，root的左子节点和右节点已经旋转好了，
     *   然后进行左右节点交换操作就行了， 最后再递归处理左右子节点
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        TreeNode tmpNode = root.left;
        root.left = root.right;
        root.right = tmpNode;

        root.left = invertTree(root.left);
        root.right = invertTree(root.right);

        return root;
    }
}
