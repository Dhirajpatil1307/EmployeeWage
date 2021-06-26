package employee_wage_computation;

public class EmpWageBuilderUC1 {

	public static void main(String[] args) {
		// Constants
		int is_full_time = 1;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == 1) {
			System.out.println("Employee Is Present");
		} else {
			System.out.println("Employee Is Absent");
		}

	}

}
