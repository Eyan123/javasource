package ch13_ArrayList;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {
	public static void main(String[] args) {
		//K : Key를 무슨 타입을 담을 것인지 지정
		//V : Value를 무슨 타입으로 담을것인지 지정
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("id_d123", "스즈카");
		map.put("id_d124", "테이오");
		map.put("id_d125", "마치탄");
		map.put("id_d126", "트윈터보");
		
		System.out.println("키에 해당하는 값 가져오기 : " + map.get("id_d125"));
		System.out.println("키가 존재하는지 확인 : " + map.containsKey("id_d125"));
		System.out.println("값이 존재하는지 확인 : " + map.containsValue("마치탄"));
		System.out.println("map이 비어있는지 확인 : " + map.isEmpty());
		System.out.println("map 크기 : " + map.size());
		System.out.println("map 요소 삭제 : " + map.remove("id_d126"));
		
		System.out.println(map);
		
		//Key 값만 가져오기
		System.out.println(map.keySet());
		
		//value 값만 가져오기
		System.out.println(map.values());
		
		
	}
	
	
}
