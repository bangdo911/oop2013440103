
public class TestAnimalSing {

	public static void main(String[] args) {
		AnimalSing as = new AnimalSing();
		as.add(new Dog("Tina"));
		as.add(new Dog("해피"));
		as.add(new Dog("똘이"));
		as.add(new Dog("민트"));
		as.add(new Cat("누누"));
		as.add(new Cat("나비"));
		as.add(new Cat("건공"));
		as.add(new Cat("컴공"));
		
		as.sing();
		
		Animal aDog = new Dog("개");
		Animal aCat = new Cat("고양이");
	}

}
