package com.Employeewage.controller;
import com.Employeewage.model.Employee;

interface Icontroller{
       void EmployeeAttendance(String a);
}
class EmployeeWage implements Icontroller{

	public void EmployeeAttendance(String a){
		int isPresent =1;
		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == isPresent){
			System.out.println(a+" Employee is present");
		}
		else{
			System.out.println(a+" Employee is absent");
		}
	}

	public static void main(String[] args){
		System.out.println("welcome to employee Wage calculation program");
		Employee emp = new Employee();
		emp.setName("john");
		Icontroller ic = new EmployeeWage();
       		ic.EmployeeAttendance(emp.getName());
		//System.out.println(emp.getName());
	}
}
