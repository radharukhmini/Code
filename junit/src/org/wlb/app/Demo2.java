package org.wlb.app;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
public class Demo2 
{
	static   Demo d=new Demo();
    @BeforeClass
    public  static void beforesp()
    {
   	 System.out.println("beforesp");
    }
    @Test
    public void testsp()
    {
   	 
   	 assertEquals(2,d.sub(4, 2));
   	 
   	 System.out.println("testedsp");
    }
    
    @Test
    public  void test12sp()
    {
   	 
   	 assertEquals(2,d.sub(4, 2));
   	 
   	 System.out.println("tested2sp");
    }
    
    @AfterClass
    public static void aftersp()
    {
   	 System.out.println("aftersp");
    }
}
