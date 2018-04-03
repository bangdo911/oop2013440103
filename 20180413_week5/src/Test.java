
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		//p.x = 0.0;
		//p.y = 0.0;
		p.setX(0.0);
		p.setY(0.0);
		
		Point p2 = new Point();
		p2.setX(1.0);
		p2.setY(1.0);
		
		System.out.println("p.x = "+p.getX() + " p.y = " + p.getY());
		p = p.move(p2);
		System.out.println("p.x = "+p.getX() + " p.y = " + p.getY());
		
		System.out.println(p.distance());
		// call by value 매우 중요.
	}

}
