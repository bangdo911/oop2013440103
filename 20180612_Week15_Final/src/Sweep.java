import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs;
//		strs = new HashSet<>(); // HashTable�̱� ������ ������ �ٸ���.
//		strs = new TreeSet<>(); // TreeTable�� �̸������� �������� ���ĵȴ�.
		strs = new LinkedHashSet<>(); // LinkedHashSet�� �Է� ������ ����ȴ�.
		
		// �⺻�� �޼ҵ� add(), remove(), sweep() ....
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		strs.add("��");
		strs.add("��");
		strs.add("��");
		strs.add("0");
		// ù ��° �y�� ��� : iterator ���
		Iterator<String> e = strs.iterator(); // ���ҵ��� �y�� �� �ִ� ���
		while(e.hasNext()) { // ������ �y�´ٴ� ��.
			String str = e.next();
			System.out.println(str);
		}
		
		// �� ��° �y�� ��� : for �ݺ��� ���
		for(String str1 : strs) { // for(���Ÿ�� �������� : �ݷ��Ǻ���)
			System.out.println(str1);
		}
		
		
		
		
		
	}

}
