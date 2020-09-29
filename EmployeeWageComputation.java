public class EmployeeWageComputation{
	public static void main(String[] args){
		//constants
		int present = 1;
		int wage_per_hour = 20;
		//variables
		int hours_worked = 0;
		int emp_wage = 0;
		int emp_check = (int)Math.floor(Math.random() * 10) % 2;
		
		if(emp_check == present){
			hours_worked = 10;
		}
		else{
			hours_worked = 0;
		}
		emp_wage = hours_worked * wage_per_hour;
		System.out.println("Daily emp wage is : " + emp_wage);
	
	}
}
