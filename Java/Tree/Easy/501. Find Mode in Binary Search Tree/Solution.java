/**
 * 解題思路：
 * 若不用hashMap 只用遞歸解題須多加許多外部變數來存放資訊
 * 並利用中序訪問 計算出眾數
 */

public class Solution {
    int count = 1;
    int mx = 0;
    TreeNode pre = new TreeNode(-1);
    List<Integer> mode = new ArrayList<>();
    int[] ans;
    
    public int[] findMode(TreeNode root) {
        inorderFindMode(root);
        // 轉換成int[]
        int index = 0;
        ans = new int[mode.size()]; 
        for(Integer i : mode){    
            ans[index] = Integer.valueOf(i);
            index++;
        }
        return ans;
    }
    
    public void inorderFindMode(TreeNode root) {
        if(root == null) return;
        inorderFindMode(root.left);
        if(pre.val == root.val) 
            count++;
        else
            count = 1;
        if(count >= mx){
            if(count > mx) 
                mode.clear();
            mode.add(root.val);
            mx = count;
        }
        pre = root;
        inorderFindMode(root.right);
    }
}