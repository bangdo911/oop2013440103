public class RememberC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("Hello World!");
		System.out.print("Hello World!");
		System.out.println("Hello World!");
		//�ּ� : println �� ������ �ִ�. print�� ������ ����.

		/*
		 Todays' Topic
		 ����(Variable)
		 �ڷ���(Data Structure)
		 ��������(Variable Declaration)
		*/
		
		// ���� : �޸� ��������� �̸�
		// �ڷ��� : 
		// 1. ������ ���� �� �ִ� ���� ������ ���Ѵ�.
		// 2. ������ �ǿ����ڷ� ����� ���, ����� �� �ִ� �����ڸ� ���Ѵ�.
		// 3. ���� �޸𸮿� �����ϱ� ���� �ʿ��� ����(��������� ��, ���� ����)�� ���Ѵ�
		// ���� ����
		// ������ ����ϱ� ���� �ʿ��� �Ʒ��� ������ ǥ���Ѵ�.
		// 1. ����� ������ �̸��� �����Ѵ�
		// 2. ����� ������ �ڷ����� �����Ѵ�.
		// Java���� ������ ����ϱ� ���� �ݵ�� ���������� �ؾ��Ѵ�.
		
		int a, b; // 1. a�� �����̸��̴�. 2. ���� a�� �ڷ����� int�̴�.
		
		// ���ͷ�(literal) : �ҽ��ڵ忡�� ���� ǥ���ϴ� ���.
		// ���Կ�����(=) : �캯�� ���� �º��� ����ҷ� �̵��Ѵ�. AND �캯�� ���� ��ȯ�Ѵ�.
		// ����(Expression) : 
		// �����ڿ� �ǿ�����(���ͷ�, ����, ����)���� ����.��� ������ ���� ��ȯ(����)�Ѵ�.
		// �μ�ȿ�� : ������ ���� ��ȯ�ϴ� �� �̿� �����ϴ� ��� �۾��� �μ�ȿ���� �Ѵ�.
		a = 10;
		
		//post increment(a++) : ��ȯ���� a, �μ�ȿ���� a = a + 1; 
		b = a++;
		System.out.println("a = "+ a + " b = "+ b); // "a = "�� ���ڿ�, +�� ������
		
		// pre increment(++a) : ��ȯ���� a + 1, �μ�ȿ���� a = a + 1; 
		b = ++a;
		System.out.println("a = "+ a + " b = "+ b); // "a = "�� ���ڿ�, +�� ������
		
		// Java�� �ο� �ڷ����� true/false ���ͷ��� ����Ѵ�.
		// ���������� �ǿ����ڴ� �ο� ���� �Ǵ� ���ͷ��� ����ؾ� �Ѵ�.
		// ���迬����(>, <, <=, >=, ==, !=)�� �ο� ���� ��ȯ�Ѵ�.
		boolean bb;
		bb = true || false;
		//bb = false;
		System.out.println("bb = " + bb);
		System.out.println((1>0));
		System.out.println((1<0));
		
		// Java���� ����� �����Ϸ��� final Ű���带 ����ؾ� �Ѵ�. 
		// final ������ ���ٲ۴�.
		final int c = 100;
		// C = 1000; // error
		int d;
		d = a + c;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		// �Ҽ��� �ڷ��� (float, double)
		float ff;
		double gg;
		ff = 3.14f;
		gg = 3.14; // ���ͷ� "3.14"�� �ڷ����� double�̴�.
		System.out.println("ff = "+ ff + " gg = "+ gg);
		
		// ����ȯ(casting) : ������ �ڷ������� ��ȯ�Ѵ�. �߿�!
		int x = 10;
		double y = 100.34;
		x = (int) y; // explicit cast
		// y = (double) x; // implicit cast
		System.out.println("x = " + x + " y = "+ y);
		
		System.out.println("Helloooo " + "Worldddd ");

		
	}

}
