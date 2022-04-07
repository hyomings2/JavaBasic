package sec1;

public class ExeptionEx1 {

	public static void main(String[] args) {
		int i;
		int a=20;
		//System.out.println("i="+i);
//		System.out.println("a를 0으로 나눈 결과: "+(a/0));
		//예외상황(exception): 정상적인 실행을 하지 못하는 상황
		// 출력하는 내용에 null이 있어서 더이상 실행 할 수 없음->널 포인터 이셉션
		// 특정 
	
		int [] arr= {10,20,30};
		String b ="김효민";
		
		try {
			System.out.println(Integer.parseInt(b));
			System.out.println(a/0);
		} catch(NumberFormatException e){
			System.out.println("정수로 바꿀수 없는 데이터 입니다.");
			e.printStackTrace();
			
		} catch(ArithmeticException e){
			System.out.println("0으로 나누려고 시도하였음");
			e.printStackTrace();
			
		} catch(Exception e){
			e.printStackTrace();
			
		}
	
	
	}

}
