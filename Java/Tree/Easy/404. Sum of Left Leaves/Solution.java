/**
 * 解題要點：
 * 盡然進來就有中文註解提示...那就不用太多說明摟
 * PS 遞歸時多傳一個判斷是否為左子樹的參數
 */

public class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        // 用DFS走訪 並累加所有的左邊葉子
        return DFSsumOfLeaves(root, 0, false);
    }
    
    public int DFSsumOfLeaves(TreeNode root, int sum, boolean isLeft) {
        if(root == null) return 0;
        if(isLeft == true && root.left == null && root.right == null) 
            return sum + root.val;
        return DFSsumOfLeaves(root.left, sum, true) + DFSsumOfLeaves(root.right, sum, false);
    }
}