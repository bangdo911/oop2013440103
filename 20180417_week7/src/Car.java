
public class Car {
	// Fields
	private String color;
	private int speed;
	// 정적변수(Static field
	public static int numberOfCars = 0;
	
	// Constructor(생성자) : 메소드 이름이 클라스 이름과 같다. 반환형이 없다.
	//객체가 생성될 때에 필드에게 초기값을 제공하고 필요한 초기화 절차를 진행하는 메소드.
	// 만약 생성자를 정의하지 않으면 매개변수 없는 생성자를 자바에서 자동으로 생성한다.
	// 생성자를 하나라도 정의하면 자바는 아무일도 안한다.
	public Car(String color, int speed){
		//생성자 예시
		this.color = color;
		this.speed = speed;
		numberOfCars++;
	}
	
	public Car() {
		numberOfCars++;
	} 
	
	// Methods
	public static void print() {
		//System.out.println(this.color +" "+this.speed);
		// 에러 이유 : 정적 메소드에선 정적변수만 access 할 수 있다.
		System.out.println(numberOfCars);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String toString() {
		return ("Color is "+ this.color +" ,"+ "Speed is "+ this.speed + "km");
	}
	
	
}
