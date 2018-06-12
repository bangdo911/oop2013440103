import java.util.*;

public class TestMap {

	public static void main(String[] args) {
//		Map<String, String> map = new HashMap<>();
//		Map<String, String> map = new TreeMap<>();
		Map<String, String> map = new LinkedHashMap<>();
		
		// 추가 : put(key, value) : value찾기, get(key)
		map.put("재이니", "청와대"); // 재이니 : 키, 청와대 : 값
		map.put("트럼프", "백악관");
		map.put("정으니", "피양");
		
		
		
		System.out.println(map.get("재이니")); // 키값을 입력하면 값을 반환한다.
		System.out.println(" ");
		
		// Focus : 흝는 방법
		// http://stove99.tistory.com/96 참고
		
		// 1. iterator 이용
//		Iterator<String> itr = map.ketSet().iterator();
		Set<String> set = map.keySet(); // map.set() : map에 저장된 엔트리(키, 값) 중 키만 모은 셋
		Iterator<String> itr = set.iterator(); 
		while(itr.hasNext()) { // 끝까지 흝는다는 뜻.
			String key = itr.next();
			System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
		}
		System.out.println(" ");
		
		// 2. 키셋을 만들어 for문 사용
		for(String key : map.keySet()) { 
			System.out.println(String.format("키 : %s, 값 : %s", key, map.get(key)));
		}
		System.out.println(" ");
		
		// 3. 엔트리 셋을 만들어 for문 사용
		for( Map.Entry<String, String> elem : map.entrySet() ){
            System.out.println( String.format("키 : %s, 값 : %s", elem.getKey(), elem.getValue()) );
        }

	}

}
