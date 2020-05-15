package com.Employeewage.controller;
import com.Employeewage.model.Employee;
import com.Employeewage.controller.Icontroller;
import com.Employeewage.controller.EmployeeWage;

public class Test{
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
			
		}System.out.println("total salary="+i*hrs);
	}
}

	

