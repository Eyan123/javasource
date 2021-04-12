package ch13_ArrayList;

import java.util.HashSet;
import java.util.Set;

// 저장순서 유지되지 않음, 객체 중복저장 불가

public class SetEx1 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("git");
		set.add("jdbc");
		set.add("MySQL");
		set.add("swing");
		set.add("jdbc");
		
		System.out.println(set);
		
		System.out.println("jdbc 포함 여부 : " + set.contains("jdbc"));
		System.out.println("set 크기 : " + set.size());
		System.out.println("특정 객체 삭제 : " + set.remove("swing"));
		
		for(String str : set) {
			System.out.println(str);
		}
		
	}
}
