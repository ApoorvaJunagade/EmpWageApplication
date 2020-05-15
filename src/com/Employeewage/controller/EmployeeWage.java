package com.Employeewage.controller;
import com.Employeewage.model.Employee;
import com.Employeewage.controller.Icontroller;
public class EmployeeWage implements Icontroller{

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
	 public int isPartTime(String a){
                int isPartTime =1;
		int dailywage;
		int hrs;
                double empCheck = Math.floor(Math.random()*10)%2;
                if (empCheck == isPartTime){
			hrs=4;
                        dailywage=hrs*20;
                        System.out.println(a+" Employee is Part time daily wage="+dailywage);
                }
                else{   hrs=8;
			dailywage=hrs*20;
                        System.out.println(a+" employee is full time daily wage="+dailywage);
                }
		return hrs;
        }
	

}
