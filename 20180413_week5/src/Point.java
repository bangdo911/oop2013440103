
public class Point {
	// �ʵ��� scope(��ȿ����)�� Ŭ���� �����̴�.
	private double x;
	private double y;
	
	
	public void setX(double xx) {this.x = xx;}
	public void setY(double yy) {this.y = yy;}
	
	public double getX(){return x;}
	public double getY(){return y;}
	
	public double distance() {
		// ��ȯ�� ���� ����
		// ���� ������ ��ȿ������ �޼ҵ� �����̴�.
		double result;
		//�Ÿ� ���
		result = Math.sqrt(x*y+ y*y);
		// ��ȯ
		return result;
	}
	public Point move(Point p) { // �Ű� ���� p�� ��ȿ������ �޼ҵ� �����̴�. 
		/*x = x + p.x;
		y = y + p.y;*/
		
		// temp ���� ����
		double a, b;
		
		a = this.x + p.x;
		b = this.y + p.y;
		
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		// ���ο� ����Ʈ ��ȯ
		return pnt;
	}
	
}
