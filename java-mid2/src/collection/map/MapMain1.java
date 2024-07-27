package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Integer> studentMap = new HashMap<>();

		// put : 데이터 추가
		studentMap.put("A", 90);
		studentMap.put("B", 80);
		studentMap.put("C", 80);
		studentMap.put("D", 100);
		System.out.println(studentMap);

		// get : 특정 값 조회
		Integer result = studentMap.get("D");
		System.out.println("result = " + result);

		// keySet : 맵의 '키'들을 Set 형태로 반환
		Set<String> keySet = studentMap.keySet();
		for (String key : keySet){
			Integer value = studentMap.get(key);
			System.out.println("key = " + key);
			System.out.println("value = " + value);
		}

		// values : 맵의 '값'들을 Collection 형태로 반환
		Collection<Integer> values = studentMap.values();	// List가 아니라 상위 타입인 Collection 타입이다. (순서 보장 X)
		for (Integer value : values) {
			System.out.println("value = " + value);
		}

		// entrySet : 맵의 '키-값' 쌍을 Set<Map.Entry<K,V>> 형태로 반환
		// Entry란 key와 value를 저장하는 객체
		Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println("entry.getKey() = " + entry.getKey());
			System.out.println("entry.getValue() = " + entry.getValue());
		}

	}

}
