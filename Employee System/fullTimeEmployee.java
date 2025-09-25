public class fullTimeEmployee extends Employee {
	private double monthlySalary;
	
	fullTimeEmployee(String name, double monthlySalary) {
		super(name);
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	double calculateSalary(){
		return monthlySalary;
	}
}
