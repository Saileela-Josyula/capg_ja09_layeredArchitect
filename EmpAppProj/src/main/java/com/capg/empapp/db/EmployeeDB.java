package com.capg.empapp.db;

import com.capg.empapp.dto.Employee;

public class EmployeeDB {
	// Employee cannot be resolved to a type
	public static Employee employees[]  = new Employee[100];
	public static Employee salary[]=new Employee[100];
	public static Employee salaryRange[]=new Employee[100];
	
	
	public static int count = 0;
	
	static {
		
		employees[count++] = 	new Employee(101, "ramesh", 8, 7000);
		employees[count++] = 	new Employee(101, "suresh", 2, 7000);
		employees[count++] = 	new Employee(101, "rakesh", 1, 7000);
		employees[count++] = 	new Employee(101, "lokesh", 5, 7000);
		
		}
		
		
	public static boolean addEmployee(Employee e)
	{
		
		employees[count++] = e;
	
		return true;
	}
	
	public static int getCount()
	{
		return count;
	}
	public static Employee[] getEmployeeBySalary(int sal) 
	{
		int j=0;
		for(int i=0;i<count;i++)
		{
			if(employees[i].getSalary()==sal) {
				salary[j]=employees[i];
				j=j+1;
			}
		}
		return salary;
	}
	public static Employee[] getEmployeesBySalaryRange(int salRanMin, int salRanMax) {
		int j=0;
		for(int i=0;i<count;i++) {
			if(employees[i].getSalary()>=salRanMin && employees[i].getSalary()<=salRanMax)
			{
				salaryRange[j]=employees[i];
			j=j+1;
			
	
			}
		}
		
		return salaryRange;
	}
	public static boolean editSalaryByEmployeeID(int id,int empNewSalary){
		for(int i=0;i<count;i++) {
			if(employees[i].getEmployeeId()==id) {
				employees[i].setSalary(empNewSalary);
				return true;
			}
		}
		return false;
	}
	public static boolean editExpByEmployeeId(int id,int empNewExp){
		for(int i=0;i<count;i++) {
			if(employees[i].getEmployeeId()==id) {
				employees[i].setExp(empNewExp);
				return true;
			}
		}
		return false;
	}

}
