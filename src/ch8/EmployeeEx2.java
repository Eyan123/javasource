package ch8;

public class EmployeeEx2 {
	public static void main(String[] args) {
		
		Worker worker = new Worker();
		
		Employee employee = new Employee();
		employee.setName("무야호");
		employee.setPosition("사원");
		worker.work(employee);
		
		//Employee ceo = new Ceo();
		Ceo ceo = new Ceo();
		ceo.setName("김사장");
		ceo.setPosition("사장");
		worker.work(ceo);
		
		//Employee admin = new Admin();
		Admin admin = new Admin();
		admin.setName("김관리");
		admin.setPosition("관리자");
		worker.work(admin);
		
		
	}
	
	public static void work(Employee employee) {
		employee.work();
	}
	
}
