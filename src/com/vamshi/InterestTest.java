/*
 * @author KUSA VAMSHI
 * 
 */

/*
 * This is the unit test case to verify simple interest and compound interest
 * Inputs are principal amount,duration i.e, no of years,rate of interest
 * 
 */
package com.vamshi;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class InterestTest {
	@Test
	void testSimpleInterest() {
		Interest i = new Interest(20202, 3, 3);
		assertEquals(1818.18, i.simpleInterest());
	}
	@Test
	void testCompoundInterest() {
		Interest j = new Interest(20202, 0, 5);
		assertEquals(0, j.simpleInterest());
    }
}
