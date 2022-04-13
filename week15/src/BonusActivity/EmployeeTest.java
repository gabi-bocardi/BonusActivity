package BonusActivity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testSetTotalPay() {
		Employee emp = new Employee("Gabby", 0);
		emp.setTotalPay(48.0);
		assertEquals(732.0, emp.getTotalPay(),0.05);
	}

}
