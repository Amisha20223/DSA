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
    public int widthOfBinaryTree(TreeNode root) {
        List<Integer> l = new ArrayList<>();
      
        return dfs( root,0,1,l);
    }

        private  int dfs(TreeNode root ,int level, int id ,List<Integer> l)   {
            if(root==null)
            return 0;
            if(level ==l.size())
            l.add(id);
            int curr = id-l.get(level) +1;
            int left = dfs(root.left,level+1,2*id,l);
            int right = dfs(root.right,level+1,2*id+1,l);

            return Math.max(curr,Math.max(left,right));

        }  
    }
