/**
 * <pre> 
 * 解題思路 tree跟graph的走訪都可以使用BFS DFS 
 * 這裏使用比較簡潔的做法用DFS用遞迴的方式 紀錄階層
 * 再根據階層總數計算出應該放置的位址 最後將值放入
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }
    public void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
            if(root == null) return;
            // 若高度大於list size則擴大list
            if(level >= list.size()) {
                list.add(0, new LinkedList<Integer>());
            }
            // 先跑左子樹 在跑右子樹
            levelMaker(list, root.left, level+1);
            levelMaker(list, root.right, level+1);
            // 當兩個數都跑完時放入值
            list.get(list.size()-level-1).add(root.val);
    }
}
