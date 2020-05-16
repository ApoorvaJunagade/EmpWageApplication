package com.Employeewage.controller;
import com.Employeewage.model.Employee;
import com.Employeewage.controller.Icontroller;
import com.Employeewage.controller.EmployeeWage;

public class Test{
	public static void main(String[] args){
                System.out.println("welcome to employee Wage calculation program");
                Employee emp = new Employee();
                emp.setName("john");
		Icontroller ic = new EmployeeWage();
		int total=ic.computeEmpWage();
		System.out.println("total salary="+total);
	}
}


