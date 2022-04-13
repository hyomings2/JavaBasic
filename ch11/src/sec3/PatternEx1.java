package sec3;

import java.util.regex.Pattern;

public class PatternEx1 {

	public static void main(String[] args) {
		//정규표현식(Regular Expression)=패턴(Pattern)
		//입력된 데이터가 원하는 형식이 맞는지 검증하게 하는 식
		//아이디.비밀번호,전화번호,이메일,주민번호 형식 등을 검증
		//한개의 문자 [] -> [abc]: abc중 하나의 문자를 포함하고 있는지
		//				[^abc] : 한 문자라도 abc가 아니도록 제한
		//				[a-z]: a~z 영문 소문자가 포함되는지
		//				[a-zA-z]: 영문 대문자나 소문자가 포함되는지
		//				[a-zA-Z0-9]: 영문, 숫자가 포함되어 있는지
		//\d	-> 십진수[0-9]를 말함
		//\s	-> 공백이 포함되어있는지
		//\w	-> [a-zA-Z0-9]와 동일
		//?		->없음 또는 하나	kbs? -> kbs 또는 kbs1,kbsa
		//*		->없음 또는 한 개 이상 kbs* -> kbs 또는 kbs1234, kbs1
		//+		->한 개 이상 kbs+ -> kbs1234, kbs1
		//{n}	->\d{3}	:숫자 3글자 이어야함
		//{n,m}	->\d{3,4}	:숫자 3글자 또는 4글자 이어야함
		//()	->그룹(02|031)
		//|		->또는
		
		//(02|031|010)-\d{3,4}-\d{4} 전화번호 형식
		//\w+@\w+(\.\w+)? 이메일주소
		//\w{8,12}: 아이디 또는 비밀번호 영문 또는 숫자로 8글자 이상 12글자 이하
		//\d{6}-\d{7} 주민번호
		String regExp ="(02|031|010)-\\d{3,4}-\\d{4}";
		String[] data1={"010-9807-6914","032-9807-6914","031-123-432"};
		for(String iso:data1) {
			boolean res = Pattern.matches(regExp, iso);
			
			if(res) {
				System.out.println(iso+"는 정규 표현식과 형식이 일치합니다.");
			}
			else {
				System.out.println(iso+"는 정규 표현식과 형식이 일치하지않습니다.");
			}
		}
		String regExp2 ="\\w+@\\w+(\\.\\w+)?";
		String[] data2={"hyoming98@naver.com","1234&daum.net","hyoming98@naver"};
		for(String email:data2) {
			boolean res = Pattern.matches(regExp2,email);
			
			if(res) {
				System.out.println(email+"는 이메일 형식이 일치합니다.");
			}
			else {
				System.out.println(email+"는 이메일 형식이 일치하지않습니다.");
			}
		}
		String regExp3 ="\\d{6}-\\d{7}";
		String[] data3={"980729-1234123","1234-1234567","123456789-1234"};
		for(String jumin:data3) {
			boolean res = Pattern.matches(regExp3,jumin);
			
			if(res) {
				System.out.println(jumin+"는 주민번호 형식이 일치합니다.");
			}
			else {
				System.out.println(jumin+"는 주민번호 형식이 일치하지않습니다.");
			}
		}
		
		
	}

}
