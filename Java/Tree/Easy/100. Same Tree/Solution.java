/**
 * <pre> 
 * 解題思路 利用中序與前序能判斷唯一樹來求解
 * 再利用樹根為null以零來區分可規避左右歪斜樹圍相同值時的特例
 * </pre>
 *
 * @author Shawn
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return preOrder(p).equals(preOrder(q)) &&
               inOrder(p).equals(inOrder(q));
    }
    
    public String preOrder(TreeNode t){
        if(t == null) return "0";
        return Integer.toString(t.val) +
        preOrder(t.left) +
        preOrder(t.right);
    }
    
    public String inOrder(TreeNode t){
        if(t == null) return "0";
        return preOrder(t.left) +
        Integer.toString(t.val) +
        preOrder(t.right);
    }
}