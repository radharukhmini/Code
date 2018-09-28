package org.wlb.app;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
private int eid;
private String employeeName;
private double empSal;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getEmpSal() {
	return empSal;
}
public void setEmpSal(double empSal) {
	this.empSal = empSal;
}
}
