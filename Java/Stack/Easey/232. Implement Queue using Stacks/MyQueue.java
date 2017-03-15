/**
 * <pre> 
 * 解題思路 s1為輸入序 s2為輸出序
 * 要輸入時須將s2倒至s1 輸出時則反之
 * </pre>
 *
 * @author Shawn
 */

public class MyQueue {

    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();
    
    public MyQueue() {
    }
    
    public void push(int x) {
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        s1.push(x);
    }
    
    public int pop() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        return s2.pop();
    }
    
    public int peek() {
        if(!s1.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.peek();
        }else{
            return s2.peek();
        }
    }
    
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
