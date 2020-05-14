package com.Employeewage.controller;
import com.Employeewage.model.Employee;

interface Icontroller{
       	boolean EmployeeAttendance();
	void isPartTime(String a);
}
class EmployeeWage implements Icontroller{

	public boolean EmployeeAttendance(){
		int isPresent =1;

		double empcheck = Math.floor(Math.random()*10)%2;
		if (empcheck == isPresent){
			return true;
		}
		else{
			return false;
		}
	}
	 public void isPartTime(String a){
                int isPartTime =1;

                double empCheck = Math.floor(Math.random()*10)%2;
                if (empCheck == isPartTime){
                        int dailywage=4*20;
                        System.out.println(a+" Employee is Part time daily wage="+dailywage);
                }
                else{
			int dailywage=8*20;
                        System.out.println(a+" full time daily wage="+dailywage);
                }
        }
	public static void main(String[] args){
		System.out.println("welcome to employee Wage calculation program");
		Employee emp = new Employee();
		emp.setName("john");
		Icontroller ic = new EmployeeWage();
		boolean a=ic.EmployeeAttendance();
		if(a==true)
			ic.isPartTime(emp.getName());
		else
			System.out.println("employee is absent");

	}

}
