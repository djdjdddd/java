package collection.map;

import java.util.*;

public class JavaMapMain {

	public static void main(String[] args) {
		run(new HashMap<>());
		run(new LinkedHashMap<>());
		run(new TreeMap<>());
	}

	public static void run(Map<String, Integer> map){
		System.out.println("map.getClass() = " + map.getClass());
		map.put("C", 10);
		map.put("A", 10);
		map.put("B", 10);
		map.put("1", 10);
		map.put("2", 10);

		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println("entry.getKey() = " + entry.getKey());
			System.out.println("entry.getValue() = " + entry.getValue());
		}
	}

}
