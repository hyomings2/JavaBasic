package sec3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String[] args) {
		int[] intArr = {17,3,11,25};
		String[] strArr= {"김","이","박","나","최","김","이"};
		Object[] objArr= {1,"1",2,"2",2,"2",3,"3",3,4,"4"};
		System.out.println("요소의 수: "+strArr.length);
		System.out.print("strArr: ");
		for(int i=0; i<strArr.length;i++) {
			System.out.print(strArr[i]+",");
		}
		Set set1 = new HashSet();
		Set set2 = new HashSet();
		for(int i=0; i<strArr.length;i++) {
			set1.add(strArr[i]);
		}
		for(int i=0; i<objArr.length;i++) {
			set2.add(objArr[i]);
		}
		System.out.println("\nset str: "+set1);
		System.out.println("set obj: "+set2);
		
		Iterator it= set1.iterator();
		while(it.hasNext()) {
			System.out.println("요소: "+it.next());
		}

	}

}
