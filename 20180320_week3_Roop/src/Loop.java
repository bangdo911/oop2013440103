
public class Loop {

	public static void main(String[] args) {
		// 1 ~ 10 ������ ȭ�鿡 ���.
		int i; // i�� ��������
		i = 1; // 1. �������� �ʱ�ȭ
		
		while(i <= 10) // 2. ���� ���ǽ�
		{
			System.out.println("���� : " + i); // 3. ������
			i++; // 4. �������� ��ȭ
		}
		
		int sum = 0;
		
		i = 1;
		while(i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("1���� 10������ ��(while��) : " + sum);
		
		sum = 0;
		for(i = 1; i <= 10; i++) {
			sum = sum + i;
			//if(i == 5) break;
		}
		System.out.println("1���� 10������ ��(for��) : " + sum);
		
		// do-while ���� ���� ����.
		
		// continue�� ����
		String s = "n1n2n3n4n5n6n7n8n9n0";
		int n = 0;
		
		for(i = 0; i < s.length(); i++)
		{
			// n�� ������ Ƚ���� ����.
			if(s.charAt(i) != 'n') // s�� ����ִ� i��° ���ڰ� 'n'�� �ƴϸ�
				continue;		   // �ݺ��� �ٽ� �����Ѵ�.
			// n�� ������ 1 ������Ų��.
			n++;
		}
		System.out.println("���忡�� �߰ߵ� n�� ���� : " + n);
		
		
		System.out.println("=============���α׷� ����=============");
	}
}



	// ���� 1 : C ���α׷��� ���� : ���ǹ� 6�� �ݺ��� 25��
	// ������ �������� �ݺ��� 25�� draw.io�� �ִ� �÷ο���Ʈ OR ������ �׷��� ���� �ø���


