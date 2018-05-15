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
		
		this.setLayout(new FlowLayout()); // 배치관리자
		this.button = new JButton("버튼"); // 버튼 객체 생성
		this.add(this.button);
		this.button.setActionCommand("button1");
		button.addActionListener(this); // 이벤트 리스너 객체 등록
		
		this.button2 = new JButton("두번째버튼");
		this.add(this.button2);
		this.button2.setActionCommand("button2");
		button2.addActionListener(this); // 이벤트 리스너 객체 등록
		
		tf = new JTextField(20);
		this.add(tf);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getActionCommand()).equals("button1")) 
			this.tf.setText("첫번째 버튼 clicked");
		else
			this.tf.setText("두번째 버튼 clicked");
		
	}
}
