
public class TestPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle();
		tri.height = 4.0;
		tri.width = 4.0;
		System.out.println(tri.area());
		
		Rectangle rec = new Rectangle();
		rec.height = 2.0;
		rec.width = 3.0;
		System.out.println(rec.area());
		
		// Poloygon pol = new Polygon();
		// ㄴ abstract class 는 객체를 만들 수 없다.
	}

}
