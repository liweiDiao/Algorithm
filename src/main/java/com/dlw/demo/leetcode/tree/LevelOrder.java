package com.dlw.demo.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 102. 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @Author diaoliwei
 * @Date 2020/6/9 20:59
 */
public class LevelOrder {

    // 存储二叉树中的数据
    private List<List<Integer>> list;

    /**
     *  时间复杂度：O(N)O(N)
     * 空间复杂度：O(h)O(h)，h 是树的高度
     *
     * 按照深度优先的处理顺序，会先访问节点 3，再访问节点 20，接着是节点 9。
     * 之后是第二列的 7 和 15
     *
     * 每次递归的时候都需要带一个 index(表示当前的层数)，也就对应那个田字格子中的第几行，如果当前行对应的 list 不存在，就加入一个空 list 进去。
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        list = new ArrayList<List<Integer>>();
        dfs(root, 1);
        return list;
    }

    private void dfs(TreeNode root, int level) {
        if (level > list.size()) {
            list.add(new ArrayList<Integer>());
        }

        list.get(level - 1).add(root.val);
        if (root.left != null) {
            dfs(root.left, level + 1);
        }
        if (root.right != null) {
            dfs(root.right, level + 1);
        }
    }

    public static void main(String[] args) {
        LevelOrder order = new LevelOrder();
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.left.left = null;
        node.left.right = null;
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        List<List<Integer>> list2  = order.levelOrder(node);
        System.out.println(list2);
    }
}
