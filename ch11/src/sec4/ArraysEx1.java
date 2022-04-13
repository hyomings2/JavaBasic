package sec4;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A','P','R','O','G','R','A','M'};
		char[] arr2=arr1;
		System.out.println("얕은 복제");
		System.out.println(arr1);
		System.out.println(arr2);
		
		System.out.println("깊은 복제");
		char[] arr3=Arrays.copyOf(arr1, arr1.length);
		System.out.println(arr3);
		
		char[] arr4=Arrays.copyOfRange(arr3, 4, 11);
		System.out.println(arr4);
		
		System.out.println("얕은 복제의 비교1: "+Arrays.equals(arr1, arr2));
		System.out.println("깊은 복제의 비교1: "+Arrays.equals(arr1, arr3));
		//deep은 2차원 배열일 경우에만 가능
//		System.out.println("얕은 복제의 비교1: "+Arrays.deepequals(arr1, arr2));
//		System.out.println("깊은 복제의 비교1: "+Arrays.deepequals(arr1, arr3));
		System.out.println("arr1의 주소"+Arrays.hashCode(arr1));
		System.out.println("arr2의 주소"+Arrays.hashCode(arr2));
		System.out.println("arr4의 주소"+Arrays.hashCode(arr4));
		
		String[] arr5= {"김","이","박","최","조"};
		Arrays.sort(arr5);
		System.out.print("정렬 후: ");
		
		for(String name:arr5) {
			System.out.print(name+" ");
		}
		System.out.print("\n");
		
		System.out.println("정보 검색 몇번째에 있는지? ");
		String data ="조";
		int idx = Arrays.binarySearch(arr5,data);
		System.out.println("조의 인덱스: "+idx);
		
	}

}
