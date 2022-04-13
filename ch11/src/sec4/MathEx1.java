package sec4;

public class MathEx1 {

	public static void main(String[] args) {
		int v1 = Math.abs(-6); //부호 - 절대값 6
		double v2 = Math.abs(-6.28);
		
		System.out.println("v1="+v1);
		System.out.println("v2="+v2);
		
		System.out.println("6.3 => "+Math.ceil(6.3)); //올림
		System.out.println("-6.3 => "+Math.ceil(-6.3));
		System.out.println("6.3 => "+Math.floor(6.3)); //내림
		System.out.println("-6.3 => "+Math.floor(-6.3));
		System.out.println("6.8 => "+Math.rint(6.8)); // 반올림 하여 실수로 반환
		System.out.println("-6.8 => "+Math.rint(-6.8));
		System.out.println("6.3 => "+Math.rint(6.3));
		System.out.println("-6.3 => "+Math.rint(-6.3));
		System.out.println("6.3 => "+Math.round(6.3)); //반올림 하여 정수로 반환
		System.out.println("-6.3 => "+Math.round(-6.3));
		System.out.println("6.8 => "+Math.round(6.8)); //반올림 하여 정수로 반환
		System.out.println("-6.8 => "+Math.round(-6.8));
		
		System.out.println("돗수분포에서 가장 큰수 => "+Math.max(8, 9));
		System.out.println("돗수분포에서 가장 큰수 => "+Math.min(8, 9));
		
		System.out.println("랜덤수: "+Math.random());
		
		for(int i=0;i<5;i++) {
			System.out.println("랜덤수"+i+":"+((int)(Math.random()*10)+1));
		}
		
		for(int i=0;i<6;i++) {
			System.out.print(((int)(Math.random()*10)+1)+"\t");
		}
		

	}

}
