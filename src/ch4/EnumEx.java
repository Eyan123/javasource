package ch4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class EnumEx {
	public static void main(String[] args) {
		Week today = null;
		
		// 오늘 날짜
		LocalDate now = LocalDate.now();
//		System.out.println(now);
		
		// 오늘에 해당하는 숫자 확인하기
		DayOfWeek week = now.getDayOfWeek();
		System.out.println(week.getValue()); // 1번 월요일~7번 일요일
		
		switch(week.getValue()) {
		
		case 1 : 
			today = Week.MONDAY;
			break;
		
		case 2 : 
			today = Week.TUESDAY;
			break;
			
		case 3 : 
			today = Week.WEDNESDAY;
			break;
			
		case 4 : 
			today = Week.THURSDAY;
			break;
			
		case 5 : 
			today = Week.FRIDAY;
			break;
			
		case 6 : 
			today = Week.SATURDAY;
			break;
			
		case 7 : 
			today = Week.SUNDAY;
			break;
			
		}
		System.out.println("오늘 요일 : " + today);
		if(today==Week.SUNDAY) {
			System.out.println("일요일은 쉽니다");
		}else {
			System.out.println("우효ww");
		}
		
		
	}
}