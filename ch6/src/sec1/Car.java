package sec1;

public class Car {

	private String name,style,company,fuel;
	private int tire,speed,num,usetime;
	Car(){
		this("자동차");
	}
	Car(String name){
		this(name,"경차");
	}
	Car(String name, String style){
		this(name,style,"현대");
	}
	Car(String name, String style, String company){
		this(name,style,company,"휘발유");
	}
	Car(String name, String style, String company, String fuel){
		this(name,style,company,fuel,4);
	}
	Car(String name, String style, String company, String fuel,int tire){
		this(name,style,company,fuel,tire,50);
	}
	Car(String name, String style, String company, String fuel,int tire, int speed){
		this(name,style,company,fuel,tire,speed,0000);
	}
	Car(String name, String style, String company, String fuel,int tire, int speed, int num){
		this(name,style,company,fuel,tire,speed,num,1);
	}
	
	Car(String name, String style, String company, String fuel,
			int tire, int speed, int num, int usetime) {
		this.name = name;
		this.style = style;
		this.company = company;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.num = num;
		this.usetime = usetime;
	}
	
	
	public void computeMoney() {
		System.out.println("주차 요금은 1000원 입니다");
	}
	public void computeMoney(int num) {
		System.out.println("주차 요금은 "+ num*1000+"원 입니다");
	}
	public void computeMoney(int num,String style) {
		System.out.println("차 종은 "+style+", 주차 요금은 "+ num*1000+"원 입니다");
	}
	public void computeFuel() {
		System.out.println("주유 금액은 3000원 입니다");
	}
	public void computeFuel(int oil) {
		System.out.println("주유 금액은 "+ oil*3000+"원 입니다");
	}
	public void computeFuel(int oil,String fuel) {
		System.out.println("연료는 "+fuel+", 주유 요금은 "+ oil*3000+"원 입니다");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getUsetime() {
		return usetime;
	}
	public void setUsetime(int usetime) {
		this.usetime = usetime;
	}
	
	
}
