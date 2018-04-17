
public class Animal {
	// Fields
	public String name; // »ó¼Ó½Ã private -> public
	// Constructor
	public Animal(String name) {
		this.name = name;
	}
	public void Sing() {
		System.out.println(name + " Sing");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
