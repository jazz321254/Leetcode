/**
 * <pre> 
 * 這是參考leetCode的解答
 * 產生兩倍char長度的int array
 * 前半放s1有的值 後半放s2有的值 在對映是否相等
 * </pre>
 *
 * @author Shawn
 */

public class Solution1 {
    public boolean isIsomorphic(String s1, String s2) {
        int[] m = new int[512];
        for (int i = 0; i < s1.length(); i++) {
            if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
            m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
        }
        return true;
    }
}
