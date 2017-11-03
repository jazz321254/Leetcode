/**
 * 解題要點：
 * 遞歸往下計算深度，每次加一，null時回傳0
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), 
                   maxDepth(root.right));    
    }
}