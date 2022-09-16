	
public class EmpWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage problems");

		int Wage_per_hour = 20;
		int full_day_hour = 2;
		int part_time_hour = 1;
		int IS_FULL_TIME = 1;
		int num_of_workday = 20;
		int Maxhrinmonth = 100;

		double empCheck = Math.floor(Math.random() * 10 % 2);
		System.out.println(empCheck);

		if (empCheck == IS_FULL_TIME)
			System.out.println("Employee Is Present");
		else
			System.out.println("Employee Is Absent");

		int Emphour = 0;
		int Employeewage = 0;
		int totalempwage = 0;
		int totalemphour = 0;
		int totalworkday = 0;

		if (empCheck == full_day_hour)
			Emphour = 8;
		else
			Emphour = 0;
		Employeewage = Emphour * Wage_per_hour;
		System.out.println("Employee_Daily_Wage" + Employeewage);

		if (empCheck == part_time_hour)
			Emphour = 4;
		else if (empCheck == full_day_hour)
			Emphour = 8;
		Employeewage = Emphour * Wage_per_hour;
		System.out.println("Employee_Daily_Wage" + Employeewage);

		int empCheckCase = (int) Math.floor(Math.random() * 10 % 3);
		switch (empCheckCase) {
		case 0:
			part_time_hour: Emphour = 4;
			break;
		case 1:
			full_day_hour: Emphour = 8;
			break;
		default:
			Emphour = 0;
		}
		Employeewage = Emphour * Wage_per_hour;
		System.out.println("Employee_Daily_Wage" + Employeewage);

		for (int day = 0; day < num_of_workday; day++) {
			switch (empCheckCase) {
			case 1:
				part_time_hour: Emphour = 4;
				break;
			case 2:
				full_day_hour: Emphour = 8;
				break;
			default:
				Emphour = 0;
			}
			Employeewage = Emphour * Wage_per_hour;
			totalempwage += Employeewage;
			System.out.println("Employee_Daily_Wage" + Employeewage);
		}
		System.out.println("Total Empoyee Wage: " + totalempwage);

		while (totalemphour <= 100 && totalworkday < 20) {
			totalworkday++;

			switch (empCheckCase) {
			case 1:
				part_time_hour: Emphour = 4;
				break;
			case 2:
				full_day_hour: Emphour = 8;
				break;
			default:
				Emphour = 0;
			}
			totalemphour += Emphour;
			System.out.println("day#:" + totalworkday + "Employee_Daily_Wage: " + Emphour);
		}
		int Totalempwage = totalemphour * Wage_per_hour;
		System.out.println("Total emp Wage : " + Totalempwage);
	}
	public class EmpWageClassMethod {
		public static final int Wage_per_hour = 20;
		public static final int full_day_hour = 2;
		public static final int part_time_hour = 1;
		public static final int num_of_workday = 20;
		public static final int Maxhrinmonth = 100;

		public static int computeEmpWage() {

			int emphour = 0;
			int totalemphour = 0;
			int totalworkdays = 0;

			while (totalemphour <= Maxhrinmonth && totalworkdays < num_of_workday) {
				totalworkdays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (empCheck) {
				case part_time_hour:
					emphour = 4;
					break;
				case full_day_hour:
					emphour = 8;
					break;
				default:
					emphour = 0;
				}
				totalemphour += emphour;
				System.out.println("Day#: " + totalworkdays + " Employee Hour:" + emphour);
			}
			int totalEmpWage = totalemphour * Wage_per_hour;
			System.out.println("Total Employee Wage: " + totalEmpWage);
			return totalEmpWage;
		}

		public static void main(String[] args) {
			computeEmpWage();
		}

	}
	public class EmpWageMultiCompany {

		public static final int full_day_hour = 2;
		public static final int part_time_hour = 1;

		public static int computeEmpWage(String Company, int Wage_per_hour, int num_of_workday, int Maxhrinmonth ) {
			int emphour = 0;
			int totalemphour = 0;
			int totalworkdays = 0;

			while (totalemphour <= Maxhrinmonth && totalworkdays < num_of_workday) {
				totalworkdays++;
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				switch (empCheck) {
				case part_time_hour:
					emphour = 4;
					break;
				case full_day_hour:
					emphour = 8;
					break;
				default:
					emphour = 0;
				}
				totalemphour += emphour;
				System.out.println("Day#: " + totalworkdays + " Employee Hour:" + emphour);
			}
			int totalEmpWage = totalemphour * Wage_per_hour;
			System.out.println("Total Employee Wage for Company: " +Company+" is: " +totalEmpWage);
			return totalEmpWage;
		}

		public static void main(String[] args) {
			computeEmpWage("DMart", 20, 2, 10);
			computeEmpWage("Reliance", 10, 4, 20);
		}

	}
}
