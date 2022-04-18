package sec1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		que.add(20);
		que.add(50);
		que.offer(30);
		que.offer(40);
		System.out.println("큐의 크기: "+que.size());
		System.out.println("가장 처음에 입력된 값: "+que.peek());
		que.remove();
		System.out.println("제거 후 큐의 크기: "+que.size());
		System.out.println("가장 처음에 입력된 값: "+que.peek());
		que.poll();
		System.out.println("제거 후 큐의 크기: "+que.size());
		System.out.println("가장 처음에 입력된 값: "+que.peek());
		que.clear();
		System.out.println("모두 비운 후 큐의 크기: "+que.size());
		
	}

}
