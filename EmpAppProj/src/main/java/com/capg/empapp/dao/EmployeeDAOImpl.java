package com.capg.empapp.dao;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIdException;
import com.capg.empapp.exceptions.WrongSalaryException;

public class EmployeeDAOImpl implements IEmployeeDAO {

	public boolean addEmployee(Employee e) throws WrongSalaryException{
         // SQL  insert into employee ...... 
		
		//System.out.println(" =====>> DAO Impl employee "+e);
		return EmployeeDB.addEmployee(e);
	}

	public Employee[] getAllEmployees() {

		return EmployeeDB.employees;
	}
	
	//============================================================
	
	
	public boolean editSalaryByEmployeeId(int id,int empNewSalary) throws InvalidEmployeeIdException {
		return EmployeeDB.editSalaryByEmployeeID(id,empNewSalary);
	}

	public boolean editExpByEmployeeId(int id,int empNewExp) throws InvalidEmployeeIdException {
		return EmployeeDB.editExpByEmployeeId(id,empNewExp);
	}

	

	public Employee[] getEmployeeBySalary(int salary) {
		return EmployeeDB.getEmployeeBySalary(salary);
	}

	public Employee[] getEmployeesBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		return EmployeeDB.getEmployeesBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

}
