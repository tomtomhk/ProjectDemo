package testDaysMonthV1;

import static org.junit.Assert.*;
import org.junit.Test;

import daysmonthV1.*;

public class TestDaysMonthV1 {
	
	// Add your answer to the four test cases for Q1
	@Test
	public void testQ1_1(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(3, 0);
		assertEquals(-1, result);
	}
	
	@Test
	public void testQ1_2(){	
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(5, 2);
		assertEquals(31, result);
	}
	
	@Test
	public void testQ1_3(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(6, 4);
		assertEquals(30, result);
	}
	
	@Test
	public void testQ1_4(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(20, 7);
		assertEquals(-2, result);
	}
	
	// Add your answer to the two test cases for Q2
	@Test
	public void testQ2_1(){
		class StubLeapYearV1 extends LeapYearV1 {
			//Overwrite the class functions
			public boolean isLeapYear(int year){
				boolean leap;
				//Write your own code here to manipulate the variable leap.
				if(year == 2004)//This is an example of test sub.
					leap = true;
				else
					leap = false;
				return leap;
			}
		}
		StubLeapYearV1 stubLeapYearV1 = new StubLeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(stubLeapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(2, 2004);
		assertEquals(29, result);
	}
	
	@Test
	public void testQ2_2(){
		class StubLeapYearV1 extends LeapYearV1 {
			//Overwrite the class functions
			public boolean isLeapYear(int year){
				boolean leap;
				//Write your own code here to manipulate the variable leap.
				if(year == 2004)//This is an example of test sub.
					leap = true;
				else
					leap = false;
				return leap;
			}
		}
		StubLeapYearV1 stubLeapYearV1 = new StubLeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(stubLeapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(2, 2005);
		assertEquals(28, result);
	}
	
	// Add your answer to the two test cases for Q3
	@Test
	public void testQ3_1(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(2, 2008);
		assertEquals(29, result);	
	}
	
	@Test
	public void testQ3_2(){
		LeapYearV1 leapYearV1 = new LeapYearV1();
		DaysNuminMonthV1 daysNuminMonthV1 = new DaysNuminMonthV1(leapYearV1);
		int result = daysNuminMonthV1.getDaysNuminMonth(2, 2003);
		assertEquals(28, result);	
	}
}
