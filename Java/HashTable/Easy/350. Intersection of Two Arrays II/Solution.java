/**
 * <pre> 
 * 使用hashMap即可解決問題
 * 時間複雜度 O(n)
 * </pre>
 * 
 * @author Shawn
 */

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // 將nums1的陣列放入hashMap
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(Integer num : nums1){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num)+1);
            }
        }
        List<Integer> rs = new ArrayList<Integer>();
        // 比對是否要在另一個陣列中
        for(Integer num : nums2){
            if(map.containsKey(num) && map.get(num) > 0){
                map.put(num, map.get(num)-1);
                rs.add(num);
            }
        }
        int[] array = new int[rs.size()];
        for (int i = 0; i < rs.size(); i++) {
            array[i] = rs.get(i); 
        }
        return array;
    }
}
