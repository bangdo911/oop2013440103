import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// 4. ����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// (A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)
		System.out.println("4�� ����");
		
		int score;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		score = input.nextInt(); // Ű���忡�� ���� �Է�
		
		
		if(score <= 100 && score >= 80) {
			System.out.print("A");
		}
		else if(score < 80 && score >= 60) {
			System.out.print("B");
		}
		else if(score < 60 && score >= 40) {
			System.out.print("C");
		}
		else if(score < 40 && score >= 20) {
			System.out.print("D");
		}
		else if(score < 20 && score >= 0) {
			System.out.print("E");
		}
		else
			System.out.print("������ ��� �����Դϴ�.");
		
		System.out.println("=============���α׷� ����=============");
	}

}