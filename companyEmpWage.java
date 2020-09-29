public class companyEmpWage {

	public final String company;
	public final int emp_wage_per_hr;
	public final int max_working_days;
	public final int max_hrs_in_month;
	public int total_empWage;
	
	public companyEmpWage(String company, int emp_wage_per_hr, int max_working_days, int max_hrs_in_month) {
		this.company = company;
		this.emp_wage_per_hr = emp_wage_per_hr;
		this.max_working_days = max_working_days;
		this.max_hrs_in_month = max_hrs_in_month;
	}
	
	public void setTotalEmpWage(int total_empWage) {
		this.total_empWage = total_empWage;
	}
	
	public String toString() {
		return "Total Emp Wage for company '"+company+"' is : "+total_empWage;
	}
}