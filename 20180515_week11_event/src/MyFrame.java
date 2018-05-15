import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JButton button2;
	JTextField tf;
	MyFrame(){
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame");
		
		this.setLayout(new FlowLayout()); // ��ġ������
		this.button = new JButton("��ư"); // ��ư ��ü ����
		this.add(this.button);
		this.button.setActionCommand("button1");
		button.addActionListener(this); // �̺�Ʈ ������ ��ü ���
		
		this.button2 = new JButton("�ι�°��ư");
		this.add(this.button2);
		this.button2.setActionCommand("button2");
		button2.addActionListener(this); // �̺�Ʈ ������ ��ü ���
		
		tf = new JTextField(20);
		this.add(tf);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getActionCommand()).equals("button1")) 
			this.tf.setText("ù��° ��ư clicked");
		else
			this.tf.setText("�ι�° ��ư clicked");
		
	}
}
