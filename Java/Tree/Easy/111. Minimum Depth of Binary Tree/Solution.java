/**
 * 解題思路：
 * 與最大深度不同的在於 
 * 需考慮到path的情形 所以須多加兩個判斷
 */

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return 1 + minDepth(root.right);
        if(root.right == null) return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), 
                   minDepth(root.right));    
    }
}