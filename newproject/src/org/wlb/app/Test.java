package org.wlb.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test
{
public static void main(String[] args) 
{
Configuration cfg=new Configuration();
cfg.configure("web.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session ses=sf.openSession();
Transaction tr=ses.beginTransaction();
Employee emp=new Employee();
emp.setEid(1);
emp.setEmployeeName("radha");
emp.setEmpSal(10);
ses.save(emp);
tr.commit();
ses.close();

}
}
