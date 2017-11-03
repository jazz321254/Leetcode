/**
 * 解題觀念：利用遞歸傳兩個次相同的樹 
 * 左右比對是否相等
*/

class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        return root1.val == root2.val && 
            isMirror(root1.left, root2.right) &&
            isMirror(root1.right, root2.left);
    }
    
}