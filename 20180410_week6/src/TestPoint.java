
public class TestPoint {

	public static void main(String[] args) {
		Point pnt = new Point();
		
		
		pnt.setX(1.0);
		pnt.setY(1.0);		
		pnt.GetCoordinate();
		System.out.println(pnt.distance());
		System.out.println(pnt.toString());
		String str = pnt.toString();
		System.out.println("���ڿ� Ȯ�� : " + pnt.toString()); // object�� String�� �ƴϸ� pnt ��ü�� toString�� �ҷ��´�.

		System.out.print("");
		Point pnt2 = new Point();
		
		pnt2.setX(4.0);
		pnt2.setY(5.0);
		pnt2.GetCoordinate();
		System.out.println(pnt2.distance());
		
		System.out.print("pnt�� pnt2�� �Ÿ� : " + pnt.distance(pnt2));
	}

}
