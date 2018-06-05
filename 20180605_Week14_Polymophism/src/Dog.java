
public class Dog extends Animal {

	Dog(String name){
		super(name);
	}
	@Override
	void sing() {
		System.out.println(this.name +" ¸Û¸Û");
	}
	void playFetch() {
		System.out.println(name + "°¡ °øÀ» ¹°¾î¿Ô´Ù");
	}
}
