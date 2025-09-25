public class Main2 {
	public static void main(String [] args) {
		Department dept = new Department("Sales");
		
		fullTimeEmployee f1 = new fullTimeEmployee("Saad", 120000);
		partTimeEmployee p1 = new partTimeEmployee("Aqueel", 1500,60);
		
		dept.addEmployee(f1);
		dept.addEmployee(p1);
		
		dept.showSalaries();
	}
}