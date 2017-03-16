/**
 * <pre> 
 * 解題思路 每一次碰到左括弧時即在stack中存入相對應的右括弧
 * 當碰到右括弧 若pop出來不相等則不正確 反之則正確
 * 時間複雜度 O(n)
 * </pre>
 *
 * @author Shawn
 */
 
public class Solution {
    public boolean isValid(String s) {
	    Stack<Character> stack = new Stack<Character>();
	    for (char c : s.toCharArray()) {
		    if (c == '(')
			    stack.push(')');
	    	else if (c == '{')
		    	stack.push('}');
	    	else if (c == '[')
		    	stack.push(']');
	    	else if (stack.isEmpty() || stack.pop() != c)
		    	return false;
    	}
	    return stack.isEmpty();
    }
}
