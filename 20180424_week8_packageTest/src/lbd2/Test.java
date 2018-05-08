package lbd2;

import lbd1.*; // lbd1 패키지의 모든 클라스를 사용할 것이다.

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "aBasil";
		// aBasil.age = 12; ERROR : age is a private field!
		
		
		// 타 패키지의 클라스를 사용하려면
		// 1. 앞에 package 이름을 쓰면 문제 없다.
		// lbd1.Dog aDog = new lbd1.Dog(); 
		// aDog.name = "Bow";
		
		// 2. import 명영어를 사용한다.
		Dog aDog = new Dog();
		aDog.name = "Bow";
		// aDog.nickName = "BB"; ERROR : (Dog.java 참고) nickName은 패키지 접근지정
		
		Animal aa = new Animal();
		// aa.protectedField = "error";
		aa.publicField = "OK1";
		
		
	}

}
