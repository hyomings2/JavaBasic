package sec3;

public class StringBuilderEx1 {

	public static void main(String[] args) {
		String k ="김밍";
		String j="조람";
		System.out.println(k+", "+j);
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Web ");
		sb.append("Programming");
		
		System.out.println(sb);
		
		sb.insert(4,"6");//특정위치에 문자 삽입
		System.out.println(sb);
		
		sb.setCharAt(4,'8');//특정위치에 문자 변경
		System.out.println(sb);
		
		sb.replace(10, 21, "Programmer");//특정번째 문자열 바꾸기
		System.out.println(sb);
		
		sb.delete(4, 5);
		System.out.println(sb);
		
		System.out.println("글자수: "+sb.length());
		String res = sb.toString();
		System.out.println("문자열로 반환: "+res);
		StringBuilder sb2 = new StringBuilder(res);
		
	}

}
