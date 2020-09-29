public class empWageMultipleCompanies implements calculateWageInterface {
	//Global variables
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
		
	public empWageBuilder() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	private void addCompanyEmpWage(String company, int emp_wage_per_hr, int max_working_days, int max_hrs_in_month) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, emp_wage_per_hr, max_working_days, max_hrs_in_month);
		numOfCompany++;
	}
	
	private void computeEmpWage() {
		for(int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(calculateEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}
	//Method to calculate employee wage
	private int calculateEmpWage(CompanyEmpWage com) {
		//variables
		int empHrs = 0;
		int total_empHrs = 0;
		int total_working_days = 0;
		int total_empWage = 0;
		
		//computation
		while(total_empHrs <= com.max_hrs_in_month && total_working_days < com.max_working_days) {
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
		
		total_empWage = total_empHrs * com.emp_wage_per_hr;
		return total_empWage;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		calculateWageInterface ewb = new empWageBuilder();
		ewb.addCompanyEmpWage("DMart", 20, 2, 10);
		ewb.addCompanyEmpWage("Reliance", 10, 4, 20);
		ewb.computeEmpWage();	
	}
}