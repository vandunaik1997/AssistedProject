package DifferentMethodOfDifferentReturnType4;
class Employee{
	int EmpId;
	String EmpName;
	double Salary;
	int empIdInf() 
	{
	return EmpId;	
	}
	String empNameInf() 
	{
	return EmpName;	
	}
	double empSalaryInf() 
	{
	return Salary;	
	}
	}
public class DifferentMethodOfDifferentReturnType4 {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.EmpId=123456;
		emp.EmpName="Vandana";
		emp.Salary=35000;
		System.out.println(emp.empIdInf());
		System.out.println(emp.empNameInf());
		System.out.println(emp.empSalaryInf());	

	}

}
