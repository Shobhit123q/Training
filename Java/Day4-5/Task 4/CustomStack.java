package Learning;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;


public class CustomStack {
	
	private List<Integer> stack;

    public CustomStack() {
        stack = new ArrayList<>();
    }

   
    public void push(int item) {
        stack.add(item);
    }

   
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

   
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();

        
        stack.push(6);
        stack.push(7);
        stack.push(11);
        stack.push(4);
        stack.push(12);

        
        System.out.println("Popping elements from the stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
	
	
	

}

//output:Popped: 12
//Popped: 4
//Popped: 11
//Popped: 7
//Popped: 6

