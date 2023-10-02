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
    public boolean isSymmetric(TreeNode root) {
        return root == null || mirror(root.left, root.right);
    }
    
    public boolean mirror(TreeNode l, TreeNode r) {
        if (l == null || r == null) {
            return r == l;
        }
        if (r.val != l.val) {
            return false;
        }
        return mirror(r.right, l.left) && mirror(r.left, l.right);
    }
}