/**
 * <pre> 
 * 解題思路 
 * 若是p q大於root遞迴將root.left傳下去 反之傳root.right
 * 若都不是回傳樹根
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
}
