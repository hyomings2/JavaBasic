package ex;

public class Child extends Parent {
	private int studentNo;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	public Child(String name) {
		//super(name);
		this.name=name;
		System.out.println("Child(String name) call");
	}
	public Child(String name, int studentNo) {
		super(name);
		//this.name=name; 
		//name필드는 현재 클래스의 있는 필드가 아니므로, super클래스인 Parent클래스를 거쳐야 함
		this.studentNo = studentNo;
	}
	

}
