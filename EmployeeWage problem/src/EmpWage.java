
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage problems");

		int Wage_per_hour = 20;
		int full_day_hour = 2;
		int part_time_hour = 1;
		int IS_FULL_TIME = 1;
		double empCheck = Math.floor(Math.random() * 10 % 2);
		System.out.println(empCheck);

		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee Is Present");
		else
			System.out.println("Employee Is Absent");

		int Emphour = 0;
		int Employeewage = 0;
		if (empCheck == full_day_hour)
			Emphour = 8;
		else
			Emphour = 0;
		Employeewage = Emphour * Wage_per_hour;
		System.out.println("Employee_Daily_Wage" + Employeewage);

		 if (empCheck==part_time_hour)
			   Emphour=4;
		   else if(empCheck==full_day_hour)
			   Emphour=8;
		   Employeewage = Emphour * Wage_per_hour ;
		   System.out.println("Employee_Daily_Wage" + Employeewage);
	}
}
