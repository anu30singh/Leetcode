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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
       List<List<Integer>> result = new ArrayList<>();
       if(root==null) return result;
       Queue <TreeNode> queue = new LinkedList<>();
       queue.offer(root);

       while(!queue.isEmpty()) {
        List<Integer> currentLevel = new ArrayList<>();
        int level_size = queue.size();
        for(int i=0; i<level_size; i++) {
            TreeNode currNode = queue.poll();
            currentLevel.add(currNode.val);
            if(currNode.left!= null) {
                queue.offer(currNode.left);
            }
            if(currNode.right!= null) {
                queue.offer(currNode.right);
            } 
        }
        result.add(0, currentLevel);
       }  
        return result;
    }
}