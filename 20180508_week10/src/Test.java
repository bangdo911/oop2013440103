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
//		Animal aaa = new Dog(); // �캯�� Ŭ�󽺰� �º� Ŭ���� ���� Ŭ�����̺� ���� ���� ����.
		Animal aaa = (Animal) new Cat();
		aaa.sing();
//		// Overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ尡 ����ȴ�.
//		aaa.sing();
//		aaa = new Cat();
//		aaa.sing();
		// ������
		// 1. �ϳ��� Ŭ�󽺷κ��� ���� ����Ŭ�󽺸� ���� ���
		// 2. ��� ����Ŭ�󽺴� ����Ŭ���� �޼ҵ带 override�Ѵ�.
		// 3. SuperClass SuperRefVar = new SubClass();
		// 4. SuperRefVar.overridedMethod() => ��ü�� Ŭ�󽺰� ������ �޼ҵ带 �����Ѵ�.
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if(str.equals("dogs")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing();
//		int a; // ����ȯ
//		a = (int)3.1;
//		System.out.println(a);

	}
}
