
public class Cat extends Animal {
	// �żҵ� ������(method override)
	// ���� Ŭ������ �ʿ信 ���� ��ӵ� �޼ҵ带 �ٽ� �����ϴ� ��.
	public Cat(String name) {
		super(name);
	}
	@Override
	public void Sing() {
		System.out.println(name + " �߿�!");
	}
}
