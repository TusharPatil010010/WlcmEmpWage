public interface calculateWageInterface {

	public void addCompanyEmpWage(String company, int emp_wage_per_hr, int max_working_days, int max_hrs_in_month);
	public void computeEmpWage();
	public int getTotalWage(String company);
}