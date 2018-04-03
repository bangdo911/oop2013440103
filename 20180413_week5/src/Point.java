
public class Point {
	// 필드의 scope(유효범위)은 클래스 내부이다.
	private double x;
	private double y;
	
	
	public void setX(double xx) {this.x = xx;}
	public void setY(double yy) {this.y = yy;}
	
	public double getX(){return x;}
	public double getY(){return y;}
	
	public double distance() {
		// 반환할 변수 선언
		// 지역 변수의 유효범위는 메소드 내부이다.
		double result;
		//거리 계산
		result = Math.sqrt(x*y+ y*y);
		// 반환
		return result;
	}
	public Point move(Point p) { // 매개 변수 p의 유효범위는 메소드 내부이다. 
		/*x = x + p.x;
		y = y + p.y;*/
		
		// temp 변수 선언
		double a, b;
		
		a = this.x + p.x;
		b = this.y + p.y;
		
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		// 새로운 포인트 반환
		return pnt;
	}
	
}
