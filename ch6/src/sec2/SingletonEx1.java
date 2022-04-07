package sec2;

public class SingletonEx1 {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		obj1.num=1004;
		
		if(obj1 == obj2) {
			System.out.println("obj1 == obj2");
		}
		
		else {
			System.out.println("obj1 != obj2");
		}
		
		System.out.println(obj2.num);
	}

}
