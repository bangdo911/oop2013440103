import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// 3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.println("3�� ����");
		
		int one; int two; int three;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��Ͻÿ� : ");
		one = input.nextInt(); // Ű���忡�� ���� �Է�
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		two = input.nextInt(); // Ű���忡�� ���� �Է�
		System.out.print("����° ������ �Է��Ͻÿ� : ");
		three = input.nextInt(); // Ű���忡�� ���� �Է�
		
		if(one > two) {
			if(one > three)
				System.out.print(one);
			else
				System.out.print(three);
		}
		else {
			if(two > three)
				System.out.print(two);
			else
				System.out.print(three);
		}	
	}
}
