package org.wlb.app;

public class Employee2 
{
private Employeee employee;

public Employee2(Employeee employee)

{
	
this.employee=employee;
}
public boolean employee(int id,String name){
	 boolean emp;
     emp = Employeee.employeee(id, name);
     return emp;
}
}
