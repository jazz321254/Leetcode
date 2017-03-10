/**
 * <pre> 
 * leetCode頗厲害的解法 非常簡潔 但效率不是太好 
 * </pre>
 *
 * @author Shawn
 */

public class Solution1 {
    public int strStr(String haystack, String needle) {
      for (int i = 0; ; i++) {
        for (int j = 0; ; j++) {
          if (j == needle.length()) return i;
          if (i + j == haystack.length()) return -1;
          if (needle.charAt(j) != haystack.charAt(i + j)) break;
        }
      }
    }
}
