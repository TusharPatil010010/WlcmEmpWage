import java.util.*;

public class empWageMultipleCompanies implements calculateWageInterface{
	public static final int is_part_time = 1;
	public static final int is_full_time = 2;
	
	private List<companyEmpWage> companyEmpWageList;																		//creating list	
	
	public empWageBuilder() {
		companyEmpWageList = new ArrayList<companyEmpWage>();																//initiating list
	}
	
	public void addcompanyEmpWage(String company, int emp_wage_per_hr, int max_working_days, int max_hrs_in_month) {
		//creating companyEmpWage obj and adding it to list

		companyEmpWageList.add(new companyEmpWage(company, emp_wage_per_hr, max_working_days, max_hrs_in_month));					
	}
	
	public void computeEmpWage() {																			//calling method to calculate wage and print

		for(int i = 0; i < companyEmpWageList.size(); i++) {
			companyEmpWageList.get(i).setTotalEmpWage(calculateEmpWage(companyEmpWageList.get(i)));
			System.out.println(companyEmpWageList.get(i));
		}
	}

	//Method to calculate employee wage
	private int calculateEmpWage(companyEmpWage com) {
		
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
		ewb.addcompanyEmpWage("DMart", 20, 2, 10);
		ewb.addcompanyEmpWage("Reliance", 10, 4, 20);
		ewb.computeEmpWage();	
	}
}