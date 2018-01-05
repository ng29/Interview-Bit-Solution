int Solution::minDepth(TreeNode* a) {
    if(a==NULL)    
    return 0;
    if(a->left==NULL && a->right==NULL)
    return 1;
    if(!a->left)
    return minDepth(a->right) +1;
    if(!a->right)
    return minDepth(a->left) +1;
    
    return min(minDepth(a->left),minDepth(a->right))+1;
}
