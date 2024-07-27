package collection.map;

import java.util.HashMap;

public class MapMain2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		// 같은 키에 저장시 기존 값이 교체된다.
		map.put("A", 90);
		map.put("A", 100);
		System.out.println(map);

		// containsKey : 해당 키를 갖고 있는지 체크
		boolean b = map.containsKey("A");
		System.out.println("b = " + b);

		// remove : 해당 키와 그 값을 제거
		Integer removed = map.remove("A");
		System.out.println("removed = " + removed);

		// putIfAbsent : 키가 없는 경우에만 추가
		map.put("A", 100);
		map.putIfAbsent("A", 0);
		System.out.println(map);
	}

}
