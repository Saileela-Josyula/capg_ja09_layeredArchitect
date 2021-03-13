package com.capg.empapp.service;

import com.capg.empapp.dao.EmployeeDAOImpl;
import com.capg.empapp.dao.IEmployeeDAO;
import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.exceptions.InvalidEmployeeIdException;
import com.capg.empapp.exceptions.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {
   // Animal a = new Dog();
	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {
		
			//System.out.println(" ------------>> inside service "+e);
		
			if(e.getSalary()> 50000)
			{
				throw new WrongSalaryException();
			}
			else return dao.addEmployee(e);		
		
	}

	public Employee[] getAllEmployees() {

		return dao.getAllEmployees();
	}
	
	
	// ================================================================================

	public boolean editSalaryByEmployeeId(int id,int empNewSalary) throws InvalidEmployeeIdException {
		if(!dao.editSalaryByEmployeeId(id,empNewSalary))
		{
			throw new InvalidEmployeeIdException();
		}
		else return dao.editSalaryByEmployeeId(id,empNewSalary);
	}

	public boolean editExpByEmployeeId(int id,int empNewExp) throws InvalidEmployeeIdException {
		if(!dao.editExpByEmployeeId(id,empNewExp))
		{
			throw new InvalidEmployeeIdException();
		}
		else return dao.editExpByEmployeeId(id,empNewExp);
	}

	public Employee[] getEmployeeBySalary(int salary) {
		
		return dao.getEmployeeBySalary(salary);
	}

	public Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		
		return dao.getEmployeesBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

}