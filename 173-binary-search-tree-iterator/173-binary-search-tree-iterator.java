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
class BSTIterator {
    
    List<Integer> list;
    int idx;

    public BSTIterator(TreeNode root) {
        list = new ArrayList();
        idx = 0;
        inorder(root);
    }
    
    public int next() {
        return list.get(idx++);
    }
    
    public boolean hasNext() {
        // System.out.println(list.get(idx) != null);
        if(idx > list.size()-1) return false;
        return (list.get(idx) != null);
    }
    
    private void inorder(TreeNode root){
        if(root == null) return;
        
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */