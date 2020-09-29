public class companyEmpWage {

	public final String company;
	public final int emp_wage_per_hr;
	public final int max_working_days;
	public final int max_hrs_in_month;
	public int total_empWage;
	public List<Integer> dailyWages;
	
	public companyEmpWage(String company, int emp_wage_per_hr, int max_working_days, int max_hrs_in_month) {
		this.company = company;
		this.emp_wage_per_hr = emp_wage_per_hr;
		this.max_working_days = max_working_days;
		this.max_hrs_in_month = max_hrs_in_month;
		dailyWages = new ArrayList<Integer>();
	}
	
	public void setTotalEmpWage(int total_empWage) {
		this.total_empWage = total_empWage;
	}
	
	public void setDailyEmpWage(List<Integer> dailyWages) {
		this.dailyWages = dailyWages;
	}

	public String toString() {
		String str = "Total Emp Wage for company '"+company+"' is : "+total_empWage;
		str += "\nDaily Wages :";
		for(int i = 0; i < dailyWages.size(); i++) {
			str = str + " " + dailyWages.get(i);
		}
		return str;
	
}