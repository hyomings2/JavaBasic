package sec2;

import java.util.ArrayList;
import java.util.List;

class Member{
	private String uid, pw, email, tel;
	public Member() {}
	public Member(String uid, String pw, String email, String tel) {
		super();
		this.uid = uid;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
	}
	public String getUid() {return uid;}
	public void setUid(String uid) {this.uid = uid;}
	public String getPw() {return pw;}
	public void setPw(String pw) {this.pw = pw;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public String getTel() {return tel;}
	public void setTel(String tel) {this.tel = tel;}
}
public class ListEx4 {
	public static void main(String[] args) {
		List<Member> mem = new ArrayList<Member>();
		Member m1 = new Member();
		m1.setUid("Hyomin");
		m1.setPw("1234#");
		m1.setEmail("hyomin@daum.net");
		m1.setTel("010-1111-2222");
		mem.add(m1);
		Member m2 = new Member("Jinsil","5678!","Jin98@naver.com","010-1111-3333");
		mem.add(m2);
		Member m3 = new Member();
		m3.setUid("Hyesu");
		m3.setPw("h1357");
		m3.setEmail("hyesu@naver.com");
		m3.setTel("010-1111-4444");
		mem.add(m3);
		Member m4 = new Member();
		m4.setUid("Ahee");
		m4.setPw("123456");
		m4.setEmail("hee@naver.com");
		m4.setTel("010-1111-5555");
		mem.add(m4);
		Member m5 = new Member("Park","park456","park@naver.com","010-1111-6666");
		mem.add(m5);
		
		System.out.println("ID\tPW\tEmail\t\tTel");
		
		for(Member m : mem) {
			System.out.print(m.getUid()+"\t");
			System.out.print(m.getPw()+"\t");
			System.out.print(m.getEmail()+"\t");
			System.out.print(m.getTel()+"\n");
		}

	}

}
