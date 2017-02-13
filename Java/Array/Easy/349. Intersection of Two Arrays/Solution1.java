/**
 * <pre>
 * 使用二元搜尋求解
 * 時間複雜度會增加 => O(nlogn)
 * </pre>
 *
 * @author Shawn
 */

public class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> intersect = new HashSet<>();
        java.util.Arrays.sort(nums1);
        for(Integer num2 : nums2){
            if(binarySearch(nums1, num2)){
                intersect.add(num2);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (Integer num : intersect) {
            result[i++] = num;
        }
        return result;
    }
    
    public boolean binarySearch(int[] sorted, int target){
        int left = 0;
        int right = sorted.length - 1;
        while(left <= right){
            int mid = (left + right) /2;
            if(sorted[mid] > target){
                right = mid - 1;
            }else if(sorted[mid] < target){
                left = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
