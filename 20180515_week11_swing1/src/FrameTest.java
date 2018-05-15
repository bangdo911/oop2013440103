import javax.swing.JFrame;

public class FrameTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test"); // 객체 생성
		f.setSize(400, 500); // 프레임 크기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true); // 이거 안하면 안보임
	}
}
