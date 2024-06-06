class Solution {
    public List<Integer> Traversal(TreeNode root,List<Integer> arr){
        if(root!=null){
            int data=root.val;
            Traversal(root.left,arr);
            Traversal(root.right,arr);
            arr.add(data);
        }
        return arr;
    } 
    
    public List<Integer> postorderTraversal(TreeNode root) {
    ArrayList<Integer>arr=new ArrayList<>();
    return Traversal(root,arr);
    }
}