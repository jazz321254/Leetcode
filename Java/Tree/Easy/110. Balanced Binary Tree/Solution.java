/**
 * 解題要點：利用之前的最大深度
 * 判斷深度是否小於一並遞迴做下去
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) < 2 
            && isBalanced(root.left) 
            && isBalanced(root.right);
    }
    
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), 
                   maxDepth(root.right));    
    }
}