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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if(root== null) {
            return result;
        }
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int level_size = queue.size();
            double average =0;
            for(int i=0; i<level_size ; i++) {
                TreeNode currNode = queue.poll();
                average+=currNode.val;
                if(currNode.left!= null) {
                    queue.offer(currNode.left);
                }
                if(currNode.right!= null) {
                    queue.offer(currNode.right);
                }
            }
            average = average/level_size;
            result.add(average);
            
        }
        return result;
    }
}