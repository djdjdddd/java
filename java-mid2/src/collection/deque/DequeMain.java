package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeMain {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		//Deque<Integer> deque = new LinkedList<>();

		// offer
		deque.offerFirst(1);
		System.out.println(deque);
		deque.offerFirst(2);
		System.out.println(deque);
		deque.offerLast(3);
		System.out.println(deque);
		deque.offerLast(4);
		System.out.println(deque);

		// peek
		System.out.println("deque.peekFirst() = " + deque.peekFirst());
		System.out.println("deque.peekLast() = " + deque.peekLast());

		// poll
		System.out.println("deque.pollFirst() = " + deque.pollFirst());
		System.out.println(deque);
	}

}
