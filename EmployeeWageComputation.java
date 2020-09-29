public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		int present = 1;
		double emp_check = Math.floor(Math.random() * 10) % 2;
		if(emp_check == present){
			System.out.println("Employee is present");
		}
		else{
			System.out.println("Employee is absent");
		}
	
	}

}
