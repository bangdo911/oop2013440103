import javax.swing.JFrame;

public class FrameTest {
	public static void main(String[] args) {
		JFrame f = new JFrame("Frame Test"); // ��ü ����
		f.setSize(400, 500); // ������ ũ��
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true); // �̰� ���ϸ� �Ⱥ���
	}
}
