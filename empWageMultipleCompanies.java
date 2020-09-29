public class empWageComputation {
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	
	private final String company;
	private final int emp_wage_per_hr;
	private final int max_working_days;
	private final int max_hrs_in_month;
	private int total_empWage = 0;
	
	public empWageCalculator(String company, int emp_wage_per_hr, int max_working_days, int max_hrs_in_month) {
		this.company = company;
		this.emp_wage_per_hr = emp_wage_per_hr;
		this.max_working_days = max_working_days;
		this.max_hrs_in_month = max_hrs_in_month;
	}
	
	//Method to calculate employee wage
	public void calculateEmpWage() {
		//variables
		int empHrs = 0;
		int total_empHrs = 0;
		int total_working_days = 0;
		
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
		
		/*
		if(total_empHrs >= max_hrs_in_month)
			total_empHrs = max_hrs_in_month;															//if total hrs exceeds max hrs per month then computing for max hrs per month
		*/
		
		total_empWage = total_empHrs * emp_wage_per_hr;
	}
	
	//@override
	public String toString() {
		return "Total Emp Wage for company '"+company+"' is : "+total_empWage;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		empWageCalculator dMart = new empWageCalculator("DMart", 20, 2, 10);
		empWageCalculator reliance = new empWageCalculator("Reliance", 10, 4, 20);
		dMart.calculateEmpWage();
		System.out.println(dMart);
		reliance.calculateEmpWage();
		System.out.println(reliance);
				
	}
}