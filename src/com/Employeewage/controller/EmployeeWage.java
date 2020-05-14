package com.Employeewage.controller;
import com.Employeewage.model.Employee;

interface Icontroller{
       	void EmployeeAttendance(String a);
	//int dailyWage(int b);
}
class EmployeeWage implements Icontroller{

	public void EmployeeAttendance(String a){
		int isPresent =1;

		double empCheck = Math.floor(Math.random()*10)%2;
		if (empCheck == isPresent){
			int dailywage=8*20;
			System.out.println(a+" Employee is present daily wage ="+dailywage);
			
		}
		else{
			System.out.println(a+" Employee is absent");
		
		}
		
	}
	/*public int dailyWage(int b){
		if(EmployeeAttendance(String a)==1){
			int wage=8*20;
		}
		else{
			System.out.println("employee is absent");
		}
	}*/
	public static void main(String[] args){
		System.out.println("welcome to employee Wage calculation program");
		Employee emp = new Employee();
		emp.setName("john");
		Icontroller ic = new EmployeeWage();
       		ic.EmployeeAttendance(emp.getName());
		//ic.dailyWage(EmployeeAttendance(emp.getName()));
		//System.out.println("daily wage="+wage);

		//System.out.println(emp.getName());
	}
}
