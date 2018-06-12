import java.util.*;

public class TestMap {

	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<>();
//		Map<String, String> map = new TreeMap<>();
		Map<String, String> map = new LinkedHashMap<>();
		
		// �߰� : put(key, value) : valueã��, get(key)
		map.put("���̴�", "û�ʹ�"); // ���̴� : Ű, û�ʹ� : ��
		map.put("Ʈ����", "��ǰ�");
		map.put("������", "�Ǿ�");
		
		
		
		System.out.println(map.get("���̴�")); // Ű���� �Է��ϸ� ���� ��ȯ�Ѵ�.
		System.out.println(" ");
		
		// Focus : �y�� ���
		// http://stove99.tistory.com/96 ����
		
		// 1. iterator �̿�
//		Iterator<String> itr = map.ketSet().iterator();
		Set<String> set = map.keySet(); // map.set() : map�� ����� ��Ʈ��(Ű, ��) �� Ű�� ���� ��
		Iterator<String> itr = set.iterator(); 
		while(itr.hasNext()) { // ������ �y�´ٴ� ��.
			String key = itr.next();
			System.out.println(String.format("Ű : %s, �� : %s", key, map.get(key)));
		}
		System.out.println(" ");
		
		// 2. Ű���� ����� for�� ���
		for(String key : map.keySet()) { 
			System.out.println(String.format("Ű : %s, �� : %s", key, map.get(key)));
		}
		System.out.println(" ");
		
		// 3. ��Ʈ�� ���� ����� for�� ���
		for( Map.Entry<String, String> elem : map.entrySet() ){
            System.out.println( String.format("Ű : %s, �� : %s", elem.getKey(), elem.getValue()) );
        }

	}

}
