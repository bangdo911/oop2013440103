import java.util.Scanner; // import�� C������ include�� ���.

public class ConditionalStatement {

	public static void main(String[] args) {
		int score;
		int good = 0; int bad = 0;
		char grade;
		
		System.out.print("������ �Է��ϼ��� : ");
		Scanner input = new Scanner(System.in);
		score = input.nextInt(); // Ű���忡�� ���� �Է�
		
		System.out.println("������ " + score + "���Դϴ�.");
		// ������ 60�� �̻��̸� "�հ��Դϴ�.", 60�� �̸��̸� "���հ��Դϴ�"�� ���
		// �� >= : ���迬����
		// if(���ǽ�) {���� ��� ����} else {������ ��� ����}
		
		if(score >= 60) {
			System.out.println("�հ��Դϴ�.");
			good++;
		}
		
		else {
			System.out.println("���հ��Դϴ�.");
			bad++;
		}
		
		//������ 80�� �̻��̸� A, 60�� �̻��̸� B, 60�� �̸��̸� F ���
		
		if(score >= 80)
			grade = 'A';
		else if(score >= 60)
			grade = 'B';
		else
			grade = 'F';
		
		System.out.println("������ " + grade + "�Դϴ�.");
		
		// Switch�� �� break ����ϵ���.
		// 0 = ����, 1 = �ϳ�, 2 = ��, 3�̻� = ���� ���
		switch(score) {
		case 0 :
			System.out.println("����");
			break;
		case 1 :
			System.out.println("�ϳ�");
			break;
		case 2 :
			System.out.println("��");
			break;
		default : 
			System.out.println("����");
			break;
		}
		
		
		
		System.out.println("=============���α׷� ����=============");
	}
}










