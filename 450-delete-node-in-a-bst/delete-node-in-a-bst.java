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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            int substitute = findSubstitute(root.left);
            root.val = substitute;
            root.left = deleteNode(root.left, substitute);
            return root;
        }

        root.left = deleteNode(root.left, key);
        root.right = deleteNode(root.right, key);

        return root;
    }

    private int findSubstitute(TreeNode root) {
        int sub = root.val;

        while (root.right != null) {
            sub = root.right.val;
            root = root.right;
        }

        return sub;
    }
}