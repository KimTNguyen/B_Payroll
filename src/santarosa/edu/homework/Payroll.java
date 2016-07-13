package santarosa.edu.homework;

public class Payroll {
	private int hours;
	private double basePay;
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public void calculate(Employee employee, double basePay, int hours) {
		int baseHours = 40;
		float overtime = 1.5f;

		this.setEmployee(employee);
		this.setBasePay(basePay);
		this.setHours(hours);

		if (basePay < 8.0) {
			System.out.println("rate is less than minimum wage");
			return;
		}

		if (hours > 60) {
			System.out.println("number of hours greater than 60");
			return;
		}

		if (hours <= baseHours) {
			this.getEmployee().setWage(this.getBasePay() * this.getHours());
		} else {
			int over = this.getHours() - baseHours;
			double baseWage = this.getBasePay() * baseHours;
			double overtimeWage = this.getBasePay() * overtime * over;
			this.getEmployee().setWage(baseWage + overtimeWage);
		}

		System.out.println(this.getEmployee().getName() + " wages: " + this.getEmployee().getWage());
	}

}
