/**
 * <pre>
 * 使用三個指標 比大小後依序重後面放入
 * 時間複雜度 => O(m + n)
 * </pre>
 *
 * @author Shawn
 */
 
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 需要給三個指標一個為nums1的上限
        // 一個為nums2的上限
        // 一個為最終結果的上限
        int i = m - 1, j = n - 1, k = m + n - 1;
        // nums1 nums2最後兩個比較，較大的放入nums1最後面 直做到nums1 nums2其中的index為-1
        while(i > -1 && j > -1) nums1[k--] = (nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        // 若nums1的index為-1表示剩下的nums2都比較小只要依序放入nums1即可
        // 若nums2的index為-1表示剩下的nums1都比較小且已經在nums1所以不用處理
        while(j > -1) nums1[k--] = nums2[j--];
    }
}
