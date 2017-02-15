/**
 * <pre>
 * 在每一列前面多加一個0 累加出列來
 * 時間複雜度 => O(n^2)
 * </pre>
 *
 * @author Shawn
 */

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rs = new ArrayList<>();
        if(numRows == 0 ) return rs;
        List<Integer> lists = new ArrayList<>();
        int pre = 0;
        lists.add(1);
        rs.add(lists);
        
        for(int i = 1; i < numRows; i++){
            // 處理第二列
            List<Integer> next = new ArrayList<>();
            for(Integer list : lists){
                next.add(pre+list);
                pre = list;
            }
            // 加上最後一個
            next.add(pre);
            // 還原初始化
            pre = 0;
            lists = next;
            // 放入結果
            rs.add(next);
        }
        return rs;
    }
}
