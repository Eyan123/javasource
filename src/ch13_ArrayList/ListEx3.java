package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		
		String fruit[] = {"사과","포도","딸기","자두","수박"};
		
		// 기존 배열을 어레이리스트로 변형
		List<String> list1 = Arrays.asList(fruit);
		
		System.out.println(list1);
		
        // list1.add("메론"); // 기존 배열 변형체에 추가는 불가함 
		
		List<String> list2 = new ArrayList<String>(Arrays.asList(fruit));

		list2.add("메론");
		System.out.println(list2);
	}
}
