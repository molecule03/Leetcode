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
    List<Integer> list = new ArrayList<>();
    int idx = 0; 
    
    public void recoverTree(TreeNode root){
        
        inorder(root);
        Collections.sort(list);
        correct(root);
        // System.out.println(list);
        // return root;
    }
    
    private void inorder(TreeNode root){
        if(root == null) return; 
      
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    
    private void correct(TreeNode root){
        if(root == null) return;
        
        correct(root.left);
        if(root.val != list.get(idx)){
            root.val = list.get(idx);
        }
        idx++;
        correct(root.right);
    }
}