package santarosa.edu.homework;

import java.util.ArrayList;

public class TestPayroll {

	public static void main(String[] args) {
		int noEmployees = 5;
		ArrayList<Employee> employeeList = new ArrayList<>();
		double[] baseRate = { 7.5, 8.2, 10, 15, 10 };
		int[] hours = { 35, 47, 73, 55, 50 };

		for (int i = 1; i <= noEmployees; ++i) {
			employeeList.add(new Employee());
			employeeList.get(i - 1).setName(Integer.toString(i));
		}

		Payroll payroll = new Payroll();

		for (Employee employee : employeeList) {
			payroll.calculate(employee, baseRate[employeeList.indexOf(employee)],
					hours[employeeList.indexOf(employee)]);
		}
	}

}
