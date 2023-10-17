package manytoone.controller;

import java.util.ArrayList;
import java.util.List;

import manytoone.dao.CompanyDao;
import manytoone.dao.EmployeeDao;
import manytoone.dto.Company;
import manytoone.dto.Employee;

public class CompanyEmployeeCont {
public static void main(String[] args) {
//	Company company=new Company();
//	company.setId(2);
//	company.setName("Tyss");
//	
//	
//	
//	Employee employee1=new Employee();
//	employee1.setId(3);
//	employee1.setName("vikas");
//	employee1.setAddress("delhi");
//	employee1.setCompany(company);
//	
//	Employee employee2=new Employee();
//	employee2.setId(4);
//	employee2.setName("manisha");
//	employee2.setAddress("AP");
//	employee2.setCompany(company);
//	
//	List<Employee> employees=new ArrayList<Employee>();
//	employees.add(employee1);
//	employees.add(employee2);
//	
//	CompanyDao companyDao=new CompanyDao();
//	EmployeeDao employeeDao=new EmployeeDao();
//	
//	companyDao.saveCompany(company);
//	employeeDao.saveEmployee(employees);
	
	
	CompanyDao companyDao=new CompanyDao();
	EmployeeDao employeeDao=new EmployeeDao();	
	
//	Company is a non owning side
//	Company company=new Company();
//	company.setName("infosyspvtltd");
//	
//	companyDao.updateCompany(1, company);
//	
	Employee employee=new Employee();
	employee.setName("SHALINIIIIII");
	employee.setAddress("Kerala");
	employeeDao.updateEmployee(1, employee);
	
	
	
	
	
	
}
}
