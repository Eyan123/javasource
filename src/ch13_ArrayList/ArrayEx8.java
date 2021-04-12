package ch13_ArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayEx8 {
	public static void main(String[] args) {
		Student[] student = new Student[5];
		
		student[0] = new Student("테이오", 88);
		student[1] = new Student("스즈카", 90);
		student[2] = new Student("마치탄", 12);
		student[3] = new Student("에바바", 43);
		student[4] = new Student("안오름", 55);
		
		// 사용자 정의 클래스를 sort 시킬때 java.lang.ClassCastException 발생
		// 예외를 막기 위해서는 Comparable 인터페이스를 구현
		
		Arrays.sort(student); // 오름차순
		
		Arrays.sort(student, Comparator.reverseOrder()); // 간단하게 내림차순
		
		
		
		//Arrays.toString(배열명) => 객체가 가지고 있는 toString의 형태로 리턴
		System.out.println(Arrays.toString(student));
		
	}
}
