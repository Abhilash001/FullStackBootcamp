import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		
		System.out.println(map.get(2));
		System.out.println(map);
		Set<Integer> keys = map.keySet();
		Collection<String> values = map.values();
		System.out.println(keys);
		System.out.println(values);
		
	}
}
