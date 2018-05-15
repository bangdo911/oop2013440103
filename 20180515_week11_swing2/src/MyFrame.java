import java.awt.FlowLayout;

import javax.swing.*;

// 스윙의 모든 부분을 import 하려면  javax.swing.* 을 임포트

// 프레임 만드는 두번째 방법 : JFrame으로부터 상속
public class MyFrame extends JFrame {
	MyFrame() {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("MyFrame");
		
		// 여기서부터 새로은 컴포넌트를 프레임에 추가
		setLayout(new FlowLayout()); // 배치관리자
		JLabel label = new JLabel("안녕하세용"); // 레이블 객체 생성
		JTextField tf = new JTextField(10); // 텍스트필드 객체 생성
		JButton button = new JButton("버튼"); // 버튼 객체 생성
		button.setText("+");
		
		// 패널 생성
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
//		this.add(label); // 레이블 객체를 프레임에 추가
//		this.add(tf);
		this.add(panel);
		this.add(button);
		
		
		this.setVisible(true);
		
	}
}
