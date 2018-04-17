
public class TestCar {

	public static void main(String[] args) {
		// 정적 메소드 : 객체를 생성하지 않고 사용할 수 있는 메소드 ex)Math
		System.out.println(Math.cos(0));
		System.out.println(Math.sqrt(144));
		
		Car.print(); // 객체가 생성 되기도 전에 차가 몇댄지 확인 가능
		Car myCar = new Car("Blue", 133);
		Car.print();
		Car yourCar = new Car();
		Car.print();
		yourCar.setColor("Black");
		yourCar.setSpeed(100);

		System.out.println(myCar);
		System.out.println(yourCar);
	}

}
