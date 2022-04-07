package sec2;

class A{
	int item1;
	void func1() {System.out.println("기능1");}
	static int item2;
	static void func2() {System.out.println("기능2");}
	class B{
		void method() {
			item1=1004;
			func1();
			item2=2008;
			func2();
		}
	}
	
	static class S{	//static이므로 static만 접근가능
		void method() {
//			item1=100;
//			func1();
			item2=200;
			func2();
		}
	}
	
	void method() {
		class L{	//로컬 클래스
			int field1;
			L(){}
			void method() {
				item1=100;
				func1();
				item2=200;
				func2();
			}
		}
	}
}

public class NestedEx {
	public static void main(String[] args) {
		 A a = new A();
		 A.B b = a.new B();
		 A.S s = new A.S();

	}

}
