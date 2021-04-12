package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListEx7 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>(2000000);
		List<String> linkedList = new LinkedList<String>();
		
		System.out.println("=====순차적인 추가=====");
		System.out.println("ArrayList : "+add1(arrayList));
		
	}
	
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list.add(500, "X");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list.add(500, "X");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
}
