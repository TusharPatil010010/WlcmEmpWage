public class EmpWageCompute {
	//Global constants
	static final int is_part_time = 1;
	static final int is_full_time = 2;
	
	//Method to calculate employee wage
	public static int calculateEmpWage(int emp_wage_per_hr,int max_working_days,int max_hrs_in_month) {
		//variables
		int empHrs = 0;
		int total_empHrs = 0;
		int total_working_days = 0;
		int total_empWage = 0;
		
		//computation
		while(total_empHrs <= max_hrs_in_month && total_working_days < max_working_days) {
			total_working_days++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			
			switch(empCheck) {
			case is_part_time:			//Part time
				empHrs = 8;
				break;
			case is_full_time:			//Full time
				empHrs = 8;
				break;
			default:				
				empHrs = 0;
				break;
			}
			total_empHrs += empHrs;
			System.out.println("Day : "+total_working_days+" Emp Hrs : "+empHrs );
		}
		if(total_empHrs >= max_hrs_in_month)
			total_empHrs = max_hrs_in_month;															//if total hrs exceeds max hrs per month then computing for max hrs per month
		
		total_empWage = total_empHrs * emp_wage_per_hr;
				
		return total_empWage;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		//constants
		int emp_wage_per_hr = 20;
		int max_working_days = 20;
		int max_hrs_in_month = 100;
		//variables
		int total_empWage = 0;
		
		//computation
		total_empWage = calculateEmpWage(emp_wage_per_hr, max_working_days, max_hrs_in_month);
		System.out.println("Total Employee Wage : "+total_empWage);
				
	}
}