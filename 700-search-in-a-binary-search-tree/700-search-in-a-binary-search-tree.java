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
    public TreeNode searchBST(TreeNode root, int val) {
        // System.out.println(root.val);
        // if(root.right == null && root.left == null) return null;
        if(root == null) return null;
        
        if(root.val == val)
            return root;
        else if(root.val > val)
            return searchBST(root.left, val);
        else if(root.val < val)
            return searchBST(root.right, val);
            
        
        return null;
    }
}