package sec3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("김효민", 100);
		map.put("김진실", 95);
		map.put("김소정", 90);
		map.put("박다연", 85);
		map.put("정아희", 80);
		System.out.println("저장된 데이터 건수: "+map.size());
		System.out.println("김효민의 점수"+map.get("김효민"));
		System.out.println("김진실의 점수"+map.get("김진실"));
		map.remove("박다연");
		//key와 value분리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key: "+key+", value: "+value);
		}

	}

}
