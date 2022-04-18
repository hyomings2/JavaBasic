package sec1;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx1 {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.addFirst("김");
		deque.addFirst("이");
		deque.addLast("박");
		deque.addLast("최");
		deque.add("장");	//직전 명령의 위치에 추가
		System.out.println("데크 출력: "+deque);
		deque.offerFirst("오");
		deque.offerLast("한");
		System.out.println("데크 출력: "+deque);
		deque.poll();	//큐처럼 가장 처음값 제거
		System.out.println("데크 출력: "+deque);
		deque.pop();	//스택처럼 가장 마지막값 제거
		System.out.println("데크 출력: "+deque);
	}

}
