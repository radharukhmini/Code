package org.wlb.app;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class) 
public class Test 
{
private int firstNumber;
private int secNumber;
private int expected;
private Add add;

public Test(int firstNumber, int secNumber, int expected) {
	super();
	this.firstNumber = firstNumber;
	this.secNumber = secNumber;
	this.expected = expected;

}
@Before
public void run()
{
add=new Add();
}
@Parameterized.Parameters
public static Collection input()
{
	return Arrays.asList(new Object[][] {{1,2,3},{11,22,33},{3,4,7},{6,7,13}});
}
@org.junit.Test
public void test()
{
System.out.println("sum of numbes=:"+expected);	
assertEquals(expected,Add.add(firstNumber,secNumber));


}
}
