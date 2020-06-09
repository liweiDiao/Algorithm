package com.dlw.demo.leetcode.tree;

/**
 * @Description    面试题68 - I. 二叉搜索树的最近公共祖先
 *
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
 *
 * @Author diaoliwei
 * @Date 2020/6/6 21:17
 */
public class LowestCommonAncestor {

    /**
     * 循环搜索： 当节点 rootroot 为空时跳出；
     * 当 p, qp,q 都在 rootroot 的 右子树 中，则遍历至 root.rightroot.right ；
     * 否则，当 p, qp,q 都在 rootroot 的 左子树 中，则遍历至 root.leftroot.left ；
     * 否则，说明找到了 最近公共祖先 ，跳出。
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else if(root.val > p.val && root.val > q.val) {
                root = root.left;
            } else {
                break;
            }
        }
        return root;
    }

}
