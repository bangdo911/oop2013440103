
public class Car {
	// Fields
	private String color;
	private int speed;
	// ��������(Static field
	public static int numberOfCars = 0;
	
	// Constructor(������) : �޼ҵ� �̸��� Ŭ�� �̸��� ����. ��ȯ���� ����.
	//��ü�� ������ ���� �ʵ忡�� �ʱⰪ�� �����ϰ� �ʿ��� �ʱ�ȭ ������ �����ϴ� �޼ҵ�.
	// ���� �����ڸ� �������� ������ �Ű����� ���� �����ڸ� �ڹٿ��� �ڵ����� �����Ѵ�.
	// �����ڸ� �ϳ��� �����ϸ� �ڹٴ� �ƹ��ϵ� ���Ѵ�.
	public Car(String color, int speed){
		//������ ����
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
		// ���� ���� : ���� �޼ҵ忡�� ���������� access �� �� �ִ�.
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
