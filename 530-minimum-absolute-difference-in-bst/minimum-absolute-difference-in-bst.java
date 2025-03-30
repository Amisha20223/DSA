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
    public static List<Integer> helpher(TreeNode root){
        List<Integer>l=new ArrayList<>();
        if(root==null) return l;
        l.addAll(helpher(root.left));
        l.add(root.val);
        l.addAll(helpher(root.right)) ;
     
        return l;
    }
    public int getMinimumDifference(TreeNode root) {
      List<Integer>l=helpher(root);
      int min=Integer.MAX_VALUE;
      for(int i=0;i<l.size();i++){
        for(int j=i+1;j<l.size();j++){
            min=Math.min(min,Math.abs(l.get(i)-l.get(j)));
        }
      }
        return min;
    }
}