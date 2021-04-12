package ch13_ArrayList;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx1 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("박신오");
		queue.offer("스페쨩");
		queue.offer("테이오");
		queue.offer("스즈카");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
	}
	
}
