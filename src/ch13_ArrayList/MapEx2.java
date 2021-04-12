package ch13_ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		//K : Key를 무슨 타입을 담을 것인지 지정
		//V : Value를 무슨 타입으로 담을것인지 지정
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("테이오", 85);
		map.put("스즈카", 100);
		map.put("맥퀸", 24);
		map.put("마치탄", 56);
		
		Set<String> keySet =map.keySet();
		
		Iterator<String> KeyIterator = keySet.iterator();
		
		while(KeyIterator.hasNext()) {
			String key = KeyIterator.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		
	}
	
	
}
