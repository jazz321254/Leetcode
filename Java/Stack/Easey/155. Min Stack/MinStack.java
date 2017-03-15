/**
 * <pre> 
 * 解題思路 這是參考leetCode的解答 使steak變長
 * 放入push時 若x為最小將次小先放在前面
 * 在pop時 若pop的值為最小就pop了次 並取到下個次小得值
 * </pre>
 *
 * @author Shawn
 */

class MinStack {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        if(x <= min){          
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
