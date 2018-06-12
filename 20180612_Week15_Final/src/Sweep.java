import java.util.*;

public class Sweep {

	public static void main(String[] args) {
		Set<String> strs;
//		strs = new HashSet<>(); // HashTable이기 때문에 순서가 다르다.
//		strs = new TreeSet<>(); // TreeTable은 이름순으로 오름차순 정렬된다.
		strs = new LinkedHashSet<>(); // LinkedHashSet은 입력 순으로 저장된다.
		
		// 기본적 메소드 add(), remove(), sweep() ....
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		strs.add("가");
		strs.add("나");
		strs.add("다");
		strs.add("0");
		// 첫 번째 흝는 방법 : iterator 사용
		Iterator<String> e = strs.iterator(); // 원소들을 흝을 수 있는 기능
		while(e.hasNext()) { // 끝까지 흝는다는 뜻.
			String str = e.next();
			System.out.println(str);
		}
		
		// 두 번째 흝는 방법 : for 반복문 사용
		for(String str1 : strs) { // for(요소타입 참조변수 : 콜렉션변수)
			System.out.println(str1);
		}
		
		
		
		
		
	}

}
