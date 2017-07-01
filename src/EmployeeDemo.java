
public class EmployeeDemo {

	public static void main(String[] args) {
		PermanentEmp pe= new PermanentEmp(0012,"Ram",17,30000.00);
		System.out.println("permanent employee detail");
		/* calling id,name,no of leaves */
		System.out.println("Id  =" + pe.empId);
		System.out.println("name =" + pe.empName);
		System.out.println("leave =" + pe.TotalLeaves);
		/* calling method */
		pe.calculate_balanceLeaves();
		pe.avail_leave(17, (char)0);
		pe.calculate_salary();
		System.out.println("..................................");

		
		TemporaryEmp te= new TemporaryEmp(5643,"Neha",17,25000.00);
		System.out.println("Temprory employee detail");
		/* calling id,name,no of leaves */
		System.out.println("Id  =" + te.empId);
		System.out.println("name =" + te.empName);
		System.out.println("leave =" + te.TotalLeaves);
		/* calling method */
		te.calculate_balanceLeaves();
		te.avail_leave(17, (char)0);
		te.calculate_salary();

	}

}
