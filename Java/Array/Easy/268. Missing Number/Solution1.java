/**
 * <pre>
 * 這是看了高手的解法
 * 觀念是使用XOR a^b^b=a 所以藉由一個有全部數的for迴圈將陣列裡的數都做一次XOR 
 * 最後會發現只剩下缺少的那值少做一次XOR 結果就是它了 時間複雜度 O(n) 空間複雜度 O(2) 
 * </pre>
 *
 * @author Shawn
 */
 
public int Solution1(int[] nums) {
    int xor = 0, i = 0;
	for (i = 0; i < nums.length; i++) {
		xor = xor ^ i ^ nums[i];
	}
	return xor ^ i;
}
