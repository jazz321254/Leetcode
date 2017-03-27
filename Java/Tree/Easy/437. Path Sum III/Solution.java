/**
 * <pre> 
 * 解題思路 可以看成一個只有兩成的樹去求解 findPath
 * 再用遞迴的方式將左右指數傳遞下去求解
 * </pre>
 *
 * @author Shawn
 */


public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        return findPath(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    public int findPath(TreeNode root, int sum){
        int rs = 0;
        if(root == null) 
            return rs;
        if(sum == root.val) 
            rs++;
        rs += findPath(root.left, sum - root.val);
        rs += findPath(root.right, sum - root.val);
        return rs;
    }
}
