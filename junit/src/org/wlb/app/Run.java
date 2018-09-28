package org.wlb.app;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Run extends Demo2
{
         @BeforeClass
         public  static void before()
         {
        	 System.out.println("before");
         
         }
         @Test
	     public void test()
	     {
        	 
	    	 assertEquals(2,d.sub(4, 2));
	    	 
	    	 System.out.println("tested");
	     }
         
         @Test
	     public  void test12()
	     {
        	 
	    	 assertEquals(2,d.sub(4, 2));
	    	 
	    	 System.out.println("tested2");
	     }
         
         @AfterClass
         public static void after()
         {
        	 System.out.println("after");
         }
}
