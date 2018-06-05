
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Happy"); // 업캐스팅
		Animal aCat = new Cat("먼지"); // 업캐스팅
		
		
		
//		aDog.name = "Happy";
		aDog.sing();
//		aDog.playFetch(); // error!!!
		((Dog)aDog).playFetch(); // 다운캐스팅
		aCat.sing();
//		((Cat)aDog).playFetch(); // error!! 메소드없음
//		((Dog)aCat).playFetch(); // error! 업캐스팅은 항상 되지만 다운캐스팅은 안될수도 있다.
//		System.out.println(aDog.name);
//		aDog.playFetch();
	}

}
