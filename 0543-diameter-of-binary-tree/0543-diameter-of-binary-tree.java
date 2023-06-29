/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
    if (root.left == null && root.right == null) {
        return 0;
    }
    height(root);
    return diameter;
}

private int height(TreeNode root) {
    if (root == null) {
        return 0;
    }
    int lHeight = height(root.left);
    int rHeight = height(root.right);

    diameter = Math.max(diameter, lHeight + rHeight);

    return 1 + Math.max(lHeight, rHeight);
    }
}