package collection.deque;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		//Queue<Object> queue = new LinkedList<>(); //ArrayDeque가 LinkedList보다 훨씬 빠르다고 함

		// offer : 데이터 추가
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);

		// peek : 꺼내지 않고 단순 조회만
		System.out.println("queue.peek() = " + queue.peek());

		// poll : 데이터 꺼내기
		System.out.println("queue.poll() = " + queue.poll());
		System.out.println("queue.poll() = " + queue.poll());
		System.out.println("queue.poll() = " + queue.poll());
		System.out.println(queue);
	}

}
