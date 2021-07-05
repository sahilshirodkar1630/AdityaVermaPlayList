package Stack;
import java.util.*;
public class MinStack_ExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class MinStack {

	    /** initialize your data structure here. */
	    Stack<Integer> stack ;
	    Stack<Integer> ExtraStack;
	    
	    public MinStack() {
	    stack = new Stack<Integer>();
	    ExtraStack = new Stack<Integer>();
	    }
	    
	    public void push(int val) {
	        if(stack.isEmpty()){
	            stack.push(val);
	            ExtraStack.push(val);
	            
	        }else{
	            stack.push(val);
	            if(stack.peek() <= ExtraStack.peek()){
	                ExtraStack.push(val);
	            }
	        }
	    }
	    
	    public void pop() {
	        if(!stack.isEmpty()){
	        if(stack.peek().equals(ExtraStack.peek())){
	            ExtraStack.pop();
	        }
	        stack.pop();
	        }
	    }
	    
	    public int top() {
	        if(!stack.isEmpty()){
	            return stack.peek();
	        }
	        return 0;
	 
	    }
	    
	    public int getMin() {
	        if(!ExtraStack.isEmpty()){
	            return ExtraStack.peek();
	        }
	       return 0;
	    }
	}


}
