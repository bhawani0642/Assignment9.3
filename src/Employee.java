
public class Employee {
 int empId;
 String empName;
 int TotalLeaves;
 double TotalSalary;
public Employee(int empId, String empName, int totalLeaves, double totalSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	TotalLeaves = totalLeaves;
	TotalSalary = totalSalary;
	}
void  calculate_balanceLeaves(){
}
boolean avail_leave(int no_of_leaves, char type_of_leave){
	return true;
}
void calculate_salary(){
	
}
}
class PermanentEmp extends Employee{
	

double basic,hra,pfa;

	public PermanentEmp(int empId, String empName, int totalLeaves, double totalSalary) {
		super(empId, empName, totalLeaves, totalSalary);
		
	}
	int paid_leave=5,sick_leave=4,casual_leave=8;
	void print_leave_details() {
		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
	}
	@Override
	void calculate_balanceLeaves() {
		
		int balanceTotal=TotalLeaves-(paid_leave+sick_leave+casual_leave);
		System.out.println("Total leaves left= "+balanceTotal);
		}
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if( no_of_leaves< TotalLeaves){
			return true;
		}else{
			return false;
		}
		
	}
	@Override
	void calculate_salary() {
		double hra=0.5f* basic;
		double da= .2f * basic;
		double totalSalary = TotalSalary + (hra + da) - pfa;
		System.out.println("Salary of the employee is = "+ totalSalary);
	}
	
}

class TemporaryEmp extends Employee{
	double basic,hra,pfa;

	public TemporaryEmp(int empId, String empName, int totalLeaves, double totalSalary) {
		super(empId, empName, totalLeaves, totalSalary);
		
	}
	int paid_leave=5,sick_leave=4,casual_leave=8;
	void print_leave_details() {
		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
	
	}
	@Override
	void calculate_balanceLeaves() {
		
		int balanceTotal=TotalLeaves-(paid_leave+sick_leave+casual_leave);
		System.out.println("Total leaves left= "+balanceTotal);
		}
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if( no_of_leaves< TotalLeaves){
			return true;
		}else{
			return false;
		}
		
		}
	@Override
	void calculate_salary() {
		double hra=0.5f* basic;
		double da= .2f * basic;
		double totalSalary = TotalSalary + (hra + da) - pfa;
		System.out.println("Salary of the employee is = "+ totalSalary);
	}
}

