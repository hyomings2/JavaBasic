package sec1;

public interface RemoteControl {
	
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	public int getVolume();

}
