package com.dlw.demo.leetcode.tree;

import java.util.LinkedList;
import java.util.List;

/**
 * @Description  107. 二叉树的层次遍历 II
 *
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author diaoliwei
 * @Date 2020/6/9 21:23
 */
public class LevelOrderBottom {

    private LinkedList<List<Integer>> list;

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new LinkedList<List<Integer>>();
        }
        list = new LinkedList<List<Integer>>();
        dfs(root, 1);
        return list;
    }

    private void dfs(TreeNode root, int level) {
        if (level > list.size()) {
            list.addFirst(new LinkedList<Integer>());
        }
        if (root.left != null) {
            dfs(root.left, level + 1);
        }
        if (root.right != null) {
            dfs(root.right, level + 1);
        }
        list.get(list.size() - level).add(root.val);
    }

    public static void main(String[] args) {
        LevelOrderBottom order = new LevelOrderBottom();
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.left.left = null;
        node.left.right = null;
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        List<List<Integer>> list2  = order.levelOrderBottom(node);
        System.out.println(list2);
    }

}
