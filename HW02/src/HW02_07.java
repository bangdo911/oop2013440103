import java.util.Scanner;

public class HW02_07 {

	public static void main(String[] args) {
		// 7. 0�� �Էµ� ������ ��� ������ �Է� �ް�, �Էµ� ��� ���ڵ��� ������ ����Ͻÿ�.
		int i;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		i = input.nextInt(); // Ű���忡�� ���� �Է�
		
		while(true)
		{
			if(i == 0) {
				System.out.print("�Էµ� ��� ���ڵ��� ���� : " + sum);
				break;
			}
			else {
				sum = sum + i;
				System.out.print("������ �Է��Ͻÿ� : ");
				i = input.nextInt(); // Ű���忡�� ���� �Է�
			}
			
		}
	}

}