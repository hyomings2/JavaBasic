package sec1;

public class RemoteEx {

	public static void main(String[] args) {
		RemoteControl rc1;//인터페이스 타입으로 선언이 되었을 경우		
		
		rc1= new TvRemote();
		rc1.turnOn();
		rc1.setVolume(10);
		System.out.println("TV볼륨: "+rc1.getVolume());
//		System.out.println("TV볼륨: "+rc1.volume); 불가능
//		System.out.println("채널: "+rc1.getChannel); 인터페이스에서 선언안해서 불가능
		rc1.turnOff();
		
		rc1= new AudioRemote();
		rc1.turnOn();
		System.out.println("오디오 볼륨: "+rc1.getVolume());
		rc1.turnOff();
		
		TvRemote rc2 = new TvRemote();//클래스 타입으로 선언이 되었을 경우
		rc2.volume=20;
		rc2.channel=14;
		
		RemoteControl rc4=rc2;
//		System.out.println("TV볼륨: "+rc2.volume);//직접 접근이 가능
		
		RemoteEx.play(rc2); //call by reference
		RemoteEx.play(rc2.volume,rc2.channel);//call by value
		
		System.out.println(rc2);
		
	}
		
	public static void play(TvRemote tv1) {
		System.out.println("TV볼륨: "+tv1.volume);
		System.out.println("TV채널: "+tv1.channel);
		System.out.println("참조에 의한 전달로 플레이를 합니다");
	}
	public static void play(int vol, int ch) {
		System.out.println("TV볼륨: "+vol);
		System.out.println("TV채널: "+ch);
		System.out.println("값에 의한 전달로 플레이를 합니다");
	}
}


