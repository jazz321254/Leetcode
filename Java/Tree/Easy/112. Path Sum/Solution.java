/**
 * 解題概念：將左右子樹減去root的sum用遞歸方式傳下去
 */

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return false;
        if(root.left==null && root.right==null)
            return root.val==sum;
        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
}