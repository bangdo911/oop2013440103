
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Happy"); // ��ĳ����
		Animal aCat = new Cat("����"); // ��ĳ����
		
		
		
//		aDog.name = "Happy";
		aDog.sing();
//		aDog.playFetch(); // error!!!
		((Dog)aDog).playFetch(); // �ٿ�ĳ����
		aCat.sing();
//		((Cat)aDog).playFetch(); // error!! �޼ҵ����
//		((Dog)aCat).playFetch(); // error! ��ĳ������ �׻� ������ �ٿ�ĳ������ �ȵɼ��� �ִ�.
//		System.out.println(aDog.name);
//		aDog.playFetch();
	}

}
