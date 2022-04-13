package BonusActivity;

public class EmployeeDemo {

	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Gabby", 35);
		display(emp);
		Employee emp2 = new Employee("Dennis", 45);
		display(emp2);
		
	}
	
	public static void display(Employee emp) {
		System.out.println("Employee name: "+emp.getName()+" hours: "+emp.getHours()+ " Total Salary: "+emp.getTotalPay());
	}

}
