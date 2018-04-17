
public class Cat extends Animal {
	// 매소드 재정의(method override)
	// 서브 클래스가 필요에 따라 상속된 메소드를 다시 정의하는 것.
	public Cat(String name) {
		super(name);
	}
	@Override
	public void Sing() {
		System.out.println(name + " 야옹!");
	}
}
