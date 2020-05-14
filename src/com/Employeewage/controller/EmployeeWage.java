package com.Employeewage.controller;
import com.Employeewage.model.Employee;

interface Icontroller{
       	boolean EmployeeAttendance();
	int isPartTime(String a);
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
	public static void main(String[] args){
		System.out.println("welcome to employee Wage calculation program");
		Employee emp = new Employee();
		emp.setName("john");
		int hrs=0;
		int i=0;
		while( i<20 && hrs<100){
			Icontroller ic = new EmployeeWage();
			boolean a=ic.EmployeeAttendance();
			if(a==true){
				  i=i+1;
				  hrs=hrs+ic.isPartTime(emp.getName());
			}
			else{
				System.out.println("employee is absent");
			}
		}System.out.println("total salary="+i*hrs);
	}

}
