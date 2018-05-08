package lbd1;

public class Test {

	public static void main(String[] args) {
		Dog tina = new Dog();
		tina.print();
		tina.name = "Tina";
		// tina.idn = "01234567890"; ERROR : idn is a private field!
		tina.nickName = "Ti";
		
		// 상속 실험
		tina.publicField = "OK1";
		// tina.privateField = "XX"; 
		tina.packageField = "OK2";
		tina.protectedField = "OK3";
		tina.print();
		
		Animal aa = new Animal();
		aa.protectedField = "ddd";
	}

}
