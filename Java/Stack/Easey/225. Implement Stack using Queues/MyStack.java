/**
 * <pre> 
 * 利用一個queue就可以解決 將每次放入的元素作反轉即可
 * </pre>
 *
 * @author Shawn
 */

public class MyStack {

    private Queue<Integer> q = new LinkedList<Integer>();

    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        // reverse queue
        for(int i = 1; i < q.size(); i++){
            q.add(q.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
