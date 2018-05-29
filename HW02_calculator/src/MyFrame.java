import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame extends JFrame implements ActionListener {
	//필드: 모든 메소드에서 접근할 수 있다. 
	JButton zero, one, two, three, four, five, six, seven, eight, nine, ce, equal, plus;
	JTextField tf;
	int a=0, b=0;
	
	MyFrame() {
		this.setSize(180,270);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("덧셈 계산기");
		
		//새로운 컴포넌트를 프레임에 추가
		this.setLayout(new FlowLayout());//플로우 배치 매니저 사용	
		
		tf = new JTextField(11);
		this.add(tf);
		this.setVisible(true);	
		
		this.seven = new JButton("7");//버튼 객체 생성
		this.add(this.seven);//버튼객체를 프레임에 추가
		this.seven.setActionCommand("seven");
		seven.addActionListener(this);//이벤트 리스터 객체 등록
		
		this.eight = new JButton("8");	
		this.add(eight);
		this.eight.setActionCommand("eight");
		eight.addActionListener(this);//이벤트 리스터 객체 등록
		
		this.nine = new JButton("9");	
		this.add(nine);
		this.nine.setActionCommand("nine");
		nine.addActionListener(this);//이벤트 리스터 객체 등록
		
		this.four = new JButton("4");//버튼 객체 생성
		this.add(this.four);//버튼객체를 프레임에 추가
		this.four.setActionCommand("four");
		four.addActionListener(this);//이벤트 리스터 객체 등록
		
		this.five = new JButton("5");	
		this.add(five);
		this.five.setActionCommand("five");
		five.addActionListener(this);//이벤트 리스터 객체 등록
		
		this.six = new JButton("6");	
		this.add(six);
		this.six.setActionCommand("six");
		six.addActionListener(this);//이벤트 리스터 객체 등록
		
		this.one = new JButton("1");//버튼 객체 생성
		this.add(this.one);//버튼객체를 프레임에 추가
		this.one.setActionCommand("one");
		one.addActionListener(this);//이벤트 리스터 객체 등록
		
		this.two = new JButton("2");	
		this.add(two);
		this.two.setActionCommand("two");
		two.addActionListener(this);//이벤트 리스터 객체 등록
		
		this.three = new JButton("3");	
		this.add(three);
		this.three.setActionCommand("three");
		three.addActionListener(this);//이벤트 리스터 객체 등록
		
		this.ce = new JButton("CE");
		this.add(this.ce);
		this.ce.setActionCommand("CE");
		ce.addActionListener(this);
		
		this.zero = new JButton("0");	
		this.add(zero);
		this.zero.setActionCommand("zero");
		zero.addActionListener(this);
		
		this.plus = new JButton("+");	
		this.add(plus);
		this.plus.setActionCommand("plus");
		plus.addActionListener(this);
		
		this.equal = new JButton("=");	
		this.add(equal);
		this.equal.setActionCommand("=");
		equal.addActionListener(this);
			
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if ((e.getActionCommand()).equals("zero")) {
			b = b * 10;
			this.tf.setText(" " + b);	
		}
		else if ((e.getActionCommand()).equals("one")) {
			b = b * 10 + 1;
			this.tf.setText(" " + b);
		}
		else if ((e.getActionCommand()).equals("two")) {
			b = b * 10 + 2;
			this.tf.setText(" " + b);	
		}
		else if ((e.getActionCommand()).equals("three")) {
			b = b * 10 + 3;
			this.tf.setText(" " + b);	
		}
		else if ((e.getActionCommand()).equals("four")) {
			b = b * 10 + 4;
			this.tf.setText(" " + b);
		}
		else if ((e.getActionCommand()).equals("five")) {
			b = b * 10 + 5;
			this.tf.setText(" " + b);	
		}
		else if ((e.getActionCommand()).equals("six")) {
			b = b * 10 + 6;
			this.tf.setText(" " + b);	 
		}
		else if ((e.getActionCommand()).equals("seven")) {
			b = b * 10 + 7;
			this.tf.setText(" " + b);
		}
		else if ((e.getActionCommand()).equals("eight")) {
			b = b * 10 + 8;
			this.tf.setText(" " + b);	
		}
		else if ((e.getActionCommand()).equals("nine")) {
			b = b * 10 + 9;
			this.tf.setText(" " + b);	
		}
		else if ((e.getActionCommand()).equals("CE")) {
			b = 0;
			a = 0;
			this.tf.setText(" " + b);	
		}
		else if ((e.getActionCommand()).equals("plus")) {
			a = a + b;
			b = 0;
			this.tf.setText(" " + b);	
		}
		else if ((e.getActionCommand()).equals("=")) {
			a = a + b;
			b = 0;
			this.tf.setText(" " + a);	
		}
		else
			this.tf.setText("ERROR");
		
	}
	
}