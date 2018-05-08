package lbd;

public class Dog extends Animal {
	public Dog() { // Default Constructor
		System.out.println("Dog 디폴트 생성자");
	}
	public Dog(int a) {
		super(a);
		System.out.println("Dog 정수형 생성자");
	}
}
