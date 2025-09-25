public class partTimeEmployee extends Employee {
	private double hourlyRate;
	private int hoursWorked;
	
	partTimeEmployee(String name, double hourlyRate, int hoursWorked) {
		super(name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	double calculateSalary() {
		return hourlyRate*hoursWorked;
	}
}