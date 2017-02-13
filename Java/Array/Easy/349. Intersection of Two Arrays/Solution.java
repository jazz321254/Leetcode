/**
 * <pre>
 * 可以使用二個Set求解
 * 第一個Set將nums1重複的值去除
 * 第二個Set放入在nums2中且存在nums1裡得值
 * 時間複雜度 => O(n)
 * </pre>
 *
 * @author Shawn
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        for(Integer num1 : nums1){
            set.add(num1);
        }
        for(Integer num2 : nums2){
            if(set.contains(num2))
                intersect.add(num2);
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
    
    public binarySearch(){
        
    }
}
