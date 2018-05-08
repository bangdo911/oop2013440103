import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog tina = new Dog();
//		tina.sing();
//		Animal aaa = new Animal();
//		aaa.sing();
////		aaa.eat();
//		aaa.name = bbb;
//		Animal aaa = new Dog(); // 우변의 클라스가 좌변 클라스의 서브 클래스이변 전혀 문제 없다.
		Animal aaa = (Animal) new Cat();
		aaa.sing();
//		// Overriding한 메소드를 호출하면 subclass의 메소드가 수행된다.
//		aaa.sing();
//		aaa = new Cat();
//		aaa.sing();
		// 다형성
		// 1. 하나의 클라스로부터 여러 서브클라스를 만들 경우
		// 2. 모든 서브클라스는 수퍼클라스의 메소드를 override한다.
		// 3. SuperClass SuperRefVar = new SubClass();
		// 4. SuperRefVar.overridedMethod() => 객체의 클라스가 구현한 메소드를 실행한다.
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if(str.equals("dogs")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing();
//		int a; // 형변환
//		a = (int)3.1;
//		System.out.println(a);

	}
}
