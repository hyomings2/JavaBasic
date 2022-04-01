package sec1;

public class Animal {

	private String name,type;
	private int legs,wings;
	private boolean spine;
	private float speed;
	
	
	Animal() {
		this("동물");
	}
	Animal(String name) {
		this(name,"포유류");
	}
	Animal(String name, String type) {
		this(name,type,4);
	}
	Animal(String name, String type, int legs) {
		this(name,type,legs,2);
	}
	Animal(String name, String type, int legs, int wings) {
		this(name,type,legs,wings,true);
	}
	Animal(String name, String type, int legs, int wings, boolean spine) {
		this(name,type,legs,wings,spine,50);
	}
	Animal(String name, String type, int legs, int wings, boolean spine, float speed) {
		this.name = name;
		this.type = type;
		this.legs = legs;
		this.wings = wings;
		this.spine = spine;
		this.speed = speed;
	}
	public void running() {
		System.out.println("동물이 달립니다");
	}
	public void running(String name) {
		System.out.println(name+"이/가 달립니다");
	}
	public void running(String name, float speed) {
		System.out.println(name+"이/가 "+speed+"km/s로 달립니다");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	public boolean getSpine() {
		return spine;
	}
	public void setSpine(boolean spine) {
		this.spine = spine;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	
	

}
