package sec1;

public class NumberFormatEx {

	public static void main(String[] args) {
		String a="90";
		String b="6.28";
		String c="g90";
		
		try {
			System.out.println(Integer.parseInt(a));
			System.out.println(Double.parseDouble(b));
			System.out.println(Integer.parseInt(c));
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환되지 않는 데이터");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("이유를 알 수 없음");
			e.printStackTrace();
		}
		finally {
			System.out.println("프로그램 종료");
		}
	}

}
