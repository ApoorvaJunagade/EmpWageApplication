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
	 public int isPartTime(){
                int isPartTime =1;
		int dailywage;
		int hrs;
                double empCheck = Math.floor(Math.random()*10)%2;
                if (empCheck == isPartTime){
			hrs=4;
                        dailywage=hrs*20;
                        System.out.println(" Employee is Part time, working hrs="+hrs+" daily wage="+dailywage);
                }
                else{	
			hrs=8;
			dailywage=hrs*20;
                        System.out.println(" employee is full time, working hrs="+hrs+" daily wage="+dailywage);
                }
		return hrs;
        }
        public int computeEmpWage(){
		int totalHrs=0;
		int totalDays=0;
		while(totalHrs<=100 && totalDays<=20){
			System.out.println("Day#: " +totalDays);
			totalDays++;
			if(EmployeeAttendance()){
				//totalDays++;
				totalHrs+=isPartTime();
				}
			else{
				System.out.println("employee is absent");
			}
		}
		//System.out.println("Day#: " +totalDays);
		int total= totalHrs*20;
		return total;
    	}
}
