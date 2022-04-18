package sec2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		String[] names = {"a","b","c","d","e","f","g"};
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		long start, end;
		
		start = System.nanoTime();
		for(String name :names) {	list1.add(name);	}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린 시간: "+(end-start));
		
		start = System.nanoTime();
		for(String name :names) {	list2.add(name);	}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린 시간: "+(end-start));
	}

}
