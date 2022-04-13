package sec3;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "김효민&조한철,김진실-김소정&정아희,박다연-장원희";
		String[] arr = str.split("&|,|-");
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		//------------------------------------
		for(String name:arr) {
			System.out.println(name);
		}
		//-------------------------------------------
		str="ㄱ/ㄴ/ㄷ/ㄹ/ㅁ/ㅂ/ㅅ/ㅇ";
		StringTokenizer s = new StringTokenizer(str,"/");
		int l = s.countTokens();
		for(int i=0; i<l;i++) {
			String t =s.nextToken();
			System.out.println(t);
		}
		
		StringTokenizer s2 = new StringTokenizer(str,"/");
		while(s2.hasMoreTokens()) {
			String t2 =s2.nextToken();
			System.out.println(t2);
		}
	}

}
