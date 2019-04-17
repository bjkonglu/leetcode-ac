package com.github.nadal.algo.leetcode.easy.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: lukong
 * Date: 2018/12/20
 * Description:
 */
public class BinaryTreeLOT {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    /**
     * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
     * (ie, from left to right, level by level from leaf to root).
     *
     * For example:
     * Given binary tree [3,9,20,null,null,15,7],
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * return its bottom-up level order traversal as:
     * [
     * [15,7],
     * [9,20],
     * [3]
     * ]
     * */

    //BFS实现
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> retList = new LinkedList<>();
        if (root == null) return retList;
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < levelNum; i++) {
                TreeNode curNode = queue.poll();
                if (curNode.left != null) queue.offer(curNode.left);
                if (curNode.right != null) queue.offer(curNode.right);
                subList.add(curNode.val);
            }
            retList.add(0, subList);
        }
        return retList;
    }

    //DFS实现
}
