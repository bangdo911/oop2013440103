package lbd2;

import lbd1.*; // lbd1 ��Ű���� ��� Ŭ�󽺸� ����� ���̴�.

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "aBasil";
		// aBasil.age = 12; ERROR : age is a private field!
		
		
		// Ÿ ��Ű���� Ŭ�󽺸� ����Ϸ���
		// 1. �տ� package �̸��� ���� ���� ����.
		// lbd1.Dog aDog = new lbd1.Dog(); 
		// aDog.name = "Bow";
		
		// 2. import ��� ����Ѵ�.
		Dog aDog = new Dog();
		aDog.name = "Bow";
		// aDog.nickName = "BB"; ERROR : (Dog.java ����) nickName�� ��Ű�� ��������
		
		Animal aa = new Animal();
		// aa.protectedField = "error";
		aa.publicField = "OK1";
		
		
	}

}
