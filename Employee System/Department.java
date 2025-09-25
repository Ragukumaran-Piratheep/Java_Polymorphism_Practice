import java.util.*;
public class Department {
	private String deptName;
	private list<Employee> employee;
	
	Department(String deptName) {
		this.deptName = deptName;
		employees = new ArrayList<>();
	}
	
	public void addEmployees(Employee e) {
		employees.add(e);
	}
	
	public void showSalaries() {
		Syatem.out.println("Salaries in department "+deptName);
		for(Employee e : employees) {
			System.out.println(e.name+" earns: $"+e.calculateSalary());
		}
	}
}