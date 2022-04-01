package sec1;

public class AnimalEx {

	public static void main(String[] args) {
		
		Animal anymal=new Animal();
		Animal cheetah=new Animal("ġŸ");
		cheetah.setSpeed(40.0f);
		cheetah.running(cheetah.getName());
		cheetah.running(cheetah.getName(),cheetah.getSpeed());
		
		
		

	}

}
