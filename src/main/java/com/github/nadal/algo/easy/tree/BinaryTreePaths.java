package com.github.nadal.algo.easy.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: lukong
 * Date: 2019/1/18
 * Description:
 */
public class BinaryTreePaths {
    /**
     *
     * Given a binary tree, return all root-to-leaf paths.
     *
     * Example:
     * Input:
     *    1
     *  /   \
     * 2     3
     *  \
     *  5
     * Output: ["1->2->5", "1->3"]
     * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
     *
     *
     * 思路：
     *  采用分而治之的方式处理，但是特殊点是带上上次递归的结果，例如上次遍历到的节点值，此外带上结果容器
     *  并在基线条件的时候进行结果的添加操作。自上而下，与之前的之下而上有点不同
     * */
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ret = new ArrayList<>();
        if(root != null)
            searchBT(root, "", ret);
        return ret;
    }
    public void searchBT(TreeNode root, String path, List<String> ret) {

        if(root.left == null && root.right == null) {
            ret.add(path + root.val);
        }
        if(root.left != null) {
            searchBT(root.left, path + root.val + "->", ret);
        }
        if(root.right != null) {
            searchBT(root.right, path + root.val + "->", ret);
        }
    }
}
