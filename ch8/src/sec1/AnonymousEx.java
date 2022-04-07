package sec1;

public class AnonymousEx {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			int vol;
			public void turnOn() { System.out.println("전원 ON"); }
			public void turnOff() { System.out.println("전원 OFF"); }
			public void setVolume(int vol) { this.vol=vol; }
			public int getVolume() { return vol; }
		};
		
	}
	
}
