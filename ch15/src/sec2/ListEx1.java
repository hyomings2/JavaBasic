package sec2;

import java.util.ArrayList;
import java.util.List;

class Human{
	private String name;	//보안 때문에 private
	private int sno, age;
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getSno() { return sno; }
	public void setSno(int sno) { this.sno = sno; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
}
public class ListEx1 {

	public static void main(String[] args) {
		List<String> list1 =  new ArrayList<>();
		
		list1.add("김효민");
		list1.add("김진실");
		list1.add("김소정");
		
		System.out.println("리스트의 크기"+list1.size());
		System.out.println("리스트 "+list1);
		for(String name : list1) {
			System.out.println("이름: "+name);
		}
		String irum = list1.get(1);
		System.out.println("인덱스가 1인 요소: "+irum);
		System.out.println("인덱스가 1인 요소: "+list1.get(1));
		list1.add("정아희");
		list1.remove(1);
		System.out.println("리스트"+list1);
	
		List<Human>h1 = new ArrayList<Human>();
		Human m1 = new Human();
		m1.setName("김효민");
		m1.setSno(17);
		m1.setAge(25);
		h1.add(m1);
		Human m2 = new Human();
		m2.setName("김진실");
		m2.setSno(18);
		m2.setAge(26);
		h1.add(m2);
		Human m3 = new Human();
		m3.setName("김소정");
		m3.setSno(19);
		m3.setAge(25);
		h1.add(m3);
		System.out.println("번호\t회원명\t나이");
		for(Human h:h1) {
			System.out.print(h.getSno()+"\t");
			System.out.print(h.getName()+"\t");
			System.out.print(h.getAge()+"\n");
		}
	
	}

}
