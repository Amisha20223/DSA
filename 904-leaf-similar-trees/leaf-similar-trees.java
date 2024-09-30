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
import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
       
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
 
        getLeafNodes(root1, leaves1);
        getLeafNodes(root2, leaves2);
        return leaves1.equals(leaves2);
    }
    private void getLeafNodes(TreeNode node, List<Integer> leafList) {
        if (node == null) {
            return; 
        }
        if (node.left == null && node.right == null) {
            leafList.add(node.val); 
        }   getLeafNodes(node.left, leafList);
        getLeafNodes(node.right, leafList);
    }
}
