/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
int Solution::maxDepth(TreeNode* a) {
    if(a==NULL)
    return 0;
    
    return max(maxDepth(a->left),maxDepth(a->right))+1;
}
