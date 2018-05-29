
public class Box <T> {
	private T data; // Object = 모든 클래스의 상위클래스
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
}