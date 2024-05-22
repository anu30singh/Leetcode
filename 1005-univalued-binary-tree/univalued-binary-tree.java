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
    public boolean solve(TreeNode root ,int roVal) {
        if(root== null) return true;
        if(root.val != roVal) return false;
        return solve (root.left , roVal) && solve(root.right, roVal);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root== null) return true;
        return solve (root, root.val);
    }
}