/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
    TreeNode* fir;
    TreeNode* prev;
    TreeNode* adj;
    TreeNode* sec;
    public:  
      void recoverTree(TreeNode* root) {
        prev = new TreeNode(INT_MIN);
        inorder(root);
        
        if(fir != NULL && sec != NULL){
            int temp = sec->val;
            sec->val = fir->val;
            fir->val = temp;
        }
        else if(fir != NULL && sec == NULL){
            int temp = fir->val;
            fir->val = adj->val;
            adj->val = temp;
        }
    }
    
    private:
      void inorder(TreeNode* root){
        if(root == NULL) return ;
        
        inorder(root->left);
        if(fir == NULL && root->val < prev->val){
            fir = prev;
            adj = root;
        }
        else if( fir != NULL && root->val < prev->val){
            sec = root;
        }
        prev = root;
        
        inorder(root->right);
    }
};