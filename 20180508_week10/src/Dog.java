
public class Dog extends Animal implements Playable{
	@Override
	void sing() {
		System.out.println("A dog bark");
	}
	void eat() {
		System.out.println("A dog eats");
	}
	@Override
	public void walk() {
		System.out.println("A dog walks");
	}
	@Override
	public void fetch() {
		System.out.println("Fetch with a dog");
	}
}
