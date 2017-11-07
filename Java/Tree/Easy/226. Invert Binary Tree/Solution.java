/**
 * 解題思路：
 * 利用一個暫存的TreeNode做反轉 空間複雜度O(1)
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmpNode = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmpNode); 
        return root;
    }
}