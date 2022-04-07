package sec1;
//두개의 인터페이스 선언내용이 모두 구현되어야한다.
public class SmartTv implements RemoteControl, Searchable {
	private int volume, channel;

	@Override
	public void search(String url) {}

	@Override
	public void turnOn() {}

	@Override
	public void turnOff() {}

	@Override
	public void setVolume(int volume) {}

	@Override
	public int getVolume() { return volume; }

	public int getChannel() { return channel; }

	public void setChannel(int channel) { this.channel = channel; }
	
	
	
	

}
