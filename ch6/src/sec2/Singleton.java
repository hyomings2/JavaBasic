package sec2;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	private Singleton() {} //생성자
	
	int num;
	
	static Singleton getInstance() {
		return singleton;
	}
}
