
public class TestCar {

	public static void main(String[] args) {
		// ���� �޼ҵ� : ��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ� ex)Math
		System.out.println(Math.cos(0));
		System.out.println(Math.sqrt(144));
		
		Car.print(); // ��ü�� ���� �Ǳ⵵ ���� ���� ����� Ȯ�� ����
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
