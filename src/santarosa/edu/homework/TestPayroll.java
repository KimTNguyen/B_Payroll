/** 
 * TestPayroll is a main class which tests the payroll system by using payroll object to calculate wage for multiple Employee objects.
 * 
 * @author	Kim Nguyen
 * @version	%I%, %G%
 * @since 	1.0
 */

package santarosa.edu.homework;

import java.util.ArrayList;

public class TestPayroll {

	public static void main(String[] args) {
		int noEmployees = 5;
		ArrayList<Employee> employeeList = new ArrayList<>();
		double[] baseRate = { 7.5, 8.2, 10, 15, 10 };
		int[] hours = { 35, 47, 73, 55, 50 };

		// generates multiple Employee objects and assigns values for their name
		// fields
		for (int i = 1; i <= noEmployees; ++i) {
			employeeList.add(new Employee());
			employeeList.get(i - 1).setName(Integer.toString(i));
		}

		Payroll payroll = new Payroll();

		// performs wage calculation for each employee objects
		for (Employee employee : employeeList) {
			payroll.calculate(employee, baseRate[employeeList.indexOf(employee)],
					hours[employeeList.indexOf(employee)]);
		}
	}

}
