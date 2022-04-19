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
    TreeNode fir;
    TreeNode prev;
    TreeNode adj;
    TreeNode sec;
    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        
        if(fir != null && sec != null){
            int temp = sec.val;
            sec.val = fir.val;
            fir.val = temp;
        }
        else if(fir != null && sec == null){
            int temp = fir.val;
            fir.val = adj.val;
            adj.val = temp;
        }
    }
    
    private void inorder(TreeNode root){
        if(root == null) return ;
        
        inorder(root.left);
        if(fir == null && root.val < prev.val){
            fir = prev;
            adj = root;
        }
        else if( fir != null && root.val < prev.val){
            sec = root;
        }
        prev = root;
        
        inorder(root.right);
    }
}