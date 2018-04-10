
public class Point {
	// Fields
	private double x, y;

	// Method
	public double distance() {
		// 반환할 변수 선언
		// 지역 변수의 유효범위는 메소드 내부이다.
		double result;
		//거리 계산
		result = Math.sqrt(x*x + y*y);
		// 반환
		return result;
	}
	
	public double distance(Point p) {
		return Math.sqrt( (this.x-p.getX()) * (this.x-p.getX()) + 
				(this.y-p.getY()) * (this.y-p.getY()) );
	}
	
	public void GetCoordinate() {
		System.out.println("(" + this.getX() + "," + this.getY() + ")");
	}
	public String toString() {
		return ("(" + this.getX() + "," + this.getY() + ")");
	}
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
}
