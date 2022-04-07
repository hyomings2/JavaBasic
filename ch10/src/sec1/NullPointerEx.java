package sec1;

public class NullPointerEx {

	public static void main(String[] args) {
		String a=null;
		try {
			System.out.println(a.toString());
		}catch(NullPointerException e) {
			System.out.println("출력할 내용에 null이 있음");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("이유를 알 수 없는 예외 발생");
			e.printStackTrace();
		}finally {
			System.out.println("포로그램 종료");
		}

	}

}
