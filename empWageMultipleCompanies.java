public class empWageMultipleCompanies {
	
	//Global constants
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	
	//Method to calculate employee wage
	public static int calculateEmpWage(String company, int emp_wage_per_hr,int max_working_days,int max_hrs_in_month) {
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
			case is_part_time:
				empHrs = 8;
				break;
			case is_full_time:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			total_empHrs += empHrs;
			System.out.println("Day : "+total_working_days+" Emp Hrs : "+empHrs );
		}
		
		//if total hrs exceeds max hrs per month then computing for max hrs per month
		
		System.out.println("Total emp hrs : "+total_empHrs);
		total_empWage = total_empHrs * emp_wage_per_hr;
		System.out.println("Total Emp wage for Company '"+company+"' is : "+total_empWage);
				
		return total_empWage;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		calculateEmpWage("DMart", 20, 2, 10);
		calculateEmpWage("Reliance", 10, 4, 20);
				
	}
}