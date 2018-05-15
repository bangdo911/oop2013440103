import java.awt.FlowLayout;

import javax.swing.*;

// ������ ��� �κ��� import �Ϸ���  javax.swing.* �� ����Ʈ

// ������ ����� �ι�° ��� : JFrame���κ��� ���
public class MyFrame extends JFrame {
	MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame");
		
		// ���⼭���� ������ ������Ʈ�� �����ӿ� �߰�
		setLayout(new FlowLayout()); // ��ġ������
		JLabel label = new JLabel("�ȳ��ϼ���"); // ���̺� ��ü ����
		JTextField tf = new JTextField(10); // �ؽ�Ʈ�ʵ� ��ü ����
		JButton button = new JButton("��ư"); // ��ư ��ü ����
		button.setText("+");
		
		// �г� ����
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
//		this.add(label); // ���̺� ��ü�� �����ӿ� �߰�
//		this.add(tf);
		this.add(panel);
		this.add(button);
		
		
		this.setVisible(true);
		
	}
}
