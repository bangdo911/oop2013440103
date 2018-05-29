
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box();
		String str = new String("BOXBOXBOXBOX");
		int num = 3;
		
		box.setObject(str);
		System.out.println("the box get " + box.get());
		box.setObject(num);
		System.out.println(10 + (Integer)box.get());
	}

}
