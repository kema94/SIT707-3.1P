package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "223188749";
		Assert.assertNotNull("Student ID is ", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "KEMA SANKA SRINATH DISSANAYAKE GARUSINGHE ARACHCHIGE";
		Assert.assertNotNull("Student name is ", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("January1ShouldIncrementToJanuary2 > " + date);
		date.increment();
	    System.out.println(date);	
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("January1ShouldDecrementToDecember31 > " + date);
		date.decrement();
	    System.out.println(date);	
	}
	
	//test cases for February with a leap year condition.
	
	@Test
	public void testMinMarch1ShouldIncrementToMarch2() {
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("January1ShouldIncrementToJanuary2 > " + date);
		date.increment();
	    System.out.println(date);	
	}
	
	@Test
	public void testMinMarch1ShouldDecrementToFebruary() {
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("January1ShouldDecrementToDecember31 > " + date);
		date.decrement();
	    System.out.println(date);	
	}
	
	
	//Green Table test cases
	
	//1A
	@Test
	public void testCaseOneA() {
		DateUtil date = new DateUtil(1, 6, 1994);
		System.out.println("1A > " + date);
		date.decrement();
	    System.out.println(date);	
	}
	//2A
	@Test
	public void testCaseTwoA() {
		DateUtil date = new DateUtil(2, 6, 1994);
		System.out.println("2A > " + date);
		date.decrement();
	    System.out.println(date);	
	}
	//3A
	@Test
	public void testCaseThreeA() {
		DateUtil date = new DateUtil(15, 6, 1994);
		System.out.println("3A > " + date);
		date.decrement();
	    System.out.println(date);	
	}
	//4A
		@Test
		public void testCaseFourA() {
			DateUtil date = new DateUtil(30, 6, 1994);
			System.out.println("4A > " + date);
			date.decrement();
		    System.out.println(date);	
		}
	//5A
	@Test
	    public void testCaseFiveA() {
		    DateUtil date = new DateUtil(31, 6, 1994);
			System.out.println("5A > " + date);
			date.decrement();
			System.out.println(date);	
		}
	//6A
		@Test
		    public void testCaseSixA() {
			    DateUtil date = new DateUtil(15, 1, 1994);
				System.out.println("6A > " + date);
				date.decrement();
				System.out.println(date);	
			}
	//7A
        @Test
		    public void testCaseSevenA() {
			    DateUtil date = new DateUtil(15, 2, 1994);
				System.out.println("7A > " + date);
				date.decrement();
				System.out.println(date);	
			}
    //8A
        @Test
		    public void testCaseEightA() {
			    DateUtil date = new DateUtil(15, 11, 1994);
				System.out.println("8A > " + date);
				date.decrement();
				System.out.println(date);	
			} 
    //9A
        @Test
		    public void testCaseNineA() {
			    DateUtil date = new DateUtil(15, 12, 1994);
				System.out.println("(9A > " + date);
				date.decrement();
				System.out.println(date);	
			} 
    //10A
        @Test
		    public void testCaseTenA() {
			    DateUtil date = new DateUtil(15, 6, 1700);
				System.out.println("10A > " + date);
				date.decrement();
				System.out.println(date);	
			} 
    //11A
        @Test
		    public void testCaseElevenA() {
			    DateUtil date = new DateUtil(15, 6, 1701);
				System.out.println("11A > " + date);
				date.decrement();
				System.out.println(date);	
			}
     //12A
        @Test
		    public void testCaseTwelveA() {
			    DateUtil date = new DateUtil(15, 6, 2023);
				System.out.println("12A > " + date);
				date.decrement();
				System.out.println(date);	
			} 
      //13A
        @Test
		    public void testCaseThirteenA() {
			    DateUtil date = new DateUtil(15, 6, 2024);
				System.out.println("13A > " + date);
				date.decrement();
				System.out.println(date);	
			} 
	//Orange Table test cases
	
	//1B test case 
	@Test
	public void testMaxMay1ShouldIncrementToMay2() {
		DateUtil date = new DateUtil(1, 6, 1994);
		System.out.println("MaxMay1ShouldIncrementToMay2 > " + date);
		date.increment();
	    System.out.println(date);	
	}
	
	//2B test case 
	@Test
	public void testMaxMay2ShouldIncrementToMay3() {
		DateUtil date = new DateUtil(2, 6, 1994);
		System.out.println("MaxMay2ShouldIncrementToMay3 > " + date);
		date.increment();
	    System.out.println(date);	
	}
	
	//13B test case 
	@Test
	public void testMaxMay15ShouldIncrementToMay16() {
		DateUtil date = new DateUtil(15, 6, 2024);
		System.out.println("MaxMay6ShouldIncrementToMay15 > " + date);
		date.increment();
	    System.out.println(date);	
	}
	
	//for leap year testing test cases
	
	@Test
	public void testMaxFeb29ShouldDecrementToMarch1_A() {
		DateUtil date = new DateUtil(29, 2, 2024);
		System.out.println("Feb29ShouldDecrementToMarch1_A > " + date);
		date.increment();
	    System.out.println(date);	
	}
	
	@Test
	public void testMaxFeb29ShouldDecrementToMarch1_B() {
		DateUtil date = new DateUtil(28, 2, 2023);
		System.out.println("Feb29ShouldDecrementToMarch1_B > " + date);
		date.increment();
	    System.out.println(date);	
	}
	
}
