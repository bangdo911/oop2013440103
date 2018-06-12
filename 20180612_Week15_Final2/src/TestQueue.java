import java.util.*;

public class TestQueue {

	public static void main(String[] args) {
		Queue<String> strs;
//		strs = new LinkedList<>();
		strs = new PriorityQueue<>();
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		while(!strs.isEmpty()) {
			System.out.println(strs.remove());
		}
		
	}

}
