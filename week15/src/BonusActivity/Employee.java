package BonusActivity;

public class Employee {
	public String name;
	public double hours;
	public double totalPay = 0;
	public final double HOUR_RATE = 15;
	public final double OVERTIME_HOUR_RATE = 16.5;

	public Employee(String name, double hours) {
		super();
		this.name = name;
		this.hours = hours;
		setTotalPay(this.hours);
		this.totalPay = getTotalPay();

	}
	

	public String getName() {
		return name;
	}


	public double getHours() {
		return hours;
	}


	public double getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(double hours) {

		if (hours <= 40)
			totalPay = HOUR_RATE * hours;
		
		else
			totalPay = (hours - 40) * OVERTIME_HOUR_RATE + 40 * HOUR_RATE;
	}

}
