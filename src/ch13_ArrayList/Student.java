package ch13_ArrayList;


public class Student implements Comparable<Student>{
	private String name;
	private Integer java;

	public Student(String name, Integer java) {
		super();
		this.name = name;
		this.java = java;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + ":" + java;
	}

	@Override
	public int compareTo(Student o) {
		//return this.name.compareTo(o.name); // 오름차순
		//return o.name.compareTo(this.name);   // 내림차순
		
		//java 점수 정렬
		return this.java.compareTo(o.java);
		
	}

	
	
	
}
