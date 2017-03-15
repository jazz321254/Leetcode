/**
 * <pre> 
 * 解題思路 簡潔得作法
 * 每次輸入時將queue倒入temp 將輸入的值放到底部再倒回去即可
 * </pre>
 *
 * @author Shawn
 */

public class MyQueue2 {

    Stack<Integer> queue = new Stack<Integer>();

    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        while(!queue.empty()){
            temp.push(queue.pop());
        }
        queue.push(x);
        while(!temp.empty()){
            queue.push(temp.pop());
        }
    }

    public int pop() {
        return queue.pop();
    }

    public int peek() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.empty();
    }
}
