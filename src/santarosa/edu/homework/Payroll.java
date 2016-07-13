/**
 * Payroll holds necessary information such as employees, pay rate and hour working to perform wage calculation.
 * 
 * @author Kim Nguyen
 * @version %I%, %G%
 * @since 1.0
 */

package santarosa.edu.homework;

public class Payroll {
	private int hours;
	private double basePay;
	private Employee employee;

	/**
	 * Gets the employee which has their wage calculated
	 * 
	 * @return <code>Employee</code> which has their wage calculated
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * Sets the employee to have their wage calculated
	 * 
	 * @param employee
	 *            the employee to have their wage calculated
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * Gets the pay rate of the employee
	 * 
	 * @return <code>double</code> the pay rate of the employee
	 */
	public double getBasePay() {
		return basePay;
	}

	/**
	 * Sets the pay rate of the employee
	 * 
	 * @param basePay
	 *            the pay rate of the employee
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}

	/**
	 * Gets the number of hours the employee worked in a week
	 * 
	 * @return <code>int</code> the number of hours the employee worked in a
	 *         week
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * Sets the number of hours the employee worked in a week
	 * 
	 * @param hours
	 *            the number of hours the employee worked in a week
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}

	/**
	 * Calculates the weekly wage of the employee. The methods prints out error
	 * messages if either the base rate is less than 8.0 or the working hour is
	 * greater than 60. The wage will be multiply by 1.5 for every overtime
	 * working hour.
	 * 
	 * @param employee
	 *            the employee to have wage calculated
	 * @param basePay
	 *            the base rate of the employee
	 * @param hours
	 *            the number of hours the employee worked in a week
	 */
	public void calculate(Employee employee, double basePay, int hours) {
		int baseHours = 40;
		float overtime = 1.5f;
		double wage = 0.0d;

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
			wage = this.getBasePay() * this.getHours();
		} else {
			int over = this.getHours() - baseHours;
			double baseWage = this.getBasePay() * baseHours;
			double overtimeWage = this.getBasePay() * overtime * over;
			wage = baseWage + overtimeWage;
		}

		System.out.println(this.getEmployee().getName() + " wages: " + wage);
	}

}
