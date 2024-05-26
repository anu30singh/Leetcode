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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if(root == null) return results;
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int level_size = queue.size();
            for(int i=0; i<level_size;i++) {
                TreeNode currNode = queue.poll();
                if(i== level_size-1) {
                    results.add(currNode.val);
                }
                if(currNode.left!= null) queue.offer(currNode.left);
                if(currNode.right != null) queue.offer(currNode.right);
            }
        }

        return results;
    }
}