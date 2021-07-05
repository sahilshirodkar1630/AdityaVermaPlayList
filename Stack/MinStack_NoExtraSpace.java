package Stack;
import java.util.Stack;

public class MinStack_NoExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	class MinStack {

	    /** initialize your data structure here. */
	    Stack<Integer> stack ;
	    int minElement;
	    
	    public MinStack() {
	    stack = new Stack<Integer>();
	    }
	    
	    public void push(int val) {
	        if(stack.isEmpty()) {
	        	
	        	stack.push(val);
	        	minElement = val;
	        	
	        }else {
	        	if(val >= minElement) {
	        		stack.push(val);
	        	}else if (val< minElement) {
	        		
	        		int temp = 2*val - minElement;
	        		stack.push(temp);
	        		minElement = val;
	        		
	        	}
	        }
	        
	        
	    }
	    
	    public void pop() {
	    	if(stack.isEmpty()) {
		    	  return ;
		      }
	    	if(stack.peek()>=minElement) {
	    		 stack.pop();
	    	}else {
	    		
	    		minElement = 2 * minElement -stack.peek();
	    		stack.pop();
	    	}
	    	
	    }
	    
	    public int top() {
	      if(stack.isEmpty()) {
	    	  return -1;
	      }
	      
	      if(stack.peek()<minElement) {
	    	  return minElement;
	      }
	      
	      return stack.peek();
	    }
	    
	    public int getMin() {
	        if(stack.isEmpty()) {
	        	return -1;
	        }
	        return minElement;
	    }
	}

}
