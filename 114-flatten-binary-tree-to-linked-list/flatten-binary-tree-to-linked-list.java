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
    Queue<TreeNode> queue = new LinkedList<>();
    public void addToQueue(TreeNode root){
        if(root == null){
            return;
        }
        queue.add(root);         
        addToQueue(root.left);
        addToQueue(root.right);
    }
    public void flatten(TreeNode root) {
        addToQueue(root);
        while(!queue.isEmpty()){   
            TreeNode temp = queue.poll();
            temp.right = queue.peek();
            temp.left = null;
        }
    }
}
