package com.epam.week55;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import com.epam.week55.SCILogging;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SCILoggingTest 
{
    /**
     * Rigorous Test :-)
     */
SCILogging i=new SCILogging();
	
	@Test
	public void check_simple_interests()
	{
		assertEquals(115000.0,i.simple_interest(100000,5,23),0.0);
		assertEquals(38400.0,i.simple_interest(20000,6,32),0.0);
		assertEquals(90000.0,i.simple_interest(50000,9,20),0.0);
	}
	@Test
	public void check_compound_interest()
	{
		assertEquals(20281.977629563662,i.compound_interest(32000,2.2,25),0.0);
		assertEquals(74970.0,i.compound_interest(68000,2,45),0.0);
		assertEquals(571368.7350000001,i.compound_interest(545000,3,27),0.0);
		
	}
    
}

