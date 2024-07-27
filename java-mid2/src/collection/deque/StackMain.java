package collection.deque;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		// push : 스택에 값 넣기
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);

		// peek : 꺼내지 않고 단순 조회만
		System.out.println("stack.peek() = " + stack.peek());

		// pop : 스택에서 값 뽑기
		System.out.println("stack.pop() = " + stack.pop());
		System.out.println("stack.pop() = " + stack.pop());
		System.out.println("stack.pop() = " + stack.pop());
		System.out.println(stack);
	}

}
